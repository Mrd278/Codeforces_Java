def sorting(b,n):
    for i in range(0,n):
        for j in range(0,n-1):
            if b[i]<=b[j]:
                t=b[i]
                b[i]=b[j]
                b[j]=t
    print(b)
    
print("welcome")
print("1.sorting\n2.factorial\n3.sum of a matrix")
n=int(input("enter your choice"))
if n==1:
    a=[]
    k=int(input("enter the number of elements"))
    for i in range(0,k):
        x=int(input())
        a.append(x)
    sorting(a,k)
elif n==2:
    from math import factorial as f
    n=int(input("enter the no. for factorial"))
    print(f(n))
elif n==3:
    c=[]
    s=0
    print("enter the order of the matrix")
    n=int(input())
    k=int(input())
    for i in range(0,n*k):
        x=int(input())
        c.append(x)
        s+=c[i]
    print("sum of the elements is =",s)
else:
    print("wrong input")
