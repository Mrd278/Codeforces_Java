n, t = map(int, input().split())
x = list(map(int, input().split()))
for i in range(t):
    a,b = map(int, input().split())
    print(min(x[a:b+1]))