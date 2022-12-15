#include <iostream> 
using namespace std; 

int main(){
int * n = new(nothrow) int;
int *arr;
cout<<"Enter the size of the array: "; 
cin>>*n; 
if(!n) {
    cout<<"Memory allocation failed!" ; 
}
else{
    arr = new(nothrow) int[*n];
    if(!arr){
        cout<<"Memory allocation failed!";
    }
    else{
        cout<<"Enter the array elements: "; 
        for(int i =0; i<*n; i++){
            cin>>arr[i];
        }
    }
    cout<<"Array: ";
    for(int i =0; i<*n; i++)
    cout<<arr[i]<<" ";
    cout<<endl;
    
    delete n; 
    delete [] arr; 
    
    return 0;
    

}



}