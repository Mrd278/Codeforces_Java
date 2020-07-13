#include<bits/stdc++.h>
#include<map>
#include<string>
using namespace std;

typedef long long ll;
typedef unsigned long long ull;

#define mod 1000000007

vector<vector<int>> v(8, vector<int>(8,-1));
 
void solve()
{
	ll k;
	cin>>k;
	v[0][0] = 0;
	v[0][1] = 1;
	v[1][0] = 1;
	v[1][1] = 1;
	
	for(int i = 0; i < 8; i++)
	{
		if(k == 0)
			break;
		for(int j = 0; j < 8; j++)
		{
			if(k == 0)
				break;
			if(i != 0 || j != 0)
			{
				v[i][j] = -1;
				if(i+1 < 8)
					v[i+1][j] = 1;
				if(j+1 < 8)
					v[i][j+1] = 1;
				if(i+1 < 8 && j+1 < 8)
					v[i+1][j+1] = 1;
			}
			k--;
		}
	}
	
	for(int i = 0; i < 8; i++)
	{
		for(int j = 0; j < 8; j++)
		{
			if(v[i][j] == 0)
				cout<<"O";
			else if(v[i][j] == -1)
				cout<<".";
			else if(v[i][j] == 1)
				cout<<"X";
		}
		cout<<endl;
	}
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	cout<<fixed;
	cout<<setprecision(10);
	
	ll t;
	cin>>t;
	while(t--)
		solve();
	return 0;
}
