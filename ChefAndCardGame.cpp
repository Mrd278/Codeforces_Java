#include<bits/stdc++.h>
#include<map>
#include<string>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

#define mod 1000000007

ull sum_of_digits(ull n)
{
	ull sum = 0;
	while(n != 0)
	{
		sum += n % 10;
		n = n/10;
	}
	return sum;
}

void solve()
{
	ll n, chef = 0, morty = 0;
	cin>>n;
	for(ll i = 0; i < n; i++)
	{
		ull a, b, sum_a, sum_b;
		cin>>a>>b;
		sum_a = sum_of_digits(a);
		sum_b = sum_of_digits(b);
		if(sum_a > sum_b)
			chef++;
		else if(sum_a < sum_b)
			morty++;
		else
		{
			chef++;
			morty++;		
		}
	}
	
	if(chef > morty)
		cout<<"0 "<<chef<<endl;
	else if(chef < morty)
		cout<<"1 "<<morty<<endl;
	else
		cout<<"2 "<<chef<<endl;
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
