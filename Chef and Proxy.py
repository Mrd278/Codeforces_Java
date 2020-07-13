for i in range(int(input())):
    D = int(input())
    S = input()
    k = 0
    c = S.count('P')
    l = 0.75*D
    lint = int(.75*D)
    for r in range(D):
        if S[r] != 'P' or S[r] != 'A':
            exit(0)
    if lint == l:
        req = 0.75*D - c
    else:
        req = int(0.75*D) + 1 - c
    if D > 4:
        for j in range(2,D-2):
            if S[j] == 'A':
               if (S[j-1] == 'P' or S[j-2] == 'P') and (S[j+1] == 'P' or S[j+2] == 'P'):
                   k += 1
    if k >= req:
        print(int(req))
    else:
        print('-1')
        
