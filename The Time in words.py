num_dict = {1:'one', 2:'two', 3:'three', 4:'four', 5:'five',
                6:'six', 7:'seven', 8:'eight', 9:'nine', 10:'ten',
                11:'eleven',12:'twelve',13:'thirteen',14:'fourteen',
                15:'quarter',16:'sixteen',17:'seventeen',18:'eighteen',
                19:'nineteen',20:'twenty',30:'half', 40:'forty', 50:'fifty', 60:'sixty'}
prefix_num = ['twenty', 'thirty']
for i in range(2,4):
    for j in range(1,10):
        num_dict[i*10 + j] = prefix_num[i-2] + " " +num_dict[j]

def int2text(number):
    return num_dict[number]


hour = int(input())
minutes = int(input())

if minutes > 30:
    if hour == 11:
        if minutes == 45:
            print(int2text(60-minutes) + " to " + int2text(12))
        else:
            print(int2text(60-minutes) + " minutes to " + int2text(12))
    else:
        if minutes == 45:
            print(int2text(60-minutes) + " to " + int2text((hour + 1)%12))
        else:
            print(int2text(60-minutes) + " minutes to " + int2text((hour + 1)%12))
        
else:
    if minutes == 0:
        print(int2text(hour) + " o' clock")
    elif minutes == 30 or minutes == 15:
        print(int2text(minutes) + " past " + int2text(hour))
    elif minutes == 1:
        print(int2text(minutes) + " minute past " + int2text(hour))
    else:
        print(int2text(minutes) + " minutes past " + int2text(hour))
