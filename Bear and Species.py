def index_predictor(A, species, col, row):
    row_index = []
    col_index = []
    for i in range(row):
        for j in range(col):
            if A[i][j] == species:
                row_index.append(i)
                col_index.append(j)
    return row_index, col_index

def Grizzly_Bear_Condition(A, col, row): # there must be no adjacent bear
    flag = True
    row_index = []
    col_index = []
    row_index, col_index = index_predictor(A, 'G', col, row)
    for i in range(row):
        if A[row_index[i] - 1][col_index[i]] != None and A[row_index[i] - 1][col_index[i]] != '.':
            flag = False
            return flag
        elif A[row_index[i] + 1][col_index[i]] != None and A[row_index[i] + 1][col_index[i]] != '.':
            flag = False
            return flag
        elif A[row_index[i]][col_index[i] + 1] != None and A[row_index[i]][col_index[i] + 1] != '.':
            flag = False
            return flag
        elif A[row_index[i]][col_index[i] - 1] != None and A[row_index[i]][col_index[i] - 1] != '.':
            flag = False
            return flag
    return flag


def Polar_Bear_Condition(A, col, row): # bear of same type can be on the adjacent
    flag = True
    row_index = []
    col_index = []
    row_index, col_index = index_predictor(A, 'G', col, row)
    for i in range(row):
        if A[row_index[i] - 1][col_index[i]] != None and A[row_index[i] - 1][col_index[i]] != 'P' or A[row_index[i] - 1][col_index[i]] != '.':
            flag = False
            return flag
        elif A[row_index[i] + 1][col_index[i]] != None and A[row_index[i] + 1][col_index[i]] != 'P' or A[row_index[i] + 1][col_index[i]] != '.':
            flag = False
            return flag
        elif A[row_index[i]][col_index[i] + 1] != None and A[row_index[i]][col_index[i] + 1] != 'P' or A[row_index[i]][col_index[i] + 1] != '.':
            flag = False
            return flag
        elif A[row_index[i]][col_index[i] - 1] != None and A[row_index[i]][col_index[i] - 1] != 'P' or A[row_index[i]][col_index[i] - 1] != '.':
            flag = False
            return flag
    return flag


def Brown_Bear_Condition(A, col, row): # bear of same type can be on the adjacent
    flag = True
    row_index = []
    col_index = []
    row_index, col_index = index_predictor(A, 'G', col, row)
    for i in range(row):
        if A[row_index[i] - 1][col_index[i]] != None and A[row_index[i] - 1][col_index[i]] != 'B' or A[row_index[i] - 1][col_index[i]] != '.':
            flag = False
            return flag
        elif A[row_index[i] + 1][col_index[i]] != None and A[row_index[i] + 1][col_index[i]] != 'B' or A[row_index[i] + 1][col_index[i]] != '.':
            flag = False
            return flag
        elif A[row_index[i]][col_index[i] + 1] != None and A[row_index[i]][col_index[i] + 1] != 'B' or A[row_index[i]][col_index[i] + 1] != '.':
            flag = False
            return flag
        elif A[row_index[i]][col_index[i] - 1] != None and A[row_index[i]][col_index[i] - 1] != 'B' or A[row_index[i]][col_index[i] - 1] != '.':
            flag = False
            return flag
    return flag



