n=int(input())
for i in range(n):
    a=[]
    x,y=list(map(int,input().split()))
    x=int(x)
    y=int(y)
    for i in range(1,y+1):
        j=x%i
        a.append(j)
    print(max(a))
