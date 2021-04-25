#include <iostream> 
using namespace std; 
int main(){
    int n; 
    cin>>n; 
    int arr[n]; 
    for (int i=0; i<n; i++){
        cin>>arr[i]; 
    }

    int k; 
    cin>>k; 
    int ans[n] = {0}; 
    int t=n/k; 
    int count =0;
    int temp =0;
    for (int i=1; i<n; i++){
        if (arr[i]==arr[i-1]){
            count++;
            temp =i;
        }
        else{
            if (count>t){
                ans[i]= arr[temp]; 
                count =0;

            }
            else {
                count =0;
            }
        }
    }
    for (int i=0; i<n; i++){
        if (ans[i]>0){
            cout<<ans[i]<<endl;
        }
    }
    return 0;
}