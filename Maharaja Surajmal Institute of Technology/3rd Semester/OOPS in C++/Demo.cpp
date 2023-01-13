#include<iostream> 
using namespace std; 

int main(){
    int *n = new int();
    int *p = new int();  
    cout<<"Enter the size of the array: "; 
    cin>>*n; 
    cout<<"Enter array Elements: "; 
    for(int i=0; i<*n; i++){
        cin>>p[i]; 
    }

    cout<<"The Array: "; 
     for(int i=0; i<*n; i++){
        cout<<p[i]<<" "; 
    }
    
    delete [] p; 
    delete n;
    
    cout<<"The Array: "; 
     for(int i=0; i<*n; i++){
        cout<<p[i]<<" "; 
    }
}