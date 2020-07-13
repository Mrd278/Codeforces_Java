import numpy as np

t = int(input())
for i in range(t):
    n,m = map(int, input().split())
    f = list(map(int, input().split()))
    p = list(map(int, input().split()))
    cost = np.zeros(m)
    for j in range(m):
        if (j+1) not in f:
            cost[j] = -1
    #print(cost)
    for j in range(n):
        if cost[f[j]-1] >= 0:
            cost[f[j]-1] = cost[f[j]-1] + p[j]
    #print(cost)
    cost.sort()
    #print(cost)
    for j in range(m):
        if cost[j] >= 0:
            print(int(cost[j]))
            break
