#include<iostream>
#include<string>
using namespace std;

#define ll long long

int main()
{
	ll t;
	cin>>t;
	
	while(t--)
	{
		ll n, i = -1;
		cin>>n;
		string s;
		cin>>s;
		
		while( i != s.length()-2)
		{
			i++;
			if(s.at(i) == '1' && s.at(i+1) == '0' && i+1 < s.length())
			{
				s.erase(s.begin() + i);
				i = -1;
			}
		}
		cout<<s<<endl;
	}
	return 0;
}
