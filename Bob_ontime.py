def prob_on_time(pot, pct, n):
    p = (1 - pct)*pot + pct*2/n
    return p


Pct = float(input())
Pot = float(input())
N = float(input())
K = prob_on_time(Pot, Pct, N)

print('{:.6f}'.format(K))
