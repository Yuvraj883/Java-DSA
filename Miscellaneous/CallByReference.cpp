#include<iostream> 
using namespace std; 

void swap(int *x, int *y){
    int temp = *x; 
    *x = *y; 
    *y = temp; 

}

int main(){
    int x=5; 
    int y=10; 
    cout<<"Before Swap x= "<<x<<" and y="<<y<<endl; 
    swap(&x,&y); 
    cout<<"After Swap x= "<<x<<" and y="<<y<<endl; 


}