for _ in range(int(input())):
    n = int(input())
    x = input()
    j = -1
    k = -1
    for i in range(len(x)):
        if x[i] == '1' and j == -1:
            j = i
        if x[i] == '0':
            k = i
    if k == -1 or j == -1 or k < j:
        print(x)
    else:
        x = x[:j] + x[k:]
        print(x)
