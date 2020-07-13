from functools import reduce
def g(a,b):
    while b:
        a,b=b,a%b
    return a
n=int(input())
for i in range(n):
    x=list(map(int,input().strip().split(' ')))[1:]
    gcd=g(x[0],x[1])
    for j in range(2,len(x)):
        gcd=g(gcd,x[j])
    print(reduce(lambda left,right:str(left)+ ' ' +str(right),list(map(lambda k:k//gcd,x))))



