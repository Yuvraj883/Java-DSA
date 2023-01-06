#include<iostream> 
using namespace std; 

class Time{
    int hr; 
    int min; 

   public:
    Time(){
        hr =0; 
        min =0;
    }

    Time(int duration){
        cout<<"***Basic to class conversion***"<<endl;
        hr = duration/60; 
        min = duration%60;
     }

     void show(){
        cout<<hr<<" hr "<<min<<" minutes";
        cout<<endl;
     }

     
};

int main(){
    int duration; 
    cout<<"Enter the duration in minutes: "; 
    cin>>duration; 
    Time t ;
    t = duration; 
    t.show();
}