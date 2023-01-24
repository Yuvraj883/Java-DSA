#include <bits/stdc++.h>
#include<string>
using namespace std; 

string stringChallenge(string str){
     istringstream s(str);
    string word, s1, s2, s3; 
  string arr[2];
  int i=0;
    while(s>>word){
        arr[i]=word;
        cout<<word;
        i++;
    }
    s1 = arr[0];
    s2 = arr[1];
    i=0;
    int j=0;
    while(i<s1.length()){
        while(j<s2.length()){
            if(s2[j]=='+' && s1[i-1]!=s1[i-2]){
                i++; 
                j++;
                cout<<i<<" "<<j;
            }
            else if(s2[j]=='*' && s2[j+1]=='{'){
                for(int k=0; k<int(s2[j+2])-48; k++){
                    if(s1[i]!=s1[i+1]){
                cout<<i<<" "<<j;

                        return "false";
                    }
                    else{
                cout<<i<<" "<<j;

                        i++;
                    }

                }
             j+=3;
            }
            else if(s2[j]=='*' && j+1<s2.length() && s2[j+1]!='{'){
                for(int k=0; k<3; k++){
                    if(s1[i]!=s1[i+1]){
                cout<<i<<" "<<j;

                        return "false";
                    }
                    else{
                cout<<i<<" "<<j;

                        i++;
                    }
                }
                j++;
            }
        }
    }
    
    
    
    return "true";
    
}

int main(){
    string s1; 
    getline(cin, s1); 
    cout<<stringChallenge(s1);
   
 
}