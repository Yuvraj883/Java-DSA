#include<iostream> 
using namespace std; 

class Demo{
    int *arr;
    int n; 
    public: 
    Demo(int n){
        arr = new int[n];
        this->n = n;
        cout<<"Enter the array elements: "; 
        for(int i=0; i<n; i++){
            cin>>arr[i];
        }
    }
    void display(){
        cout<<"Array: "; 
        for(int i=0; i<n; i++){
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }
};

int main(){
    int n; 
    cout<<"Enter the size of the array: "; 
    cin>>n; 
    Demo d(n);
    d.display();

}