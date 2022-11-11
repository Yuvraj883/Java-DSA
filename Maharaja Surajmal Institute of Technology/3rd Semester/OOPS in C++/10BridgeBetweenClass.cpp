#include<iostream>
using namespace std;

class LName; 
class FName{
    string fname; 
    public: 
    FName(string firstName){
        fname = firstName; 
       
    }
    friend void printName(FName fn, LName ln);
};

class LName{
    string lname; 
    public: 
    LName(string ln){
        lname = ln; 
    }
    friend void printName(FName fn,LName ln); 
};

void printName(FName fn, LName ln){
    cout<<fn.fname<<" "<<ln.lname; 
}

int main(){
   FName fn("Yuvraj"); 
   LName ln("Singh"); 
   printName(fn, ln);
}