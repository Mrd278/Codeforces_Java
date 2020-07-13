#include<iostream>
#include<string>
//using namespace std;

long long n;
string str;
string str_store[100000];

void solve(string str, string str_store[], int j, int k)
{
	int c = k;
	string temp = str;

	for(int i = 0; i < j; i++)
	{
		if(str_store[i] == str)
		{
			c++;
		}
		else
		{
			str_store[j] = str;
			if(c = 0)
			{
				cout<<"OK";
			}
			else
			{
				cout<<str;
			}
		}
	}

	if(c)
	{
		str = str + char(c);
		solve(temp, str_store, j, c);
	}
}

int main()
{
	cin>>n;
	for(int i = 0; i < n; i++)
	{
		cin>>str;
		if(i)
			solve(str, str_store, i, 0);
		else
			str_store[i] = str;
	}
	return 0;
}
