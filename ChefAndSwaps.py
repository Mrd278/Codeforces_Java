from sys import stdin

for _ in range(int(stdin.readline())):
    n = int(stdin.readline())
    a = list(map(int, stdin.readline().split()))
    b = list(map(int, stdin.readline().split()))

    a = sorted(a)
    b = sorted(b)

    if a is b:
        print("0")
    else:
        c = {}
        d = {}
        for i in a:
            if i in c:
                c[i] += 1
                c[i] %= 2
                d[i] += 1
            else:
                c[i] = 1
                d[i] = 1
        for j in b:
            if j in c:
                c[j] += 1
                c[j] %= 2
                d[j] += 1
            else:
                c[j] = 1
                d[j] = 1
        k = sorted(c.items(), key = lambda x:x[1], reverse = True)
        p = 0
        for i in k:
            p = i[1]
        if p == 1:
            print(-1)
        else:
            wanted = []
            extra = []
            for key, val in d.items():
                if key not in a:
                    for i in range(val//2):
                        wanted.append(key)
                else:
                    if a.count(key) > val//2:
                        for i in range(a.count(key) - (val//2)):
                            extra.append(key)
                    elif a.count(key) < val//2:
                        for i in range(vall//2 - a.count(key)):
                            wanted.append(key)
            
            wanted = sorted(wanted)
            extra = sorted(extra, reverse = True)
            s = 0
            for i in range(len(extra)):
                s += min(extra[i], wanted[i])
            print(s)
