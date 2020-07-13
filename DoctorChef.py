T=int(input())
for l in range(T):
    n,x=map(int,input().strip().split())
    a=list(map(int,input().strip().split()))
    a=sorted(a)
    d=0
    i=0
    while max(a)>=x :
        if x>=a[i] and i<n-1:
            d+=1 
            a=[i*2 for i in a]
            print("a ",a)
            i+=1
        elif x<=a[i]:
            d+=1
        x=x*2
        print("x :",x)
    print(d)
