#include<iostream> 
using namespace std; 

class Demo{
    int x; 
    public:
     Demo(){
        this->x = 0;
    }
    Demo(int n){
        this->x = n;
    }
     Demo operator +(Demo &d2){
        Demo d3;
        d3.x = x * d2.x; 
        return d3;
    }
    void display(){
        cout<<x;
    }
    
};

int main(){
    Demo d1(5); 
    Demo d2(10);
    Demo d3 = d1+d2;
    d3.display();
}