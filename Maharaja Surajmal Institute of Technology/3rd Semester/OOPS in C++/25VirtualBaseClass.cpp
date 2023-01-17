#include<iostream> 
using namespace std; 

class Student{
    protected: 
    int roll_no; 
    public: 
    void setRoll(int r){
        roll_no = r; 
    }
};

class test: virtual public Student{
public: 
float maths, physics; 
void setMarks(int m, int ph){
maths = m; 
physics = ph; 
}
}; 

class sports: virtual public Student{
    public: 
    float score; 
   void setScore(int s){
        score = s; 
    }
}; 

class Result: public test, public sports{
    float total ; 
    public: 
   void findResult(){
    total = (maths+physics+score); 
    cout<<"Roll no.: "<<roll_no<<" Total Marks: "<<total<<endl; 

   }
}; 

int main(){
Result Yuvraj; 
Yuvraj.setRoll(61); 
Yuvraj.setMarks(89.9, 95.7); 
Yuvraj.setScore(99); 
Yuvraj.findResult(); 

}