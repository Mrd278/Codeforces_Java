x,y = input().split()
x = float(x)
y = float(y)
if (y-x)>=0.50 and x%5==0:
	print(y-x-0.50)
else:
	print(y)	
