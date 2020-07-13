def sort(k):
    i=0
    for i in range(len(k)-1):
        j=i+1
        for j in range(len(k)-2):
            if k[i]>k[j]:
                t=k[i]
                k[i]=k[j]
                k[j]=t
    return k
    
print("\t\tWELCOME\n\n")
print("\t\t1.sorting in ascending order \n\t\t2.sum of the numbers entered\n\t\t 3.getting details about a string")
print("\n\n\tEnter your choice")
a= input()
str=b
if int(a)==1:
    print("tell us how many numbers you want to enter in the array")
    n= input()
    print("please enter the values in array:\n")
    i=0
    for i in range(int(n)):
        b[i]=input()
    b=sort()
    for i in range(int(n)):
        print(b[i])


        
