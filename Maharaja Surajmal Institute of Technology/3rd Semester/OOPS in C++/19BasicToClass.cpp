#include <iostream> 
using namespace std; 

class Time{
    int hrs, min; 
    public: 
    void operator =(int duration){
        cout<<"*****Basic to class conversion*****\n";
        hrs = duration/60; 
        min = duration%60; 
    }

    void display(){
        cout<<"Duration in hrs and minutes = "<<hrs<<"hrs and "<<min<<" mins.\n"; 
    }
};

int main(){
    int duration;
    Time t1;  
    cout<<"Enter duration in minutes: "; 
    cin>>duration; 
    t1 = duration; 
    t1.display();

}