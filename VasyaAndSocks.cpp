#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, m, days = 1;
	cin>>n>>m;
	
	while(n)
	{
		n -= 1;
		if(days % m == 0)
			n += 1;
		days++;
	}
	cout<<days-1;
	return 0;
}
