#include<iostream> 
using namespace std; 

class Student {
    private : 
    string name; 
    int roll_no; 
    double res;  
    public: 
    Student(string name, int roll_no, double res){//Parameterized constructor 
        this->name = name;
        this->roll_no = roll_no; 
        this->res= res; 
    }

    Student(Student &s){ //Copy Constructor 
        name = s.name; 
        roll_no = s.roll_no; 
        res = s.res; 
    }

    void display(){
        cout<<roll_no<<" "<<name<<" "<<res;
        cout<<endl;
    }

};

int main(){
Student s1("Yuvraj", 61, 99.9); 
s1.display();

Student s2(s1);
s2.display();

}