x=int(input())
y=int(input())
if x<=y and x%5==0:
    y=y-x-0.5
    print(y)
elif x>y:
    print(y)
elif x%5!=0:
    print(y)
