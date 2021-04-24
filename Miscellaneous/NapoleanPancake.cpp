#include <iostream> 
using namespace std; 
int main(){
    long long t; 
    cin>>t; 
    while (t--){
        long long pcs ; 
        cin>>pcs; 
        long long arr[pcs];
        
        for (long long i=0; i<pcs; i++){
            cin>>arr[i];
        }
    long long temp = arr[pcs-1];
        for (long long i=pcs-1; i>=0;i-- ){
            if (temp !=0|| arr[i]!=0){
                cout<<"1 ";
                temp = max(temp, arr[i]);
                temp--;
            }
            else{
                cout<<"0 ";
                temp = arr[i];
            }
        }
        cout<<endl;
    }
    return 0; 
}