#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
    int t;
    cin>>t;

    while (t--)
    {
        long long n;
        cin>>n;
        long long sum = 0;

        sum = (n/4)*44;
        int r = (n%4);
        if (n>=4)
        {
            if (r == 0)
            {
                sum = sum + 16;
            }
            if (r == 1)
            {
                sum = sum + 32;
            }
            if (r == 2)
            {
                sum = sum + 44;
            }
            if (r == 3)
            {
                sum = sum + 55;
            }
            cout<<sum<<endl;
        }
        else
        {
            int R;
            if (r == 1)
            {
                R = 20;
            }
            if (r == 2)
            {
                R = 36;
            }
            if (r == 3)
            {
                R = 51;
            }
            cout<<R<<endl;
        }
        
    }
    
    return 0;
}