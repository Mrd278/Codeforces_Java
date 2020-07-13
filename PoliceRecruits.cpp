#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, officers = 0, crime = 0;
	cin>>n;
	
	for(ll i = 0; i < n; i++)
	{
		ll temp;
		cin>>temp;
		if(temp > 0)
			officers += temp;
		else if(temp < 0)
		{
			if(officers > 0)
				officers -= 1;
			else
				crime++;
		}
	}
	cout<<crime;
	return 0;
	
}
