numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"

n = int(input())
s = input()

required_length = 6 - n

if required_length < 0:
    required_length = 0

count = {1:0, 2:0, 3:0, 4:0}

for i in s:
    if count[1] == 0 and i in numbers:
        count[1] = 1
    if count[2] == 0 and i in lower_case:
        count[2] = 1
    if count[3] == 0 and i in upper_case:
        count[3] = 1
    if count[4] == 0 and i in special_characters:
        count[4] = 1

s = 0
for i in range(1,5):
    s += count[i]

answer = 4 - s

if required_length >= answer:
    print(required_length)
else:
    print(answer)