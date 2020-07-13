// My Template File For Competitive Programming

#include<bits/stdc++.h>
#include<string>
using namespace std;

#define fo(i,s,n) for(int i = s; i < n; i++)
typedef long long ll;
typedef long long int lli;
typedef unsigned long long int ull;

#define deb(x) cout<<#x<<" is "<<x<<endl;
#define x first
#define y second


// Binary Exponentiation
ull binpow(ull a, ull b)
{
	ull res = 1;
	while(b > 0)
	{
		if(b & 1)
			res *= a;
		a *= a;
		b>>= 1;	
	}
	return res;
}
/*
// Modular Binary Exponentiation
lli modbinpow(lli a, lli b, lli m) {
    a %= m;
    lli res = 1;
    while (b > 0) {
        if (b & 1)
            res = res * a % m;
        a = a * a % m;
        b >>= 1;
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

void solve()
{
	ull a,b;
	cin>>a>>b;
	string n = to_string(binpow(a,b));
	cout<<n[n.size()-1]<<endl;
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	cout<<fixed;
	cout<<setprecision(10);
	
	ll t;
	cin>>t;
	while(t--)
		solve();
	return 0;
}
