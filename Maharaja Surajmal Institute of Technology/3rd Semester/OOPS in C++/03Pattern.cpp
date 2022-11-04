#include <iostream> 
using namespace std; 

int main(){ 
    int n=5; 
    for (int i =1; i<=n+1; i++){
        for(int k=i; k<=n; k++){
            cout<<" ";
        }
        for(int j=1;j<i; j++){
            cout<<" *";
        }

        cout<<endl;
    }

     for (int i =n; i>=0; i--){
        for(int k=n; k>=i; k--){
            cout<<" ";
        }
        for(int j=i; j>0; j--){
            cout<<"* ";
        }

        cout<<endl;
    }
}