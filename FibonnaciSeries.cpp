#include<bits/stdc++.h>
#include<map>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

#define mod 1000000007

map<ll, ll> m;

ll Fact(ll n)
{
	if(n <= 1)
		return 1;
	else
	{
		if(m.find(n-1) == m.end() || m.find(n-2) == m.end())
		{
			if(m.find(n-1) != m.end() && m.find(n-2) == m.end())
			{
				ll temp = Fact(n-2);
				m[n-1] = temp;
				
			}
			else if(m.find(n-1) == m.end() && m.find(n-2) != m.end())
			{
				ll temp = Fact(n-1);
				m[n-1] = temp;
			}
			else
			{
				ll temp = Fact(n-1);
				ll temp2 = Fact(n-2);
				m[n-1] = temp;
				m[n-2] = temp2;
			}
		}
		return m[n-1] + m[n-2];
	}	
}

void solve()
{
	ll n;
	cin>>n;
	for(ll i = 0; i < n; i++)
		cout<<Fact(i)<<" ";
	cout<<endl;
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
