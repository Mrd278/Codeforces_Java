#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, k, page = 0, ans = 0;
	cin>>n>>k;
	for(ll i = 0; i < n; i++)
	{
		ll temp;
		cin>>temp;
		if(temp < k)
		{
			page += 1;
			
			if(temp >= page)
				ans += 1;
		}
		else
		{
			ll rem = temp % k;
			ll div = temp/k;
			ll j = 1;
			while(div--)
			{
				page += 1;
				if(page > (j*k - k) && page <= j*k)
					ans += 1;
				j++;
			}
			if(rem > 0)
			{
				page += 1;
				if(page > (temp - rem) && page <= temp)
					ans += 1;
			}
		}
	}	
	
	cout<<ans;
	return 0;
}
