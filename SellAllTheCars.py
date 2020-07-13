def Sell(x):
    x.sort()
    x.reverse()
    new_x = []
    for i in range(len(x)):
        if x[i] > i:
            new_x.append(x[i] - i)
    return sum(new_x)%(1e9+7)

for i in range(int(input())):
    n = int(input())
    x = list(map(int, input().split()))
    m = Sell(x)
    print(int(m))
