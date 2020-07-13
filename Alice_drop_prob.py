def expectation_drop(p):
    return float(p/(1-p)**2)


P = float(input())
print('{:.6f}'.format(expectation_drop(P)))
