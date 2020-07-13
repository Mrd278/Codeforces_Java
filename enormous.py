n,k=input().split()
n=int(n)
k=int(k)
a=[]
c=0
for i in range(0,n):
    b=int(input())
    a.append(b)
    if b%k==0:
        c=c+1
print(c)
