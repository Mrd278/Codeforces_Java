#include<iostream>
using namespace std;

#define ll long long

// Time Complexity -> O(n)
void reverse(ll arr[], ll beg, ll end)
{
	for(ll i = beg, j = end - 1; i < j; i++, j--)
	{
		ll temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

void rotate(ll arr[], ll n, ll d)
{
	reverse(arr, 0, d);
	reverse(arr, d, n);
	reverse(arr, 0, n);
}

int main()
{
	ll n,d,arr[10000];
	cin>>n>>d;
	for(ll i = 0; i < n; i++)
		cin>>arr[i];
	rotate(arr, n, d);
	for(ll i = 0; i < n; i++)
		cout<<arr[i]<<" ";
	return 0;
}
