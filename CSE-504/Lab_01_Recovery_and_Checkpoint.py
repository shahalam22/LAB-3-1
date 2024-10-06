file = open("Lab_01.txt", 'r')

def isUnique(transactions, value):
    for i in range(len(transactions)):
        if transactions[i] == value:
            return False
    return True

commands = []
transactions = []
redo_transactions = []
undo_transactions = []
data_points = []

started_transactions = []
committed_transactions = []
changed_transactions = []

ckpt_flag = False

for line in file:
    values = line.strip().split()
    commands.append(values)
file.close()

for command in reversed(commands):
    if command[0] == "START":
        if(ckpt_flag == False and isUnique(started_transactions, command[1])):
            started_transactions.append(command[1])
            transactions.append(command[1])
    elif command[0] == "COMMIT":
        if(ckpt_flag == False and isUnique(committed_transactions, command[1])):
            committed_transactions.append(command[1])
    elif command[0] == "CKPT":
        ckpt_flag = True
        for i in range(1, len(command)):
            transactions.append(command[i])
        # print(transactions)
    elif command[0] == "ENDCKPT":
        pass
    else:
        if(ckpt_flag == False and isUnique(changed_transactions, command[0]) and isUnique(committed_transactions, command[0])):
            changed_transactions.append(command[0])
        
        if(isUnique(data_points, command[1])):
            data_points.append(command[1])

# print("Data Points: ", sorted(data_points))

# REDO values insertion
for i in range(len(committed_transactions)):
    for command in reversed(commands):
        if(command[0] == committed_transactions[i]):
            redo_transactions.append(command)
            break

# UNDO values insertion
for i in range(len(transactions)):
    if isUnique(committed_transactions, transactions[i]):
        for command in reversed(commands):
            if(command[0] == transactions[i]):
                undo_transactions.append(command)
                break

print("REDO Transactions: ")
for i in range(len(redo_transactions)):
    print(redo_transactions[i][0])

print("\nUNDO Transactions: ")
for i in range(len(undo_transactions)):
    print(undo_transactions[i][0])

undo_redo_values = []

for i in range(len(data_points)):
    undo_redo_values.append([data_points[i], "-", "-"])

for i in range(len(undo_transactions)):
    for j in range(len(undo_redo_values)):
        if undo_transactions[i][1] == undo_redo_values[j][0]:
            undo_redo_values[j][1] = undo_transactions[i][2]

for i in range(len(redo_transactions)):
    for j in range(len(undo_redo_values)):
        if redo_transactions[i][1] == undo_redo_values[j][0]:
            undo_redo_values[j][2] = redo_transactions[i][2]

print("\nUndo Redo Values")
sorted_undo_redo_values = sorted(undo_redo_values, key=lambda x: x[0])

print("Data Point", "\t", "Undo Value", "\t", "Redo Value")
for i in range(len(sorted_undo_redo_values)):
    print(sorted_undo_redo_values[i][0], "\t\t", sorted_undo_redo_values[i][1], "\t\t", sorted_undo_redo_values[i][2])