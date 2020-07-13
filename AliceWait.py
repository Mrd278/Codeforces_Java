import math

lam = 0.01
N = float(input())
p = math.exp(-lam*N)
print('{:.6f}'.format(p))
