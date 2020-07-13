
def kaprekar_check(i):
    if i == 1:
        return True
    square_i = i**2
    d = len(str(i))
    str_sq_i = str(square_i)
    if len(str_sq_i) == 2*len(str(i)):
        l = str_sq_i[:len(str(i))]
        r = str_sq_i[len(str(i)):]
        if int(l) == 0 or int(r) == 0:
            return False
        elif int(l)+int(r) == i:
            return True
        else:
            return False
    else:
        if (2*d-1) == 1:
            return False
        else:
            l = str_sq_i[:len(str(i))-1]
            r = str_sq_i[len(str(i))-1:]
            if int(l) == 0 or int(r) == 0:
                return False
            elif int(l)+int(r) == i:
                return True
            else:
                return False


p = int(input())
q = int(input())
arr = []
for i in range(p,q+1):
    if kaprekar_check(i):
        arr.append(i)
if len(arr) == 0:
    print("INVALID RANGE")
else:
    for j in arr:
        print(j, end = ' ')
