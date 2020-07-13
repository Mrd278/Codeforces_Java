x1, y1, x2, y2 = 0,0,0,0
for i in range(int(input())):
    x1, y1, x2, y2 = map(int, input().split())
    if (x1 != x2) and (y1 != y2):
        print('sad')
    else:
        if (x1 - x2) < 0:
            print('right')
        elif (x1 - x2) > 0:
            print('left')
        elif (y1 - y2) < 0:
            print('up')
        elif(y1 - y2) > 0:
            print('down')
        
