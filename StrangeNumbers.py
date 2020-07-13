def isprime(n):
    for i in range(2,int(n/2)+1):
        if n % 2 == 0:
            return False
    return True

def prime_factors_gen(n, d):
    d_ = d
    if n == 1:
        return d_
    elif n % 2 == 0:
        if 2 in d_.keys():
            n = n / 2
            d_[2] = d_[2] + 1
            #print(d_)
        else:
            d_[2] = 1
            n = n/2
        prime_factors_gen(n, d_)
    else:
        if isprime(n):
            if n in d_.keys():
                d_[n] = d_[n] + 1
            else:
                d_[n] = 1
            #print("isprime")
            prime_factors_gen(1,d_)
        else:
            for i in range(1,int(n/2)+1):
                if n%i == 0:
                    if i in d_.keys():
                        d_[i] = d_[i] + 1
                    else:
                        d_[i] = 1
                    n = n / i
                    break
            prime_factors_gen(n, d_)
    return d_
        
def count_num(c):
    sum_ = 0
    for i in c.keys():
        sum_ = sum_ + c[i]
    return sum_

for i in range(int(input())):
    x,k = map(int, input().split())
    count = prime_factors_gen(x,{})
    res = count_num(count)
    #print("res ", res)
    #print("count ",count)
    if k <= res:
        print(1)
    else:
        print(0)
            
            
            

    
    
