#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

int arr[300][300];

void solve()
{
	ll n,k;
	cin>>n>>k;
	if(k%n == 0)
		cout<<"0"<<endl;
	else
		cout<<"2"<<endl;
	
	memset(arr, 0, sizeof(arr));
	for(ll i = 0; i < n && k; i++)
	{
		for(ll j = 0; j < n && k; j++)
		{
			ll x = j;
			ll y = (i+j)%n;
			arr[x][y] = 1;
			k--;
		}
	}
	
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n; j++)
		{
			cout<<arr[i][j]<<" ";
		}
		cout<<endl;
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
