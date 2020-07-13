h, w = map(int, input().split())

if h == 1 and w == 1:
    height = int(input())
    Area = 4*height + 2
elif h == 1 or w == 1:
    Area = 2*h*w

    heights = []

    for i in range(h):
        heights.append(list(map(int, input().split())))

    for i in range(h):
        for j in range(w):
            if i == 0 or j == 0 or i == h-1 or j == w-1:
                if (i == 0 and j == 0) or (i == h-1 and j == 0) or (i == h-1 and j == w-1) or (i == 0 and j == w-1):
                    Area = Area + 3*heights[i][j]
                else:
                    Area = Area + 2*heights[i][j]

    for j in range(w):
        for i in range(h-1):
            Area = Area + abs(heights[i+1][j] - heights[i][j])
            
    for i in range(h):
        for j in range(w-1):
            Area = Area + abs(heights[i][j+1] - heights[i][j])
else:
    Area = 2*h*w

    heights = []

    for i in range(h):
        heights.append(list(map(int, input().split())))

    for i in range(h):
        for j in range(w):
            if i == 0 or j == 0 or i == h-1 or j == w-1:
                if (i == 0 and j == 0) or (i == h-1 and j == 0) or (i == h-1 and j == w-1) or (i == 0 and j == w-1):
                    Area = Area + 2*heights[i][j]
                else:
                    Area = Area + heights[i][j]

    for j in range(w):
        for i in range(h-1):
            Area = Area + abs(heights[i+1][j] - heights[i][j])
            
    for i in range(h):
        for j in range(w-1):
            Area = Area + abs(heights[i][j+1] - heights[i][j])

print(Area)
        
