for i in range(int(input())):
    n,k=input().split()
    n=int(n)
    k=int(k)
    x=list(map(int,input().split()))
    for j in range(k):
        s2=0
        x[n-j-1]=1
        for o in x:
            s2+=o*o
        s1=sum(x)
        if s1>=s2:
            print('YES')
            print(s1,s2,x)
            break
        elif s1<s2 and j==(k-1):
            print('NO')
            print(s1,s2,x) 
       
