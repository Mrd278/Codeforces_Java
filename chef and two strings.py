n=int(input())
for i in range(n):
    x=str(input())
    y=str(input())
    l=len(x)
    p=l
    m=0
    for i in range(l):
            if x[i]=='?' and y[i]=='?':
                p=p-1
            elif x[i]!='?' and y[i]=='?':
                p=p-1
            elif x[i]=='?' and y[i]!='?':
                p=p-1
            else:
                if x[i]==y[i]:
                    p=p-1
    for i in range(l):
            if x[i]=='?' and y[i]=='?':
                m=m+1
            elif x[i]!='?' and y[i]=='?':
                m=m+1
            elif x[i]=='?' and y[i]!='?':
                m=m+1
            else:
                if x[i]!=y[i]:
                    m=m+1
    print(p,m)
                
