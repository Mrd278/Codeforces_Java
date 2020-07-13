import numpy as np

n, k = map(int, input().split())
record = np.zeros(n)
for i in range(k):
    s = input().split()
    if len(s) == 1:
        record = np.zeros(n)
    elif len(s) == 2:
        if record[int(s[1]) - 1] == 0:
            record[int(s[1]) - 1] = 1
        elif record[int(s[1]) - 1] == 1:
            record[int(s[1]) - 1] = 0
    print(int(sum(record)))
    
