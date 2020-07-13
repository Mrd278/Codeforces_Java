k=int(input())
a=[]
c=0
b=[]
for i in range(0,k):
    b=list(input())
    if b[i]>=1:
        a.append(b[i])
for j in range(1,int(max(a)/2+1)):
    for i in range(0,k):
        if a[i]%j==0:
            c+=1
            if c==k:
                print(j)
