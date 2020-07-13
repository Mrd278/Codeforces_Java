import numpy as np

for t in range(int(input())):
    n, a = map(int, input().split())
    m = np.ones(n*n)*a
    m.resize(n,n)
    p = []
    for i in range(1,n+1):
        s = 1
        for j in range(2*i-1):
            s = s * a
        a = a * s
        p.append(s)
    res = sum(p) % (1e9 + 7)
    print(int(res))
