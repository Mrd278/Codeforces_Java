for i in range(int(input())):
    q,p=input().split()
    q=int(q)
    p=float(p)
    if q>1000:
        p=0.9*p
    print("{:0.6f}".format(p*q))
