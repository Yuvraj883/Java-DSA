#include<iostream>
using namespace std; 

class Demo{
private: 
int a; 
int b; 
public:

Demo(int i, int j): a(i), b(i+j){
    cout<<a<<" "<<b; 

}
void display(){
    cout<<a<<" "<<b; 
}

};

int main(){
    Demo d(5,6); 
    // d.display();
}