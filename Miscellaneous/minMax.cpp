#include <iostream>
#include <bits/stdc++.h> 
using namespace std; 
int main(){
    int n; 
    cin>> n; 
    int *arr = new int[n] ;
    for (int i=0; i<n; i++){
        cin>>arr[i];
    }

    sort(arr, arr+n); 
    cout<<arr[0]<<" is min"<<endl; 
    cout<<arr[n-1]<<" is max"<<endl; 
    return 0; 
}