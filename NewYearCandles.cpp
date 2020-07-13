#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main()
{
	ll a,b,hours = 0;
	cin>>a>>b;
	if(a < b)
		cout<<a;
	else
	{
		ll rem = 0;
		hours += a;
		while(a)
		{
			a += rem;
			rem = a%b;
			a = a/b;
			hours += a;
		}	
		cout<<hours;
	}
	
	return 0;
}
