def count4(k):
    g=[]
    for i in range(len(k)):
        c=0
        while int(k[i])!=0:
            r=int(k[i]%10)
            if r==4:
                c=c+1
            k[i]=int(k[i]/10)
        g.append(c)
    return g

n=int(input())
a=[]
j=[]
for i in range(n):
    b=int(input())
    a.append(b)
j=count4(a)
for l in j:
    print(l)
