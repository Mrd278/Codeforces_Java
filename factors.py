for i in range(int(input())):
    x,y=input().split()
    x=int(x)
    y=int(y)
    if y!=1 and x<=y:
       print(x%y)
