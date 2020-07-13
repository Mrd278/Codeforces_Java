for t in range(int(input())):
    n, q = map(int, input().split())
    res = 0
    f = []
    d = []
    for i in range(q):
        x = []
        x = list(map(int, input().split()))
        f.append(x[0])
        d.append(x[1])

    res = res + f[0]
    for i in range(q-1):
        res = res + abs(f[i] - d[i])
        res = res + abs(d[i] - f[i+1])
    res = res + abs(f[len(f) - 1] - d[len(d) - 1])
    print(res)
