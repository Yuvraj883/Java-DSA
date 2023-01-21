#include<iostream> 
using namespace std; 

int main(){
    int n; 
    
    cout<<"Enter the value of n: "; 
    cin>>n; 
    int height[n]; 
    for(int i=0; i<n; i++){
        cin>>height[i]; 
    }
    int start=0, end =0; 
    int sum =0; 
    int val =0; 
    int count = 0; 

    for(int i=0; i<n; i++){
       if(height!=0 && start==0){
           start = i; 
           val = height[i]; 
          
       }
       else if(height[i]==0 && start!=0){

            count++; 
           
       }
       else if(height[i]!=0 && start!=0 ){
           sum += count*val; 
           start = i;
           val = height[i];
           count = 0; 
          
       }
    
    }
    cout<<sum; 
}