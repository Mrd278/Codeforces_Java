for i in range(int(input())):
    x=input()
    k=x
    x=list(x)
    x.reverse()
    x=''.join(x)
    if k==x:
        print("wins")
    else:
        print("losses")
 
