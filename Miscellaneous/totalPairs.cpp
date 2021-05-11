#include <iostream> 
using namespace std; 
int main(){
    int n; 
    cin>>n; 
    int arr[n]; 
    for (int i=0; i<n; i++){
       cin>>arr[i]; 
    }

    int x; 
    int y; 
    int count=0; 
    cin>>x>>y; 
    for (int i=0; i<n; i++){
        for (int j=i; j<n; j++){
            if (arr[i]*arr[j]>=x && arr[i]*arr[j]<= y){
                count++; 
            }
        }
    }
    cout<<count; 
    return 0; 
}