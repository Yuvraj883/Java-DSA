#include <iostream> 
#include <bits/stdc++.h> 
using namespace std; 
int main (){
    long long t; 
    cin>>t; 
    while (t>0){
        long long x,r,m; 
        cin>>x>>r>>m; 
        
       if (x>=60*r){
           if (r<=m){
               cout<<"Yes"<<endl;
           }
           else{
               cout<<"No"<<endl;
           }
       }
       else{
           if(x+2*(60*r-x)<=60*m){
               cout<<"Yes"<<endl;
           }
           else{
               cout<<"No"<<endl;
           }
       }
        t--;
    }
    
}