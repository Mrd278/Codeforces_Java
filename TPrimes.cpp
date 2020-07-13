#include<iostream>
#include<math.h>
using namespace std;

#define ll long long

bool isPrime(int n)  
{  
      
    if (n <= 1)  
        return false;  
    if (n <= 3)  
        return true;  

    if (n % 2 == 0 || n % 3 == 0)  
        return false;  
  
    for (int i = 5; i * i <= n; i = i + 6)  
        if (n % i == 0 || n % (i + 2) == 0)  
            return false;  
  
    return true;  
}  

bool isThreeDisctFactors(ll n)  
{   
    ll sq = (ll)sqrt(n);  
    
    if (1L * sq * sq != n)  
        return false;  

    return isPrime(sq) ? true : false;  
} 

int main()
{
	ll n, i;
	string res[100000];
	cin>>n;
	for(i = 0; i < n; i++)
	{
		ll temp;
		cin>>temp;
		if(isThreeDisctFactors(temp))
			res[i] = "YES";
		else
			res[i] = "NO";
	}
	
	for(i = 0; i < n; i++)
		cout<<res[i]<<endl;
	return 0;
}
