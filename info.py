n,k=input().split()
n=int(n)
k=int(k)
c=0
for i in range(1,15*k+2):
    a=[]
    while(i):
        r=i%15
        m=i/15
        c+=1
        if r==0:
            i=0
    b=i
    a.append(b)
    if c==k:
        print(a[n-1])
    
