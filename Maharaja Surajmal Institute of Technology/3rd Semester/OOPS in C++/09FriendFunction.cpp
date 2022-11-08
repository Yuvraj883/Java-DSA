#include <iostream> 
using namespace std; 

class Student{
    string name =""; 
    public: 
    Student(){
        name="Yuvraj";
    }
    
   void displayName(){
        cout<<name; 
    }
    //Friend function prototype.
    friend void updateName(Student &s1);
};
//Friend function declaration. 
void updateName(Student &s1){
    s1.name=s1.name+" Singh";
}

int main(){
    Student s1; 
    
    cout<<"Name before friend function is called: ";
    s1.displayName(); 
    cout<<endl;

    cout<<"Name after the frined function is called: ";
    //Friend function call.
    updateName(s1);

    s1.displayName();
    cout<<endl;
    return 0;     
}