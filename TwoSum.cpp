#include<iostream>
using namespace std;

/*arr = [a,b,c,d,e,f,g,h]
    sum = S
    Sol 1:
    for(int i = 0; i<strlen(arr); i++)
        for(int j)
            if(arr[i] != arr[j])
                if(S == (arr[i]+arr[j])
                   cout<<i<<" "<<j;
                   break;
    Sol 2:
    Let's say, S-a = k
    index = BinarySearch(k);
    */

    // Soln Implemented will be Soln 2:


// Time Complexity of the Soln 1 = O(n^2) and Soln 2 = O(nlog(n))
// Best Solution for this Problem is Using HashMap with Time Complexity = O(N)

// Binary Search Function which returns the index of other half
int binarysearch(int arr[], int k, int n)
{
    int beg = 0;
    int ends = n-1;

    while(beg <= ends)
    {
        int mid = (beg+ends)/2;
        if(arr[mid] == k)
        {
            return mid;
        }
        else if(arr[mid] > k)
        {
            ends = mid - 1;
        }
        else
        {
            beg = mid + 1;
        }
    }

    return -1;
}

// CheckSum iterate different values and Calls Binary Search
void checkSum(int arr[], int target, int n)
{
    int flag = 0;
    for(int i = 0; arr[i]; i++)
    {
        int k = target - arr[i];
        int index = binarysearch(arr, k, n);
        if((arr[index] != arr[i]) && index >= 0)
        {
            cout<<"["<<i<<", "<<index<<"]";
            flag = 1;
            break;
        }
    }
    if(!flag)
        cout<<"No Pair Found!!";
}

// Main Function
int main(){
    int n,arr[20],target;
    cout<<"Enter the size of the array: ";
    cin>>n;
    cout<<"Enter the Elements: \n";
    for(int i = 0; i<n; i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter the Target: ";
    cin>>target;
    checkSum(arr, target, n);
}
