def lapindrone(k,j,l):
    c = 0
    for m in range(l):
        for n in range(l):
            if k[m] == j[n]:
                if k.count(k[m]) == j.count(j[n]):
                    c = c + 1
    if c == l:
        print('YES')
    else:
        print('NO')
                    
    

if __name__ == '__main__':
    T = int(input())
    if T >= 1 and T<=100:
        for i in range(T):
            S = input()
            l = len(S)
            if l>=2 and l<=1000:
                if l%2 == 0:
                    lapindrone(S[0:int(l/2)], S[int(l/2):],int(l/2))
                else:
                    lapindrone(S[0:int(l/2)],S[int(l/2)+1:],int(l/2))

# Another Method


'''from collections import defaultdict as defdic

T = int(input())
for a in range(T):
    S = input()
    l = len(S)
    j = int(l/2)
    k = S[:j]
    if l%2 != 0:
        j = j+1
    p = S[j:]
    d_1 = defdic(int)
    d_2 = defdic(int)
    for i in range(len(k)):
        d_1[k[i]] +=1
    for i in range(len(p)):
        d_2[p[i]] +=1
        
    if d_1 == d_2:
        print('YES')
    else:
        print("NO")'''
