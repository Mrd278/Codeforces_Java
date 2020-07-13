for _ in range(int(input())):
    n = int(input())
    x = list(map(int, input().split()))
    dist = []
    for i in range(len(x)-1):
        dist.append(x[i+1] - x[i])
    count = 1
    min_ = 10000
    max_ = 1
    temp = 0
    for i in dist:
        if i <= 2:
            count = count + 1
        else:
            if min_ > count:
                min_ = count
            if max_ < count:
                max_ = count
            count = 1
        temp = count
    if min_ > temp:
        min_ = temp
    if max_ < temp:
        max_ = temp
    print(min_, end = " ")
    print(max_)
    
