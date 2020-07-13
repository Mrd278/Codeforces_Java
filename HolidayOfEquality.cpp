#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, ctz[100], max_ = 0, s = 0;
	cin>>n;
	for(ll i = 0; i < n; i++)
	{
		cin>>ctz[i];
		max_ = max(max_, ctz[i]);
	}
	
	for(ll i = 0; i < n; i++)
		s += max_ - ctz[i];
		
	cout<<s;
	
	return 0;
}
