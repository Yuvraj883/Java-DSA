#include<iostream> 
using namespace std; 

class Demo{
    int x; 
    public: 
    Demo(int x){
        this->x = x;
    }

    void operator++ (int){ //postfix
        x+=x; 
    }
      void operator++ (){ //prefix
        x+=x/2; 
    }
    void display(){
        cout<<x<<endl;
    }
}; 

int main(){
    Demo d(10);
    ++d;
    d++;
    d.display();
    
}