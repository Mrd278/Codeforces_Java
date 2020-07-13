def sort(my_list):
    size = len(my_list)
    for i in range(size):
        for j in range(size-i-1):
            if(my_list[j] > my_list[j+1]):
                tmp = my_list[j]
                my_list[j] = my_list[j+1]
                my_list[j+1] = tmp

numbers=([])
amount=input("How many numbers are in your list? ")
print("")
counter = 0
ran = 0
while counter < int(amount):
    counter = counter + 1
    ran = ran + 1
    num3 = input(str(ran) + ". Input: ")
    try:
       val = int(num3)
    except ValueError:
       num3 = input(str(ran) + ". Input: ")
    sort(numbers)
    numbers.append(num3)
