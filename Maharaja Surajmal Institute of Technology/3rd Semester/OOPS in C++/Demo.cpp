#include<iostream> 
using namespace std; 

class One{
    public: 
    int a = 10; 

}; 

class Two{
    public:
    One o;  
    int b = 20; 
    int c = b+o.a; 

}; 

int main(){
    Two t; 
    cout<<t.c; 
}