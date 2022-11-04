#include <iostream> 
using namespace std; 

int main(){
    int num; 
    cout<<"Enter the integer you want to check: "; 
    cin>>num; 

    if(num>=0){
        cout<<num<<" is a positive integer."; 
    }
    else{
        cout<<num<<" is a negative integer. "; 
    }
    return 0; 
}