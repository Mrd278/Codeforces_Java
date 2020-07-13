for i in range(int(input())):
    a,b=input().split()
    a=int(a)
    b=int(b)
    m=a
    if a<b:
        m=b
    print(m," ",(a+b))
