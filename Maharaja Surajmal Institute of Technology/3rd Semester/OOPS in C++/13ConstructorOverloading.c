#include<iostream> 
using namespace std; 

class Add{
    int a,b; 
public:
    Add(){
        a=10;
        b=20;
        cout<<"Default Cosntructor: "<<a<<" + "<<b<<" = "<<a+b;  
        cout<<endl;
    }
    
    Add(int x, int y){
        a = x; 
        b = y; 
        cout<<"Parameterised Cosntructor: "<<x<<" + "<<y<<" = "<<a+b; 
        cout<<endl;
    }

}; 

int main(){
    Add a; 
    Add b(10,15);
}