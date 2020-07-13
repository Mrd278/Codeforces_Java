#include<iostream>
using namespace std;

#define ll long long

int main()
{
	ll n, m;
	bool flag = false;
	cin>>n>>m;
	if(n % 10 == m || n% 10 == 0)
		cout<<"1";
	else
	{
		if( n%10 == m)
		{
			cout<<"1";
		}
		else
		{
			for(ll i = 1; i <= 9; i++)
			{
				if((n%10)*i % 10 == m)
				{
					flag = true;
					cout<<i;
					break;
				}
			}
			if(!flag)
			{
				ll i = 1;
				while(n*i++ % 10);
				cout<<i-1;		
			}
		}
	}
	return 0;
}
