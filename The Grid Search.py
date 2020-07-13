for _ in range(int(input())):
    g_r, g_c = map(int, input().split())
    grid = []
    for i in range(g_r):
        grid.append(list(input()))
    #print('grid', grid)

    r, c = map(int, input().split())
    pattern = []
    for i in range(r):
        pattern.append(list(input()))
    #print('pattern', pattern)

    flag = False
    if g_r < r or g_c < c:
        flag = False
    else:    
        for i in range(g_r - r + 1):
            for j in range(g_c - c + 1):
                check = True
                if grid[i][j] == pattern[0][0]:
                    count = 0
                    if flag == False:
                        for l in range(r):
                            for k in range(c):
                                if grid[i+l][j+k] != pattern[l][k]:
                                    flag = False
                                    check = False
                                    break
                                else:
                                    count = count + 1
                            if check == False:
                                break
                    if count == r*c:
                        flag = True
                        break
            if flag == True:
                break

    if flag:
        print('YES')
    else:
        print('NO')
                
                    
                            
