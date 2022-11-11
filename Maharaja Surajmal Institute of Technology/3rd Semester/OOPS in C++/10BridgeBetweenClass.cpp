#include<iostream>
using namespace std;

class Name{
    string fname, lname; 
    public: 
    Name(string firstName, string lastName){
        fname = firstName; 
        lname = lastName;
    }
    friend void printName(Name &name);
};

class PrintName{
    public: 
    void printName(Name &name){
        string fullName = name.fname+name.lname;
      cout<<fullName;    
    }
}; 

int main(){
    Name name("Yuvraj","Singh"); 
    PrintName obj;
    obj.printName(name);
}