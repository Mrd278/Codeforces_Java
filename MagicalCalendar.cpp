#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

void solve()
{
	ll n,k;
	cin>>n>>k;
	if(n > k)
		cout<<k*(k+1)/2<<endl;
	else
		cout<<(n-1)*n/2 + 1<<endl;
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
