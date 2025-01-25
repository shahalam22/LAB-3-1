import csv
import random
import math
from collections import defaultdict

# Code is based on Gaussian Naive Bayes algorithm
# Load data 
def load_data(filename):
    data = []
    with open(filename, 'r') as file:
        csv_reader = csv.reader(file)
        headers = next(csv_reader)  # Skip the header
        for row in csv_reader:
            # Append the row as a list of floats (features) and the class label (species)
            data.append([float(row[0]), float(row[1]), float(row[2]), float(row[3]), row[4]])
    return data

# Split data into training and testing sets
def split_data(data, split_ratio=0.8):
    random.shuffle(data)  # Shuffle the data
    split_index = int(len(data) * split_ratio)
    train_data = data[:split_index]
    test_data = data[split_index:]
    return train_data, test_data

# Calculate mean and standard deviation of a list of numbers
def calculate_mean_std(values):
    mean = sum(values) / len(values)
    variance = sum((x - mean) ** 2 for x in values) / len(values)
    std_dev = variance ** 0.5
    return mean, std_dev

# Summarize dataset by class
def summarize_by_class(train_data):
    separated = defaultdict(list)
    for row in train_data:
        class_label = row[-1]  # The last column is the class label
        separated[class_label].append(row[:-1])  # Append features (excluding the label)
    
    summaries = {}
    for class_label, features in separated.items():
        # Calculate mean and std_dev for each feature in the class
        summaries[class_label] = [(calculate_mean_std(column)) for column in zip(*features)]
    return summaries

# Calculate Gaussian probability density function
def gaussian_probability(x, mean, std_dev):
    exponent = -((x - mean) ** 2) / (2 * (std_dev ** 2))
    return (1 / (math.sqrt(2 * math.pi) * std_dev)) * math.exp(exponent)

# Calculate class probabilities for a given row
def calculate_class_probabilities(summaries, row):
    probabilities = {}
    for class_label, class_summaries in summaries.items():
        probabilities[class_label] = 1  # Initialize with prior probability
        for i in range(len(class_summaries)):
            mean, std_dev = class_summaries[i]
            x = row[i]
            probabilities[class_label] *= gaussian_probability(x, mean, std_dev)
    return probabilities

# Predict the class for a given row
def predict(summaries, row):
    probabilities = calculate_class_probabilities(summaries, row)
    best_label, best_prob = None, -1
    for class_label, probability in probabilities.items():
        if best_label is None or probability > best_prob:
            best_label = class_label
            best_prob = probability
    return best_label

# Evaluate the Naive Bayes model
def evaluate(test_data, summaries):
    correct = 0
    for row in test_data:
        predicted_label = predict(summaries, row[:-1])
        true_label = row[-1]
        if predicted_label == true_label:
            correct += 1
    accuracy = (correct / len(test_data)) * 100
    return accuracy

# Main function
if __name__ == "__main__":
    # Load data
    filename = 'iris.csv'
    data = load_data(filename)
    
    # Split data into training and testing sets
    train_data, test_data = split_data(data, split_ratio=0.8)
    
    # Summarize the training data by class
    summaries = summarize_by_class(train_data)
    
    # Evaluate the model on the test data
    accuracy = evaluate(test_data, summaries)
    print(f"Accuracy: {accuracy:.2f}%")