#include<bits/stdc++.h>
#include<map>
#include<string>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

#define mod 1000000007

ll num[100000];

void solve()
{
	ll n, sum = 0;
	cin>>n;
	for(ll i = 0; i < n; i++)
		cin>>num[i];
	for(ll i = 0; i < n-1; i++)
	{
		if(num[i] != num[i+1])
			sum += abs(num[i] - num[i+1])-1;
	}
	cout<<sum<<endl;
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
