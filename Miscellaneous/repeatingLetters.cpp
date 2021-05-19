#include <bits/stdc++.h> 
using namespace std; 
int main(){
    string str ; 
    getline(cin,str); 
    string aux;
    for (int i=1; i<str.length(); i++){
        if(str[i]==str[i-1]){
            str.erase(str.begin()+i);
        }

    }
    cout<<str<<endl;
    return 0;
}