def prob(pmb, pab, p1):
    p = float(pmb*(1 - pab)*p1 + pab*(1 - pmb)*p1)
    return p


Pmb = float(input())
Pab = float(input())
P1 = float(input())

print('{:.6f}'.format(prob(Pmb, Pab, P1)))
