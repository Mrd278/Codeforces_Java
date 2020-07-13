def primechecker(n):
    for i in range(2,n):
        if n%i == 0:
            return primechecker(n + 1)
    return n
    
for i in range(int(input())):
    x,y = map(int, input().split())
    total_harvest = primechecker(x + y + 1)
    print(total_harvest - (x + y))
