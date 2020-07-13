for i in range(int(input())):
    n = int(input())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))

    A_1 = []
    A_1.append(A[0])
    c = 0
    for j in range(1,n):
        A_1.append(A[j] - A[j-1])
    
    for j in range(n):
        if A_1[j] >= B[j]:
            c = c + 1
    print(c)
        
