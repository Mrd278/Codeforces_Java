#include<iostream>
#include<math.h>
using namespace std;

#define ll long long

int main()
{
	ll t;
	cin>>t;
	
	while(t--)
	{
		ll s, i = 2;
		cin>>s;
		
		while(s % (ll)(pow(2,(double)i++) - 1));
		
		cout<<s/(ll)(pow(2, (double)i-1) - 1)<<endl;
	}
	
	return 0;
}
