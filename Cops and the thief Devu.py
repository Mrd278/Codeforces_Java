# Cops And The Thief Devu

import numpy as np

T = int(input())
for i in range(T):
    d = np.zeros(100)
    M, x, y = list(map(int, input().split()))
    k = list(input().split())
    for j in k:
        if x*y >= int(j) and (x*y + int(j)) <= 100:
            for l in range(int(j) + x*y):
                d[l] = 1
        elif x*y <= int(j) and (x*y + int(j)) <= 100:
            for l in range(int(j) - x*y - 1, int(j) + x*y):
                d[l] = 1
        elif x*y <= int(j) and (x*y + int(j)) >= 100:
            for l in range(int(j) - x*y - 1, 100):
                d[l] = 1
        elif x*y >= int(j) and (x*y + int(j)) >= 100:
            for l in range(100):
                d[l] = 1
    c = 0
    for i in range(100):
        if d[i] == 0:
            c += 1
    print(c)
