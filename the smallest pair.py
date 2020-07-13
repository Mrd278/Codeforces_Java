for _ in range(int(input())):
    n=int(input())
    x=list(map(int,input().split()))
    x.sort()
    print(x[0]+x[1])
