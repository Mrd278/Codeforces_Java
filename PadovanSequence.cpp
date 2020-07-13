#include<bits/stdc++.h>
#include<map>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

#define mod 1000000007

map<ll, ll> m;

ll Padovan(ll n)
{
	if(n <= 2)
		return 1;
	else
	{
		if(m.find(n-2) == m.end() || m.find(n-3) == m.end())
		{
			if(m.find(n-2) != m.end() && m.find(n-3) == m.end())
			{
				ll temp = Padovan(n-3);
				m[n-3] = temp;
				
			}
			else if(m.find(n-2) == m.end() && m.find(n-3) != m.end())
			{
				ll temp = Padovan(n-2);
				m[n-2] = temp;
			}
			else
			{
				ll temp = Padovan(n-2);
				ll temp2 = Padovan(n-3);
				m[n-2] = temp;
				m[n-3] = temp2;
			}
		}
		return ((m[n-2]%mod) + (m[n-3]%mod))%mod;
	}	
}

void solve()
{
	ll n;
	cin>>n;
	cout<<Padovan(n)<<endl;
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
