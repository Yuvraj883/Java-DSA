#include<iostream> 
using namespace std; 

template<class T> T sum(T a, T b){
    cout<<"Function with variables of type Template T called."<<endl; 
    return (a+b); 
}

int sum(int a, int b){
    cout<<"Function with variables of type int called."<<endl;
    return a+b;  
}

int main(){
    cout<<sum(5,7)<<endl; 
    cout<<sum(5.5,7.8);

}