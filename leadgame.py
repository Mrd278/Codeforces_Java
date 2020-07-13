def decider(e,f):
    g=[]
    o=[]
    for i in range(len(e)):
        if e[i]>f[i]:
            p=int((e[i]-f[i]))
            k=p+1
            l=p
        else:
            q=int(f[i]-e[i])  
            k=2+q
            l=q
        g.append(k)
        o.append(l)
    return g,o    

n=int(input())
a=[]
b=[]
r=[]
m,l=0,0
for i in range(n):
    c,d=input().split()
    c=int(c)
    d=int(d)
    m=m+c
    l=l+d
    a.append(m)
    b.append(l)
r,f=decider(a,b)
j=max(f)
for i in range(0,n):
    if f[i]==j:
        p=i
if r[p]==j+1:
    print(1,' ',j)
else:
    print(2,' ',j)


    
