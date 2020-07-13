def sumoflf(k):
    g=[]
    from math import pow as p
    for i in range(len(k)): 
        s=0
        s=s+int(k[i]%10)+int(k[i]/p(10,len(str(k[i]))-1))
        g.append(s)
    return g
n=int(input())
a=[]
m=[]
for i in range(n):
    a.append(int(input()))
m=sumoflf(a)
for j in m:
    print(j)
    
