#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;

ll min(ll a, ll b)
{
    if(a<b)
    {
        return a;
    }
    return b;
}

int main()
{
    ll t;
    cin>>t;
    while (t-- !=0)
    {
        ll n, k, m;
        cin>>n>>m>>k;
        double matrix[n+1][m+1];
        for (ll i = 0; i <= n; i++)
        {
            for (ll j = 0; j <= m; j++)
            {
                if (i==0 || j==0)
                {
                    matrix[i][j]=0;
                }
                else
                {
                    cin>>matrix[i][j];
                }
            }
        }
        for (ll i = 0; i <= n; i++)
        {
            double p=0;
            for (ll j = 0; j <= m; j++)
            {
                matrix[i][j]+=p;
                p = matrix[i][j];
            }
            
        }
        for (ll j = 0; j <= m; j++)
        {
            double p=0;
            for (ll i = 0; i <= n; i++)
            {
                matrix[i][j]+= p;
                p = matrix[i][j];
            }
            
        }
        ll minimum = min(n, m);
        ll ans = 0;
        for (ll length = 1; length <= minimum; length++)
        {
            for (ll i = length; i <= n; i++)
            {
                for (ll j = length; j <= m; j++)
                {
                    if ((matrix[i][j] + matrix[i-length][j-length] - matrix[i][j-length] - matrix[i-length][j]) / (length*length) >= k)
                    {
                        ans++;
                    }
                    
                }
                
            }
            
        }
        cout<<ans<<endl;
    }
    
    return 0;
}