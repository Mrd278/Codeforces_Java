#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll t;
	cin>>t;
	while(t--)
	{
		ll temp;
		cin>>temp;
		
		if(temp == 2 || (temp/2)%2 != 0)
			cout<<"NO"<<endl;
		else
		{
			ll s = 0;
			cout<<"YES"<<endl;
			for(ll i = 1; i <= temp/2; i++)
			{
				cout<<i*2<<" ";
			}
			
			for(ll i = 1; i < temp/2; i++)
			{
				s += 2*i-1;
				cout<<2*i-1<<" ";
			}
			cout<<(temp/2)*(temp/2 + 1) - s<<endl;
		}
	}
	return 0;
}
