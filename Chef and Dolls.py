for i in range(int(input())):
    n = int(input())
    A = []
    for k in range(n):
        A.append(int(input()))
    for j in A:
        if A.count(j)%2 != 0:
            print(j)
            break
