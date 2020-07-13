import math
s = input()
for i in s:
    if i == ' ':
        s.remove(i)
l = len(s)

rows = math.floor(math.sqrt(l))
columns = math.ceil(math.sqrt(l))

if rows*columns < len(s):
    rows = rows+1

for i in range(columns):
    k = i
    for j in range(rows):
        if k < len(s):
            print(s[k],end = '')
            k = k + columns
    print(end = ' ')
