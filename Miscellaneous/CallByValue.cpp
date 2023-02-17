#include<iostream> 
using namespace std; 

void swap(int x, int y){
    int temp = x; 
    x = y; 
    y = temp; 
}

int main(){
    int a=10; 
    int b=5; 
    cout<<"Value of a and b before Swap: "<<a<<" "<<b<<endl; 
    swap(a,b); 

    cout<<"Value of a and b after Swap: "<<a<<" "<<b<<endl; 

}