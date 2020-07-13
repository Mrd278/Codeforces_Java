s = input()
s = s.lower()
v = ['a','e','i','o','u']
if s.isalpha():
    if s in v:
        print("vowel")
    else:
        print("consonant")