#include<bits/stdc++.h>
#include<string>
using namespace std;

#define fo(i, n) for(int i = 0; i < n; i++)

typedef long long int ll;

void solve()
{
	int m,s, max_ = 0;
	cin>>m>>s;
	string maximum, minimum;
	
	if(s == 0 && m <= 1)
		cout<<"0 0"<<endl;
	else if((s == 0 && m > 1) || (s > 9*pow(2,m-1)))
		cout<<"-1 -1"<<endl;
	else
	{
		fo(i,m)
		{
			s = s - max_;
			max_ = min(9,s);
			maximum.append(to_string(max_));
		}
		
		minimum = maximum;
		
		reverse(minimum.begin(),minimum.end());
		
		if(minimum[0] == '0')
		{
			string temp = minimum;
			int k = 0;
			fo(i, minimum.size())
			{
				if(int(minimum[i]) - 48 > 0)
				{
					//cout<<int(minimum[i]) - 48<<endl;
					minimum.replace(0,1,"1");
					minimum.replace(i,i+1, to_string(int(minimum[i]) - 48 -1));
					k = i;
					break;
				}
			}
			minimum.append(temp.substr(k+1, temp.size()));
		}
		
		cout<<minimum<<" "<<maximum<<endl;
	}
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	cout<<fixed;
	cout<<setprecision(10);
	solve();
	return 0;
}
