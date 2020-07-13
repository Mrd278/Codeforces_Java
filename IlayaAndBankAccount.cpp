#include<bits/stdc++.h>
#include<sstream>
using namespace std;

#define ll long long

int main()
{
	ll amount;
	stringstream ss;
	cin>>amount;
	
	if(amount < 0)
	{
		string value, val;
		ll one, two;
		ss<<amount;
		ss>>value;
		val = value;
		value.erase(value.begin() + value.length() - 1);
		val.erase(val.begin() + val.length() - 2);
		
		one = stoi(value);
		two = stoi(val);
				
		cout<<max(one,two);
	}
	else
		cout<<amount;
}
