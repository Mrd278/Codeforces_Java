for i in range(int(input())):
    n=int(input())
    x=list(map(str,input()))
    if 'I' in x:
        print('INDIAN')
    elif 'Y' in x:
        print("NOT INDIAN")
    elif 'I' not in x and 'Y' not in x:
        print('NOT SURE')
        
