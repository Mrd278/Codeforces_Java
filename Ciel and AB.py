A, B = map(int, input().split())
result = A - B
if result % 10 != 9:
    print(result + 1)
else:
    print(result - 1)
