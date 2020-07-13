#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, destination, transport[100000], current = 1;
	
	cin>>n>>destination;
	for(ll i = 0; i < n-1; i++)
		cin>>transport[i];
	
	while(true)
	{
		if(current == destination)
		{
			cout<<"YES";
			break;
		}
		if(current > destination)
		{
			cout<<"NO";
			break;
		}
		else
		{
			current += transport[current-1];
		}
	}
	return 0;
}
