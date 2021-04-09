#include <iostream> 
using namespace std; 
int main(){
    int n; 
    cin>>n; 
    int m; 
    cin>>m; 
    int arr[m];
    for (int i=0; i<m; i++){
        cin>>arr[i];
    }
    bool x= false;
    for(int i=0; i<m; i++){
        if (arr[i]==n){
            cout<<"true"<<endl;
            x=true;
            break;
        }
        
    }
    if(x==0){
        cout<<"false"<<endl;
    }
}