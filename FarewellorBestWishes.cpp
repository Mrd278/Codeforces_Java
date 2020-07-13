#include<iostream>
using namespace std;

#define ll long long

bool check(ll xi, ll yi, ll x, ll y, ll n, ll m, ll t)
{
    if(x - t%(n - x))
}

int main()
{
    ll n, m, x, y;
    int t;
    cin>>t;
    while(t--)
    {
        ll xi = 1, yi = 1;
        ll time = 1;
        cin>>n>>m>>x>>y;
        while(yi != m+1)
        {
            if(check(xi,yi,x,y,n,m,time))
                break;
            yi++;
            time++;
        }
        while(xi != n+1)
        {

            if(check(xi,yi,x,y,n,m,time))
                break;
            xi++;
            time++;
        }
        if(xi == n && yi == m)
            cout<<"Farewell";
        else
            cout<<"Best Wishes";
    }
    return 0;
}
