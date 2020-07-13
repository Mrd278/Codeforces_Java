for i in range(int(input())):
    x=int(input())
    f=0
    for j in range(2,int(x/2)+1):
        if x%j==0:
            f=1
    if f==1:
        print('no')
    else:
        print('yes')
    
            
