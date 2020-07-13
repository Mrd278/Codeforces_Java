#include <iostream> 
#include <unordered_map> 
#include<string>
#include<sstream>
using namespace std;

#define ll long long

int main()
{
	ll t;
	cin>>t;
	string name;
	unordered_map<string, ll> umap;
	while(t--)
	{
		cin>>name;
		if(umap.find(name) == umap.end() || umap.empty())
		{
			cout<<"OK"<<endl;
			umap[name] = 1;
		}
		else
		{
			stringstream ss;
			ss<<umap.at(name);
			string num, new_name;
			ss>>num;
			new_name = name + num;
			umap[new_name] = 1;
			umap.at(name) += 1;
			cout<<new_name<<endl;
		}
	}
	return 0;
}
