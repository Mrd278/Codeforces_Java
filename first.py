print("\t\t\twelcome!\n\n")
print("what would like to do\n\n\t\t1.factorial\n\t\t2.To find the value of cosine inverse")
a=input()
if int(a)==1:
   print("tell me the number that you would like to find the factorial of")
   b=input()
   from math import factorial as f
   print(f(int(b)))
elif int(a)==2:
   print("enter the number in the range of [-1,1]")
   c=input()
   import math
   print(math.acos(float(c)))
print("$$$ Thank You For Using $$$")
