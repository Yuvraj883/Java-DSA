#include<iostream> 
using namespace std; 

template<class T>
class Vector{
    public: 
    T *arr; 
    int size=4;
    int i=0;
    Vector(){
        // size = n; 
        arr= new int[size]; 
    }

    void push(int el){
        if(i==size-1){
            size = size*2; 
        }
        arr[i]=el; 
        i++; 
    }

    void display(){
        for(int j=0; j<i; j++){
            cout<<arr[j]<<" "; 
        }
    }
}; 

int main(){
    
    Vector<int> v;
    v.push(1); 
    v.push(2); 
    v.push(3);
    v.push(4);
    v.push(5);  
    v.display(); 
}