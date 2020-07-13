#include<bits/stdc++.h>
#include<map>
#include<string>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

#define mod 1000000007

void solve()
{
	ll n;
	cin>>n;
	ll count = 0;
	for(ll i = 1; i <= n; i++)
	{
		string s = to_string(i);
		if(s.find("4") != string::npos)
			count++;
	}
	cout<<count<<endl;
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
