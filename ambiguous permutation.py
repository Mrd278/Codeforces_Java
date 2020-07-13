while True:
    n=int(input())
    if n>0:
        x=list(map(int,input().split()))
        k=[0]*n
        for i in range(n):
            k[x[i]-1]=i+1
        if x==k:
            print("ambiguous")
        else:
            print("not ambiguous")
    else:
        break
