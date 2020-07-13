from math import pow as p
for i in range(int(input())):
    x,y,z=list(map(int,input().split()))
    x=int(x)
    y=int(y)
    z=int(z)
    diff=abs(x-y)
    if diff<=z:
        print(0)
    else:
        print(diff-z)
