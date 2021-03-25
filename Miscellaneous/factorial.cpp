#include <iostream> 
using namespace std; 
int fact (int n){
    if (n<=1){
        return 1;
    }
    else {
        return fact(n-1)*n;
    }
}
int main(){
    int t; 
    cin>>t; 
    while (t>0){
        int n;
        cin>>n; 
       cout<< fact(n)<<endl;
        t--;
    }
}