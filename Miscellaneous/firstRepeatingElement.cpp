#include <bits/stdc++.h> 

using namespace std; 
int main(){
    int n ; 
    cin >>n; 
    int arr[n];
    for (int i=0; i<n; i++){
        cin>>arr[i]; 
    }

    int aux[n]; 
    for (int i=0; i<n; i++){
        aux[i]= arr[i]; 
    }
    sort (aux, aux+n); 
    int ele=0; 
    for (int i=1; i<n; i++){
    int prev = aux [i-1]; 

        if (prev == aux[i]){
            ele = aux[i]; 
        }
    }

    for (int i=0; i<n; i++){
        if(ele ==arr[i]){
            cout<<i; 
            cout<<endl; 
            return 0;
            
        }
    }

   
    cout<<endl; 


    //return 0; 
}