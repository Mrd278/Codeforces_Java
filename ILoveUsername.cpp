#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, max_ = -1, min_ = 10000, ans = -2;
	cin>>n;
	for(ll i = 0; i < n; i++)
	{
		ll temp;
		cin>>temp;
		if(max_ < temp)
		{
			max_ = temp;
			ans++;
		}
		if(min_ > temp)
		{
			min_ = temp;
			ans++;
		}
	}
	if(ans < 0)
		cout<<"0";
	else
		cout<<ans;
	return 0;
}
