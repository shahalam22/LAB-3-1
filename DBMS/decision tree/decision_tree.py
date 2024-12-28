import numpy as np
import pandas as pd
from collections import Counter

# Calculate entropy
def calculate_entropy(y):
    class_counts = Counter(y)
    total_samples = len(y)
    entropy = 0.0
    for count in class_counts.values():
        probability = count / total_samples
        entropy -= probability * np.log2(probability)
    return entropy

# Split dataset based on an attribute and a threshold
def split_dataset(X, y, feature_index, threshold):
    left_indices = [i for i in range(len(X)) if X[i][feature_index] <= threshold]
    right_indices = [i for i in range(len(X)) if X[i][feature_index] > threshold]
    return left_indices, right_indices

# Calculate information gain
def information_gain(X, y, feature_index, threshold):
    parent_entropy = calculate_entropy(y)
    left_indices, right_indices = split_dataset(X, y, feature_index, threshold)
    if len(left_indices) == 0 or len(right_indices) == 0:
        return 0
    n = len(y)
    n_left, n_right = len(left_indices), len(right_indices)
    left_entropy = calculate_entropy([y[i] for i in left_indices])
    right_entropy = calculate_entropy([y[i] for i in right_indices])
    weighted_entropy = (n_left / n) * left_entropy + (n_right / n) * right_entropy
    return parent_entropy - weighted_entropy

# Find the best split
def find_best_split(X, y):
    best_feature_index = None
    best_threshold = None
    best_gain = -1
    n_features = len(X[0])
    for feature_index in range(n_features):
        thresholds = set(row[feature_index] for row in X)
        for threshold in thresholds:
            gain = information_gain(X, y, feature_index, threshold)
            if gain > best_gain:
                best_gain = gain
                best_feature_index = feature_index
                best_threshold = threshold
    return best_feature_index, best_threshold, best_gain

# Node class for the decision tree
class Node:
    def __init__(self, feature_index=None, threshold=None, left=None, right=None, value=None):
        self.feature_index = feature_index
        self.threshold = threshold
        self.left = left
        self.right = right
        self.value = value

# Build the decision tree
def build_tree(X, y, depth=0, max_depth=10):
    if len(set(y)) == 1 or depth == max_depth:
        most_common_label = Counter(y).most_common(1)[0][0]
        return Node(value=most_common_label)
    feature_index, threshold, gain = find_best_split(X, y)
    if gain == 0:
        most_common_label = Counter(y).most_common(1)[0][0]
        return Node(value=most_common_label)
    left_indices, right_indices = split_dataset(X, y, feature_index, threshold)
    left_subtree = build_tree([X[i] for i in left_indices], [y[i] for i in left_indices], depth + 1, max_depth)
    right_subtree = build_tree([X[i] for i in right_indices], [y[i] for i in right_indices], depth + 1, max_depth)
    return Node(feature_index=feature_index, threshold=threshold, left=left_subtree, right=right_subtree)

# Predict a single instance
def predict_instance(node, instance):
    if node.value is not None:
        return node.value
    if instance[node.feature_index] <= node.threshold:
        return predict_instance(node.left, instance)
    else:
        return predict_instance(node.right, instance)

# Predict for a dataset
def predict(tree, X):
    return [predict_instance(tree, instance) for instance in X]

# Load and preprocess dataset
def load_and_preprocess_data(filename):
    data = pd.read_csv(filename)

    # Separate features (X) and target labels (y)
    X = data.iloc[:, :-1].values  # All columns except the last one (features)
    y = data.iloc[:, -1].values   # The last column (target)

    # Map target labels to integers if they are categorical
    if isinstance(y[0], str):  # Only do this if the labels are strings (like in Iris)
        label_mapping = {label: idx for idx, label in enumerate(np.unique(y))}
        y = np.array([label_mapping[label] for label in y])

    # Shuffle dataset
    indices = np.arange(len(y))
    np.random.shuffle(indices)
    X = X[indices]
    y = y[indices]

    # Train-test split (80% train, 20% test)
    split_index = int(0.8 * len(y))
    X_train, X_test = X[:split_index], X[split_index:]
    y_train, y_test = y[:split_index], y[split_index:]

    return X_train, X_test, y_train, y_test

# Main function to run the decision tree
if __name__ == "__main__":
    # Load and preprocess the dataset (Iris or Heart Disease)
    X_train, X_test, y_train, y_test = load_and_preprocess_data("heart.csv")  # Change to "heart.csv" for Heart Disease dataset

    # Build the decision tree
    tree = build_tree(X_train.tolist(), y_train.tolist(), max_depth=3)

    # Make predictions on the test set
    predictions = predict(tree, X_test.tolist())

    # Calculate accuracy
    accuracy = sum(1 for true, pred in zip(y_test, predictions) if true == pred) / len(y_test)
    print(f"Accuracy: {accuracy * 100:.2f}%")
