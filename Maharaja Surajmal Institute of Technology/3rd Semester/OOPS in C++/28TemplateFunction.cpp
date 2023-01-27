#include<iostream> 
using namespace std; 

template <typename T>T Max(T a, T b){
    return (a>b)?a:b;
}
template <typename T>T Min(T a, T b){
    return (a<b)?a:b;
}

int main(){
    int a,b; 
    cout<<"Enter the values of a and b: "; 
    cin>>a>>b; 
    cout<< Max<int>(a,b)<<" is greater than "<<Min(a,b)<<endl;
    char c,d; 
    cout<<"Enter two character values: "; 
    cin>>c>>d; 
    cout<<Max<char>(c,d)<<" has a greater ASCII value than "<<Min(c,d)<<endl;
}