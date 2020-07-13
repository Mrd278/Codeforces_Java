def hit_cal(s, w_1, w_2, w_3, hit_start):
    hit = hit_start
    if w_1 < s:
        print("if")
        if (w_1+w_2) < s:
            print("if - if")
            if (w_1 + w_2 + w_3) <= s:
                print("if - if - if")
                hit = hit + 1
                return hit
        elif (w_1 + w_2) == s:
            print("if - elif")
            hit = hit + 2
            return hit
        else:
            print("if - else")
            hit = hit + hit_cal(s, w_1 - s, w_2, w_3, 1)
            return hit
    else:
        print("else")
        hit = hit + hit_cal(s, w_1 - s, w_2, w_3, 1)
        return hit


t = int(input())
for i in range(t):
    s, w1, w2, w3 = map(int, input().split())
    h1 = hit_cal(s, w1, w2, w3, 0)
    h2 = hit_cal(s, w3, w2, w1, 0)

    if h1 < h2:
        print(h1)
    else:
        print(h2)
