#include<iostream>
#include<algorithm>
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

bool search(ll arr[], ll target)
{
	ll pivot = 0;
	ll size = sizeof(arr)/sizeof(arr[0]);
	for(ll i = 0; i < size-1; i++)
	{
		if(arr[i] > arr[i+1])
		{
			pivot  = i;
			break;	
		}
	}
	cout<<pivot;
	if(binary_search(arr, arr + pivot+1, target) != -1)
		return true;
	if(binary_search(arr + pivot + 1, arr + size, target) != -1)
		return true;
	return false;
}

void rotate(ll arr[], ll n, ll d)
{
	reverse(arr, 0, d);
	reverse(arr, d, n);
	reverse(arr, 0, n);
}

int main()
{
	ll n,d,arr[10000], target;
	cin>>n>>d;
	for(ll i = 0; i < n; i++)
		cin>>arr[i];
	rotate(arr, n, d);
	
	cout<<"Enter the target element :";
	cin>>target;
	if(search(arr, target))
		cout<<"Found";
	else
		cout<<"Not Found";
	return 0;
}
