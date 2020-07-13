n = int(input())
for i in range(n):
    s = input()
    b = []
    a = []
    for j in s:
        if j.isalpha()==True:
            a.append(j)
        elif j not in "()":
            b.append(j)
        elif j == ")":
            a.append(b.pop())
    print(''.join(a))

    
