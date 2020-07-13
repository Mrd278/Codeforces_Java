n = int(input())
r = [100, 50, 10, 5, 2, 1]
for i in range(n):
    n = int(input())
    c = 0
    for j in r:
        if j <= n:
            c += int(n/j)
            n = n%j
    print(c)
