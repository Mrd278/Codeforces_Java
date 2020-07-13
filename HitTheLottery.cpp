#include<iostream>
using namespace std;

#define ll long long

int main()
{
	int denominations[5] = {100,20,10,5,1};
	ll cash, ans = 0;
	
	cin>>cash;
	
	for(int i = 0; i < 5; i++)
	{
		if(cash == 0)
			break;
		else if(cash >= denominations[i])
		{
			ans += cash / denominations[i];
			cash = cash % denominations[i];
		}
	}
	
	cout<<ans;
	
	return 0;
}
