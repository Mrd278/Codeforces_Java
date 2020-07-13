from sys import stdin

for _ in range(int(stdin.readline())):
    n = int(stdin.readline())
    x = {}
    y = {}
    for i in range(4*n-1):
        temp = list(map(int, stdin.readline().split()))
        temp1 = temp[0]
        temp2 = temp[1]
        if temp1 in x:
            x[temp1] += 1
            x[temp1] %= 2
        else:
            x[temp1] = 1
        if temp2 in y:
            y[temp2] += 1
            y[temp2] %= 2
        else:
            y[temp2] = 1
    x = sorted(x.items(), key=lambda k: k[1], reverse=True)
    y = sorted(y.items(), key=lambda k: k[1], reverse=True)
    a = 0
    b = 0
    for i in x:
        a = i[0]
        break
    for i in y:
        b = i[0]
        break
    print(str(a) + " " + str(b))
        
