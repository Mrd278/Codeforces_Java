y, x = map(float, input().split())
if y%5 == 0 and y <= x-0.50:
	x -= y+0.50
	print("{:.2f}".format(x))
else:
	print("{:.2f}".format(x))
