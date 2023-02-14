#include<iostream> 
using namespace std; 

class Demo{
    int x; 
    float y;  
    public: 
    Demo(){

    }
    Demo(int x, float y){
        this->x = x; 
        this->y = y; 
    }

    Demo operator +(Demo &d2){
        Demo d3; 
        d3.x = x+d2.x; 
        d3.y = y+d2.y;
        return d3;  
    }
    void display(){
        cout<<"Value of x: "<<x<<endl<<" Value of y: "<<y; 
    }
}; 

int main(){
    Demo d1(10,20.5);
    Demo d2(13, 10.7); 
    Demo d3 = d1+d2; 
    d3.display(); 

}