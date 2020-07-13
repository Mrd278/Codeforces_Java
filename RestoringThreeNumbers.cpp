#include<iostream>
#include<algorithm>
using namespace std;

#define ll long long

int main()
{
	ll arr[4], k = 4, i =0;
	
	while(k--)
		cin>>arr[i++];
	sort(arr, arr + 4);
	
	cout<<arr[3] - arr[0]<<" "<<arr[3] - arr[1]<<" "<<arr[3] - arr[2];
	return 0;
}
