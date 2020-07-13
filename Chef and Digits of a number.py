for i in range(int(input())):
    a = input()
    print("YES" if a.count("1") == 1 or a.count("0") == 1 else "NO")
