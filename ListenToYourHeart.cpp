#include<bits/stdc++.h>
using namespace std;

#define ll long long

int main()
{
	ll x = -1;
	
	while(true)
	{
		x++;
		ll res = pow(pow(x-3, 0.5) - pow((3*x + 2)/2, 1.5), 7) - pow(x - pow((pow(x,2) - 1984)/5, 0.5), 3);
		if(res == 0)
			break;
	}
	cout<<x;
}

