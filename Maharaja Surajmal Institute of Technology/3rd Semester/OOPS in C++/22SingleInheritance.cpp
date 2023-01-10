#include<iostream> 
using namespace std; 
class Parent{
    public: 
    string lastName=""; 

    Parent(){
    cout<<"<---***Single Inheritance***--->";
    cout<<endl;
    }

}; 

class Child: public Parent{
    string name =""; 
    string fullName; 
    public: 
    Child(){
        
        cout<<"What's your first name: "; 
        cin>>name; 
        cout<<"What's your father's last name: "; 
        cin>>lastName; 
    }
    void displayName(){
        fullName=name+" "+lastName; 
        cout<<"Ohh, you must be "<<fullName<<"!!"<<endl;
    }
}; 

int main(){
    Child Y; 
    Y.displayName();
}