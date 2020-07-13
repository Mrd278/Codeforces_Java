def distance_maintainer(x):
    indices = []
    dist = []
    for i in range(len(x)):
        if x[i] == 1:
            indices.append(i)
    if len(indices) < 2:
        return True
    else:
        for i in range(len(indices) - 1):
            dist.append(indices[i+1] - indices[i])
    if min(dist) >= 6:
        return True
    else:
        False

for i in range(int(input())):
    n = int(input())
    x = list(map(int, input().split()))
    if distance_maintainer(x):
        print("YES")
    else:
        print("NO")
