for i in range(int(input())):
    a,b,c=input().split()
    a=int(a)
    b=int(b)
    c=int(c)
    m=max(a,b,c)
    s=min(a,b,c)
    if a<m and a>s:
        print(a)
    elif b<m and b>s:
        print(b)
    else:
        print(c)
