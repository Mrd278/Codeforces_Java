for t in range(int(input())):
    n,m,k = map(int, input().split())
    l = []
    for i in range(n):
        x = list(map(int, input().split()))
        l.append(x)
    r = []
    for j in range(n):
        ma = 0
        d = {}
        for i in range(m+1):
            s = l[j].count(i)
            d[i] = s
        #print("d[i] ", d[i])
        res = 0
        for w in d.keys():
            if d[w] >= ma:
                res = w
                ma = d[w]
        #print("res ", res)
        r.append(res)
    for e in r:
        print(e, end = " ")
