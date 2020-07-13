n=int(input())
for i in range(n):
    ans=0
    t=int(input())
    if .5*t<2:
        print(0)
    else:
        while t>2:
            ans+=int((t-2)/2)
            t=t-2
        print(ans)
    
