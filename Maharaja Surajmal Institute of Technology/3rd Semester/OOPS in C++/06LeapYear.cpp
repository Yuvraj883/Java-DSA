#include <iostream> 
using namespace std; 

int main(){
    int year=1900; 
    cout<<"Leap years between the years 1900 and 2008 are:-> ";
    while(year<=2008){
       if(year%400==0){
        cout<<year<<" ";
       }
       else if(year%100==0){
        // cout<<year<<" "; 
       }
       else if(year%4==0){
        cout<<year<<" ";
       }
        year+=4; 
    }
    return 0; 
}