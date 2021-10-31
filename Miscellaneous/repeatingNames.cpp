#include <bits/stdc++.h>
using namespace std;
int main()
{
    string str;
    getline(cin, str);

    vector<string> vec;
   string temp ="";
   for (int i=0; i<str.length(); i++){
       if(str[i]==' '){
           vec.push_back(temp);
           temp ="";
       }
       else{
           temp.push_back(str[i]);
       }
   }
   vec.push_back(temp);
    sort(vec.begin(), vec.end());
    // for(auto i: vec){
    //     cout<<i<<endl; 
    // }
    int count = 1; 
    bool rep = false;
    for (int i=1; i<=vec.size(); i++){
        if(vec[i-1]== vec[i]){
            count++;
            rep = true;
        }
        else if (vec[i-1]!=vec[i] && count >1){
            cout<<count<<" "<<vec[i-1];
            count = 1;
            cout<<endl;
        }

    }
    // if (count>1){
    //     cout<<count<<" "<<vec[vec.size()-1]; 
    // }
    if(rep==false){
        cout<<"-1"<<endl;
    }
   return 0;

}
