#include<iostream>
#include<math.h>
using namespace std;

#define ll long long

int main()
{
	ll n, t, alpha, c;
	cin>>n>>t;
	c = (ll)(2*(240 - t)/5);
	alpha = (ll)(-1 + (ll)(sqrt(1+4*c)))/2;
	
	if(alpha > n)
		cout<<n;
	else
		cout<<alpha;
	return 0;
}
