#include<iostream>
using namespace std;

int main()
{
	int a,b;
	cin>>a>>b;
	
	cout<<min(a,b)<<" "<<(max(a,b) - min(a,b))/2;
	return 0;
}
