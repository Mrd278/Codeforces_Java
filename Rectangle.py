'''T = int(input())
if T >= 1 and T <= 1000:
    for i in range(T):
        x = list(map(int, input().split()))
        for p in x:
            if p >= 1 and p <= 10000:
                s = set(x)
                k = 0
                for j in s:
                    if x.count(j) == 2:
                        k = k + 1
                if k == 2:
                    print('YES')
                else:
                    print('NO')'''

for i in range(int(input())):
    a,b,c,d = map(int,input().split())
    if(a==b):
        if(c==d):
            print("YES")
        else:
            print("NO")
    elif(a==c):
        if(b==d):
            print("YES")
        else:
            print("NO")
    elif(a==d):
        if(b==c):
            print("YES")
        else:
            print("NO")
    else:
        print("NO")
