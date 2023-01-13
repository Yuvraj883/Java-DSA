#include<iostream> 
using namespace std; 

class B; 
class A{
    private: 
    int x; 
    public: 
    void setValue(){
        cout<<"Enter the value of X: ";  
        cin>>x;
    }
    friend class B; 
}; 

class B{
    public: 
    void getValue(A obj){
        cout<<"Value of X is = "<<obj.x<<endl; 
    }
};

int main(){
    A a; 
    a.setValue();
    B b; 
    b.getValue(a);
    return 0;
}