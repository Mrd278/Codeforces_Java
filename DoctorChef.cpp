#include<bits/stdc++.h>
using namespace std;

typedef unsigned long long int ll;
#define deb(x) cout<<#x<<" is "<<x<<endl;

void solve()
{
	ll n, x;
	cin>>n>>x;
	vector<ll> v;
	for(ll i = 0; i < n; i++)
	{
		ll temp;
		cin>>temp;
		v.emplace_back(temp);	
	}
	sort(v.begin(), v.end());
	
	if(x >= v[n-1])
		cout<<n<<'\n';
	
	else
	{
		ll el = 0,days = 1;
		while(1)
		{
			ll ind = lower_bound(v.begin(), v.end(), x) - v.begin();
			
			//deb(ind)
			//deb(x)
			if(ind >= n)
				break;
			
			if(find(v.begin(), v.end(), x) != v.end())
			{
				el++;
				x *= 2;
				days++;
			}
			else if(ind < n)
			{
				while(x < v[ind])
				{
				    if(find(v.begin(), v.end(), x) != v.end())
					{
						el++;
					}
				    
					x *= 2;
					
					days++;
					
					//deb(x)
					//deb(days)
				}
				days++;
				x = v[ind] * 2;
				el++;
			}
		}
		
		//deb(days)
		//deb(el)
		cout<<days + n - el -1<<'\n';
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
