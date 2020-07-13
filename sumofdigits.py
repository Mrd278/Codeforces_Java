def add(b):
    s=0
    b=str(b)
    for i in range(len(b)):
       b=int(b)
       while b!=0:
          s=int(s+b%10)
          b=b/10
    print(s)
    
n=int(input())
a=[]
for i in range(0,n):
    c=int(input())
    a.append(c)
for j in range(0,n):
    add(a[j])
    
    
