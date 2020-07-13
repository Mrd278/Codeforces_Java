n=int(input())
for i in range(n):
    a=[]
    m=int(input())
    for j in range(m):
        x=list(map(int,input().split()))
        a.append(x)
    for k in range(len(a)-1,0,-1):
        for l in range(k):
            if a[k][l]>a[k][l+1]:
                a[k-1][l]+=a[k][l]
            else:
                a[k-1][l]+=a[k][l+1]
    print(a[0][0])


        
