n=int(input())
for i in range(n):
    x=str(input())
    y=str(input())
    l=len(x)
    p=l
    for i in range(l):
        if x[i]!='?' and y[i]!='?':
            if x[i]!=y[i]:
                p=p-1
    if p==l:
        print("YES")
    else:
        print("NO")
    
