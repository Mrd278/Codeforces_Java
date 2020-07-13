for i in range(int(input())):
    a,b,c=input().split()
    a=int(a)
    b=int(b)
    c=int(c)
    if (a+b+c)==180:
        print("YES")
    else:
        print("NO")
