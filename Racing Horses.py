for i in range(int(input())):
    n = int(input())
    skills = list(map(int, input().split()))
    skills.sort()
    d = []
    for j in range(1, n):
        d.append(skills[j] - skills[j - 1])
    print(min(d))
