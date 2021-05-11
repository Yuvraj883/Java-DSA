#include <iostream> 
#include <bits/stdc++.h> 
using namespace std; 
int main(){
    long long t; 
    cin>>t;
    while (t--){
    string s1;
    string s2;
cin>>s1;
cin>>s2;
    int sum1 =0;
      for (int i = 0; s1.length()>i; i++)
        sum1 = sum1 + s1[i];
    
    int sum2 =0;
      for (int i = 0; s2.length()>i; i++)
        sum2 = sum2 + s2[i];

  int diff = abs(sum1-sum2);
  if (diff >=1 && diff<=10){
      cout<<"Mohit"<<endl;
  }
else{
    cout<<"Rashmi"<<endl;
}
    }
}