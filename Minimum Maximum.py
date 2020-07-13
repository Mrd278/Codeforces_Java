T = int(input())
for i in range(T):
    n = int(input())
    l = list(map(int, input().split()))
    print(min(l)*(n-1))
