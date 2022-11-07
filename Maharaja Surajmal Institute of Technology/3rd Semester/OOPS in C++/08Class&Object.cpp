#include <iostream> 
using namespace std; 


class Student{
    string name="God"; 
    int roll_no=100; 
    string result="Pass";
    public:
    void setDetails(string studentName,int studentRoll_no, string studentResult){
        // name = this.name; 
        // roll_no= this.roll_no; 
        // result = this.result; 
        name = studentName; 
        roll_no = studentRoll_no; 
        result= studentResult;

    }
    void display(){
        cout<<name<<" "<<roll_no<<" "<<result; 
    }

};

int main(){
Student s1; 
 s1.setDetails("Yuvraj",100,"Pass");
s1.display();
}