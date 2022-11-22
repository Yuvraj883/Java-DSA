#include <bits/stdc++.h> 
using namespace std; 

string reverseWord(string str); 

int main(){
    int t; 
    cin>>t; 
    while(t--){
        string s; 
        cin>>s; 
        cout<<reverseWord(s)<<endl; 
    }
}



string reverseWord(string str){
    
  //Your code here
  string s = ""; 
  for(int i = str.length()-1; i>=0; i--){
      s += str[i]; 
  }
//   cout<<s; 
  return s; 
}
