t=int(input())
for i in range(t):
    a=[]
    m,x,y=list(map(int,input().split()))
    m=int(m)
    x=int(x)
    y=int(y)
    j=list(map(int,input().split()))
    s=sorted(j)
    k=len(s)-1
    q=s[k]+x*y
    w=s[0]-x*y
    r=s[k]-x*y
    u=s[0]+x*y
    if q>=100 and w<=1 and r<=u:
        left=0
    elif q<100 and w>1 and r<=u:
        left=(100-q)+w-1
    elif q<100 and w<=1 and r<=u:
        left=(100-q)
    elif q>=100 and w>1 and r<=u:
        left=w-1
    elif q<100 and w>1 and r<=u:
        left=(100-q)+w-1
    elif q<100 and w>1 and r>u:
        left=(100-q)+r-u-1+w-1
    elif q>=100 and w<=1 and r>u:
        left=r-u
    print(left)
