#include <iostream>
#include <vector> 
using namespace std; 
int main(){
        int n; 
        cin>>n; 
        vector<int> vec;
        for (int i=0; i<n; i++){
            int val ; 
            cin>>val; 
            vec.push_back(val);
        }
        int max = vec[0]; 
        int idx = 0;
        for(int i=1; i<vec.size(); i++){
            if (max<vec[i]){
                max = vec[i];
                idx = i; 
            }
        }
        cout<<max<<" "<<idx;
        cout<<endl; 
        return 0; 
}