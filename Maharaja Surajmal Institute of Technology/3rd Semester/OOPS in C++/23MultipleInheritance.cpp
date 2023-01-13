#include<iostream> 
using namespace std; 

class Father{
    public: 
    string eyes="brown"; 
    float height = 6.0; 
    Father(){
        cout<<"Constructor of Father Class called."<<endl;
    }
}; 
class Mother{
    public: 
    string eyes="black"; 
    float height = 5.4; 
    Mother(){
        cout<<"Constructor of Mother Class called."<<endl;
    }
};
class Child: public Mother, public Father{
    string eyes = Mother::eyes; 
    float height = Father::height;
    public:
    Child(){
        cout<<"Constructor of Child Class called."<<endl;
    }

    void display(){
        cout<<"Color of Eyes: "<<eyes<<endl;
        cout<<"Height: "<<height<<"ft"<<endl;
    }
};

int main(){
    Child c; 
    c.display(); 
    return 0;
}