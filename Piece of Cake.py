for i in range(int(input())):
    S = input()
    yes = False
    for j in S:
        if S.count(j) == len(S) - S.count(j):
            yes = True
            print("YES")
            break;
    if not yes:
        print("NO")

