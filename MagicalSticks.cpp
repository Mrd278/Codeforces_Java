#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main()
{
	ll t,n;
	cin>>t;
	
	while(t--)
	{
		cin>>n;
		if(n%2 == 0)
			cout<<n/2<<endl;
		else
			cout<<(n+1)/2<<endl;
	}
	return 0;
}
