// My Template File For Competitive Programming

#include<bits/stdc++.h>
using namespace std;

#define fo(i,s,n) for(int i = s; i < n; i++)
typedef long long ll;
typedef long long int lli;
typedef unsigned long long int ull;

#define deb(x) cout<<#x<<" is "<<x<<endl;
#define x first
#define y second
#define MOD 1e9+7


// Binary Exponentiation
ll binpow(ll a, ll b)
{
	ll res = 1;
	while(b > 0)
	{
		if(b & 1)
			res *= a;
		a *= a;
		b>>= 1;	
	}
	return res;
}

/*// Modular Binary Exponentiation
ll modbinpow(ll a, ll b, ll m)
{
	a %= m;
	ll res = 1;
	while(b > 0)
	{
		if(b & 1)
			res *= a%m;
		a *= a%m;
		b>>= 1;	
	}
	return res;
}

// Binary GCD
ll gcd(ll a, ll b) {
    if (!a || !b)
        return a | b;
    unsigned shift = __builtin_ctz(a | b);
    a >>= __builtin_ctz(a);
    do {
        b >>= __builtin_ctz(b);
        if (a > b)
            swap(a, b);
        b -= a;
    } while (b);
    return a << shift;
}*/


ll factorials[100000];

ll fact(ll n)
{
    factorials[0] = factorials[1] = 1;

	if(n <=1)
		return factorials[0];
    
    if(factorials[n])
    	return factorials[n];
    else
    {
    	factorials[n] = n * fact(n-1);
    	return factorials[n];
	}
}

void solve()
{
	ll n;
	cin>>n;
	cout<<2*4*3*binpow(4,n-3)+(n-3)*4*binpow(3,2)*binpow(4,n-4);
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	cout<<fixed;
	cout<<setprecision(10);
	
	solve();
	return 0;
}
