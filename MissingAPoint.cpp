#include<bits/stdc++.h>
#include<map>
using namespace std;

typedef long long int ll;
typedef unsigned long long int ull;

#define mod 1000000007

void solve()
{
	ull n;
	ll a,b;
	cin>>n;
	
	map<ll,ll> x;
	map<ll, ll> y;
	
	for(ull i = 0; i < 4*n-1; i++)
	{
		ll temp1, temp2;
		cin>>temp1>>temp2;
		x[temp1]++;
		y[temp2]++;
	}
	
	for(auto val: x)
	{
		if(val.second % 2 != 0){
			a = val.first;
			break;
		}
	}
	
	for(auto val: y)
	{
		if(val.second % 2 != 0)
		{
			b = val.first;
			break;
		}
	}
	
	cout<<a<<" "<<b<<endl;
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
