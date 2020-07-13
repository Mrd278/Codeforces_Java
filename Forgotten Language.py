for i in range(int(input())):
    n, k = map(int, input().split())
    f_l_d = list(map(str, input().split()))
    sentence = []
    d = dict()

    for i in range(n):
        d[i]="NO"
    for m in range(k):
        sentence += list(map(str, input().split()))
    for j in range(n):
        if f_l_d[j] in sentence:
            d[j] = "YES"
        else:
            d[j] = "NO"
    for l in range(n):
        print(d[l], end = " ")
    print()
'''      
    
t=int(input())
while t:
    t=t-1
    m,k=list(map(int,input().split(" ")))
    
    arr = list(map(str,input().split(" ")))
    d=dict()
    
    for i in arr:
        d[i]="NO"
    
    
    while k:
        k=k-1
        lst = list(map(str,input().split(" ")))
        lst=lst[1:]
        for i in lst:
            if d.get(i)!=None:
                d[i]="YES"
            
    for i in arr:
        print(d[i],end=" ")
    print()
'''
