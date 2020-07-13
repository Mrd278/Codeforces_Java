n=int(input())
a=[]
for i in range(n):
    b,c=input().split()
    b=int(b)
    c=int(c)
    a.append(b%c)
for i in a:
    print(i)
