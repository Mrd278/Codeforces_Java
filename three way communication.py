import math
def dis(x1,x2,y1,y2):
    dist=math.sqrt((x1-x2)**2+(y1-y2)**2)
    dist=float(dist)
    return dist
for i in range(int(input())):
    r=int(input())
    x,y=[],[]
    for i in range(3):
        a,b=input().split()
        a=int(a)
        b=int(b)
        x.append(a)
        y.append(b)
    d1=dis(x[0],x[1],y[0],y[1])
    d2=dis(x[1],x[2],y[1],y[2])
    d3=dis(x[0],x[2],y[0],y[2])
    if d1<=r and d2<=r:
        print('yes')
    elif d1<=r and d3<=r:
        print('yes')
    elif d3<=r and d2<=r:
        print('yes')
    else:
        print('no')
