#include <iostream> 
#include <unordered_map> 
using namespace std; 
  
#define ll long long

int main() 
{ 
    unordered_map<ll, ll> umap;
    ll n, ans = 0;
    cin>>n;
    while(n--)
	{
  		ll temp;
  		cin>>temp;
  		if(umap.find(temp) == umap.end())
  		{
  			umap[temp] = 1;
		}
		else
		{
			umap.at(temp) += 1;
		}
	}
	
	while(!umap.empty())
	{
		ll max_ = 0, key;
		for(auto x:umap){
			if(max_ < x.first*x.second)
			{
				max_ = x.first*x.second;
				key = x.first;
			}
		}
		
		if(umap.find(key-1) != umap.end() && umap.find(key+1) != umap.end())
		{
			if(umap.at(key -1)*(key-1) + (key+1)*umap.at(key+1) > max_)
			{
				key = key+1;
			}
		}
		
		if(umap.find(key-1) != umap.end())
			umap.erase(key - 1);
		if(umap.find(key+1) != umap.end())
			umap.erase(key + 1);
			
		umap.at(key) -= 1;
		ans += key; 	
		if(umap.at(key) == 0)
			umap.erase(key);
	}
	
	cout<<ans;
	return 0;
}
