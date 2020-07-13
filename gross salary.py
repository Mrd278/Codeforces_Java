n=int(input())
for i in range(n):
    b=int(input())
    if b<1500:
        salary=float(2*b)
    else:
        salary=float(500+1.98*b)
    print(salary)
