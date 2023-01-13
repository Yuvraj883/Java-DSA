#include<iostream> 
using namespace std; 

class A{
    public: 
    int a; 
    A(){
        a=9;
        cout<<"Parent Class Constructor"<<endl;
    }
}; 

class B: public A{
    public:
    int b; 
    B(){
        b=10;
        cout<<"Child Class Constructor"<<endl;
    }
};

class C: public B{
    public: 
    int c; 
    C(){
        cout<<"Grand Child Constructor"<<endl;
        c = a+b; 
    }

    void show(){
        cout<<c<<endl;
    }

};

int main(){
    C c; 
    c.show();
}