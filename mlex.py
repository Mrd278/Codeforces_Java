children=['chochlate','wafers','pizza','pencil','toffee','kurkure','chartpaper','biscuit']
adults=['chochlate','pizza','juice','pen','pencil','biscuit','chartpaper']
man=['juice','biscuit','namkeen','pen','sheets','file','briefcase']
woman=['juice','biscuit','namkeen','sanitizers','soap','washing powder','pen']
print("enter the name of the customer :")
name=input()
print("Enter the number of items customer has bought :")
num=int(input())
item=[]
a,w,c,m=0,0,0,0
if num==1:
    print("please enter the item he/she has bought :")
    item.append(input())
elif num>1:
    print("Please enter the items he/she has bought :")
    for i in range(num):
        print("Item no. ",i+1)
        item.append(input())        
for i in children:
    for j in range(num):
        if item[j]==i:
            c+=1
for i in adults:
    for j in range(num):
        if item[j]==i:
            a+=1
for i in man:
    for j in range(num):
        if item[j]==i:
            m+=1
for i in woman:
    for j in range(num):
        if item[j]==i:
            w+=1
result=max(a,w,m,c)
if result==w and result==a and result==c and result==m:
    print("Given data is not enough for the prediction")
    exit(1)
print("After analysing the data, my prediction is :")
if result==a:
    print("may be ",name," is an adult")
if result==m:
    print("may be Mr.",name," is a man")
if result==w:
    print("may be Mrs.",name," is a woman")
if result==c:
    print("may be ",name," is a child")

