
def swap(s,i,j):
    a = list(s)
    temp = a[i]
    a[i] = a[j]
    a[j] = temp
    return ''.join(a)

def next_order(s):
    largest_x = -1
    for i in range(len(s)-1):
        if s[i] < s[i+1]:
            largest_x = i
    largest_y = -1
    for i in range(len(s)):
        if s[i] > s[largest_x]:
            largest_y = i
    print('largest_x: ',largest_x,' largest_y :', largest_y)
    s = swap(s, largest_x, largest_y)
    print(s)
    s = s[:largest_x+1] + ''.join(sorted(s[largest_x+1:]))
    print('answer: ',s) 



t = int(input())
for _ in range(t):
    s = input()
    largest_order = ''.join(sorted(s, reverse = True))
    print('largest order', largest_order)
    if s == largest_order:
        print('no answer')
    else:
        next_order(s)
