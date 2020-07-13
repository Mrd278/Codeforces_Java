n=int(input())
for i in range(n):
    c=0
    a,b=input().split()
    a=int(a)
    b=int(b)
    x=list(map(int,input().split()))
    x=sorted(x)
    x.reverse()
    for p in range(a):
        if x[p]>=x[b-1]:
            c=int(c+1)
    print(c)
