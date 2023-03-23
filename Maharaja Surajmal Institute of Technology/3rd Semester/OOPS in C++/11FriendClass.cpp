#include <iostream> 
using namespace std; 
class Class2; 
class Class1{
    friend class Class2; //The class which is declared as a friend 
                         //to a class can access all of its private, protected and public members. 
    int data; 
    public : 
    Class1(){
        data=9; 
    }
};

class Class2{
public: 
void showData(Class1 obj){
    cout<<(obj.data);
}
}; 

int main(){
    Class1 obj1; 
    Class2 obj2; 
    obj2.showData(obj1); 
}