#include <iostream>
using namespace std;
int main()
{
    long long t;
    cin >> t;
    while (t--)
    {
        long long pcs; //Number of layers in pancake
        cin >> pcs;
        long long arr[pcs];

        for (long long i = 0; i < pcs; i++)
        {
            cin >> arr[i];
        }
        long long ans[pcs] = {0}; //initialising all the elements of the ans array to 0.
        long long temp = arr[pcs - 1];

        for (long long i = pcs - 1; i >= 0; i--)
        {
            if (temp != 0 || arr[i] != 0)
            {
                ans[i] = 1;
                temp = max(temp, arr[i]);
                temp--;
            }
            else
            {

                temp = arr[i];
            }
        }
        for (long long i = 0; i < pcs; i++)
        {
            cout << ans[i] << " ";
        }
        cout << endl;
    }
    return 0;
}