#include<iostream>
#include<string>
#include<bits/stdc++.h>
//#include<cstring>
using namespace std;

int main()
{
    long long t, n, q, k, i, j, sum, p = 0;
    long long answers[100000];
    cin>>t;
    string s;

    while(t--)
    {
        cin>>n;
        cin>>q;
        cin>>s;
        for(i = 0; i < q; i++)
        {
            cin>>k;
            sum = 0;
            string new_s;
            for(j = 0; j < s.length(); j++)
            {
                size_t found = new_s.find(s[j]);
                if(!(found != string::npos))
                {
                    long long res = count(s.begin(),s.end(),s[j]) - k;
                    if(res > 0)
                        sum += res;
                    new_s.push_back(s[j]);
                }
            }
            //cout<<"sum "<<sum<<endl;
            answers[p++] = sum;
        }
    }
    answers[p] = '\0';
    for(i = 0; i < q; i++)
    {
        cout<<answers[i]<<endl;
    }

    return 0;
}
