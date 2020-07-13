def check(a):
    c=0
    for i in range(1,a):
        if a%i==0:
            c=int(c+1)
    if c==2:
        return True
    else:
        return False

    
n=int(input())
for i in range(n):
    x=int(input())
    
