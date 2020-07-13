def reverse(a):
    s=0
    l=len(str(a))
    from math import pow as p
    while (a/10)!=0:
        r=a%10
        s=s+r*p(10,l-1)
        a=int(a/10)  
        l=l-1
    print(int(s))    
        
    
n=int(input())
for i in range(n):
    b=int(input())
    reverse(b)
