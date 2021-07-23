#include<iostream> 
#include <bits/stdc++.h> 
using namespace std; 
int main(){
 int t; 
 cin>>t;    
 while (t>0){
     long n ; 
     cin>>n; 
     int  c1, c2; 
     c1 = n/3; 
     c2 = c1; 
     int sum = c1+(2*c2); 
     if(n-sum==2){
         c2++; 
     }
     else if(n-sum==1){
         c1++; 
     }
     int res = c1-c2; 
     cout<<c1<<" "<<c2;
     cout<<endl;  
     t--;
 }

}