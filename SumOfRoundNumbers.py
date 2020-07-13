t = int(input())
for _ in range(t):
    n = int(input())
    if n >= 1 and n <= 10:
        print(1)
        print(n)
    else:
        count = 0
        if n%(10**(len(str(n))-1)) == 0:
            print(1)
            print(n)
        else:
            a = []
            while(n!= 0):
                rem = n%10
                n = n//10
                a.append(rem)
            for i in a:
                if i != 0:
                    count = count + 1
            print(count)
            for i in range(len(a)):
                if a[i] * 10**i != 0:
                    print(a[i]* 10**i, end = " ")
            print()
