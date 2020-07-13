#include<bits/stdc++.h>
#include<math.h>
using namespace std;

#define ll long long

int main()
{
	ll n, m, a, b;
	
	cin>>n>>m>>a>>b;
	
	if(a <= (float)b / m)
		cout<<n*a;
	else
	{
		if(n%m == 0)
			cout<< (n / m) * b;
		else
			cout<<min( n/m * b + b, n/m * b + n%m * a);	
	}
	return 0;
}
