#include <iostream>
using namespace std;
int searchElement(int arr[], int idx, int x, int n)
{
    if (idx == n)
    {
        return -1;
    }
    int ans = searchElement(arr, idx + 1, x, n);

    if (arr[idx] == x)
    {
        return idx;
    }
    else
    {
        return ans;
    }
}
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int x;
    cin >> x;
    cout << searchElement(arr, 0, x, n);
    cout << endl;
    return 0;
}