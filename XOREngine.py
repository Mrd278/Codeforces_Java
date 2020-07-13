def bin_to_dec(b):
    res = 0
    for i in range(len(b)):
        res = res + pow(2,i)*b[len(b)-1-i]
    return res

def dec_to_bin(d):
    d_str = bin(d)
    b = []
    for i in range(len(d_str)):
        if str.isdecimal(d_str[i]):
            b.append(int(d_str[i]))
    return b

def XOR_cal(a,b):
    size = 0
    res = []
    if len(a) > len(b):
        size = len(b)
    else:
        size = len(a)
    for i in range(size):
        k = a[len(a)-1-i]
        j = b[len(b)-1-i]
        if k != j:
            res.append(1)
        else:
            res.append(0)
    if len(a) > len(b):
        for i in range(len(a)-len(b)):
            k = a[len(a)-len(b)-1-i]
            j = b[len(a)-len(b)-1-i]
            if k != j:
                res.append(1)
            else:
                res.append(0)
    else:
        for i in range(len(b)-len(a)):
            k = a[len(b)-len(a)-1-i]
            j = b[len(b)-len(a)-1-i]
            if k != j:
                res.append(1)
            else:
                res.append(0)
    return res

for i in range(int(input())):
    n,q = map(int, input().split())
    x = list(map(int, input().split()))
    for i in range(q):
        p = int(input())
        even = 0
        odd = 0
        for j in x:
            j_bin = dec_to_bin(j)
            p_bin = dec_to_bin(p)
            res_bin = XOR_cal(j_bin, p_bin)
            res_bin.reverse()
            res = bin_to_dec(res_bin)
            c = res_bin.count(1)
            if c % 2 == 0:
                even = even + 1
            else:
                odd = odd + 1
        print(even, end = " ")
        print(odd)
