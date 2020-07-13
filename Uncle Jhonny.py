for i in range(int(input())):
    n = int(input())
    x = list(map(int, input().split()))
    k = int(input())
    uj = x[k - 1]
    x.sort()
    for j in range(n):
        if uj == x[j]:
            print(j + 1)
            break
