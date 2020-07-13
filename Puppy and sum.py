def sum(n):
    return (n*(n+1))/2
for i in range(int(input())):
    d,n=list(map(int,input().split()))
    d=int(d)
    n=int(n)
    for i in range(d):
        x=int(sum(n))
        n=x
    print(x)
    
