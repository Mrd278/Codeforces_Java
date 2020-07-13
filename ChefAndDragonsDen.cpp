#include<bits/stdc++.h>
#include<vector>
using namespace std;

typedef unsigned long long int ll;
#define deb(x) cout<<#x<<" is "<<x<<endl;

#define loop(i,s,n) for(int i = s; i < n; i++)

void solve()
{
	ll n,q;
	vector<ll> h;
	vector<ll> a;
	bool flag = true;
	vector<pair<ll, pair<ll,ll>>> queries;
	cin>>n>>q;
	loop(i,0,n)
	{
		ll temp;
		cin>>temp;
		h.emplace_back(temp);
	}
	loop(i,0,n)
	{
		ll temp;
		cin>>temp;
		a.emplace_back(temp);
	}
	
	loop(i,0,q)
	{
		ll t1,t2,t3;
		cin>>t1>>t2>>t3;
		
		queries.emplace_back(make_pair(t1,make_pair(t2,t3)));
	}
	
	loop(i,0,q)
	{
		if(queries[i].first == 1)
		{
			a[queries[i].second.first-1] = queries[i].second.second;
		}
		else
		{
			ll start = queries[i].second.first - 1;
			ll destination = queries[i].second.second - 1;
			
			if(h[start] < h[destination])
			{
				cout<<"-1"<<'\n';
			}
			else
			{
				ll s = 0;
			
				if(destination > start)
				{
					swap(destination,start);
				}
				
				//deb(destination)
				//deb(start)
				
				ll previous = h[destination], j = destination;
				
				//deb(j)
				//deb(previous)
				
				while(1)
				{
					if(h[j] > h[start] && h[j] > previous)
					{
						//deb(h[j])
						cout<<"-1"<<endl;
						flag = false;
						break;	
					}
					if(j == start)
					{
						//deb(j)
						s += a[j];
						break;
					}
					if(h[j] >= previous)
					{
						//deb(j)
						//deb(previous)
						//deb(h[j])
						s += a[j];
						previous = h[j];
					}
					j++;
					//deb(s)
				}	
				//deb(flag)
				if(flag)
					cout<<s<<'\n';	
			}
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
	solve();
	return 0;
}
