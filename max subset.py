a=[]
b=[]
s=0
p=0
c=0
n=int(input())
for i in range(n):
    x=int(input())
    a.append(x)
while p<n:
    if (s+a[p])>=(s+a[p+1]):
        s+=a[p]
        b.append(a[p])
    else:
        s+=a[p+1]
        b.append(a[p+1])
        p=p+1
    p=p+2
    c=c+1
for k in range(c):
    print(b[k])
print("max sum =",s)
 
