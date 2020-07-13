import math

for i in range(int(input())):
    x,y = map(int, input().split())
    g = math.gcd(x, y)
    print(int(x*y/g**2))
