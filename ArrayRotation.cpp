#include<iostream>
using namespace std;

#define ll long long

// Time Complexity -> O(n)
// Auxiliary space -> O(n)
void rotate(ll arr[], ll d, ll n)
{
	ll new_arr[n];
	for(ll i = 0; i < n; i++)
	{
		new_arr[(i-d+n)%n] = arr[i];
	}
	for(ll i = 0; i < n; i++)
		cout<<new_arr[i]<<" ";
	cout<<endl;
}

int main()
{
	ll arr[100000];
	
	ll d, n, t;
	cin>>t;
	while(t--)
	{
		cin>>n>>d;
		
		for(ll i = 0; i < n; i++)
			cin>>arr[i];
		rotate(arr, d, n);	
	}
	return 0;
}
