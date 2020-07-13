n=int(input())
c=0
x=list(map(int,input().split()))
for j in x:
    if j%2==0:
        c+=1
if c>int(n/2):
    print('READY FOR BATTLE')
else:
    print('NOT READY')
