def grading(x,y,z):
    if x>50 and y<.7 and z>5600:
        print(10)
    elif x>50 and y<.7 and z<=5600:
        print(9)
    elif x<=50 and y<.7 and z>5600:
        print(8)
    elif x>50 and y>=.7 and z>5600:
        print(7)
    elif x<50 and y>.7 and z<5600:
        print(5)
    else:
        print(6)

n=int(input())
for i in range (n):
    x,y,z=list(map(float,input().split()))
    grading(x,y,z)
    
