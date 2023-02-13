#include<iostream> 
#include<iterator>
#include<vector>

using namespace std; 

int main(){
    vector<int> ar = {1,2,3,4,5}; 
    vector<int>::iterator ptr = ar.begin(); 
    // ptr = advance(ptr,2); 
    cout<<*ptr<<endl; 
    return 0; 
}