#include <bits/stdc++.h>

using namespace std;
#define ll long long int

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        ll n, x, days = 0;
        cin >> n >> x;
        vector<ll> cases(n);
        for (int i = 0; i < n; i++)
        {
            cin >> cases[i];
        }

        sort(cases.begin(), cases.end());
        ll ind = lower_bound(cases.begin(), cases.end(), x) - cases.begin();

        for (ll i = ind; i < n; i++)
        {
            if (x < cases[i])
            {
                while (x < cases[i])
                {
                    x = x * 2;
                    days++;
                }
                days++;
            }
            else
            {
                days++;
            }
            x = 2 * cases[i];
        }

        ll ans = ind + days;
        if (ind != 0)
        {
            days = 0;
            ind--;
            for (int i = ind; i < n; i++)
            {
                if (x < cases[i])
                {
                    while (x < cases[i])
                    {
                        x = 2 * x;
                        days++;
                    }
                    days++;
                }
                else
                {
                    days++;
                }
                x = 2 * cases[i];
            }
            cout<<min(ans, ind + days)<<endl;
        }
        else
        {
        	cout<<ans<<endl;
		}
    }
    return 0;
}
