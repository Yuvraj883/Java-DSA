#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    sort(arr, arr + n);
    int count = 1;
    vector<int> lucky;
    for (int i = 1; i < n; i++)
    {
        if (arr[i] == arr[i - 1])
        {
            count++;
        }
        else if (arr[i] != arr[i - 1] && count > 1)
        {
            lucky.push_back(arr[i]);
            count = 0;
        }
    }
    if (lucky.size() == 0)
    {
        cout << "-1" << endl;
    }
    else
    {
        int max = *max_element(lucky.begin(), lucky.end());
        cout << max << endl;
    }

    return 0;
}
