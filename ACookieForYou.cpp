#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

void solve()
{
	ll a,b,n,m;
	cin>>a>>b>>n>>m;
	if((a+b) < (n+m))
		cout<<"NO"<<endl;
	else
	{
		if(min(a,b) < m)
			cout<<"NO"<<endl;
		else
		{
			if(max(a,b) + min(a,b) - m < n)
				cout<<"NO"<<endl;
			else
				cout<<"YES"<<endl;
		}
	}
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
