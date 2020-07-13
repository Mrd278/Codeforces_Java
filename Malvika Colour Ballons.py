for i in range(int(input())):
    s = input()
    s.lower()
    if s.count('a') < s.count('b'):
        print(s.count('a'))
    else:
        print(s.count('b'))
