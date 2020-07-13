#include<iostream>
#include<math.h>
using namespace std;

// n positive integers a1,a2,...,an = (1,a1)
// deciding factor - Area of container = min(y1,y2)*(x); x = (i+x - i)

// conditions that you may not slant the container and n is at leat 2
// if it is not slant -> y1 == y2; Area = y1*x;

// Time Complexity -> O(n^2) soln 1

// Soln 2 -> two pointers at each end when they meet it will be max; smaller will move inwards

int abs(int k)
{
    return (sqrt(pow(k,2)));
}

void Max_Area_Calculator(int arr[], int size)
{
	int Area = 0, x1, x2;
	for(int i = 0; i<size; i++)
	{
		for(int j = 0; j<size; j++)
		{
			if(arr[i] == arr[j] && i != j)
			{
				if(Area < (arr[i]*abs(j - i)))
				{
					Area = (arr[i]*abs(j - i));
					x1 = i;
					x2 = j;
				}
			}
		}
	}
	cout<<"Two lines are: \n";
	cout<<"("<<x1<<","<<arr[x1]<<") ";
	cout<<"("<<x2<<","<<arr[x2]<<")";
}


int main()
{
	int n;
	cout<<"Enter the value of n:";
	cin>>n;

	int arr[20];
	cout<<"Enter the values in array\n";
	for(int i = 0; i<n; i++)
	{
		cin>>arr[i];
	}

	Max_Area_Calculator(arr, n);
}

