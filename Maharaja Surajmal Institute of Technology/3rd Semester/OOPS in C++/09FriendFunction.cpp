#include<iostream>
using namespace std;
class LName; 

class fName{
    string fname=""; 
    public: 
    fName(string firstName){
        fname = firstName; 
      
    }
    friend  void printName(fName fn, LName ln);
};

class LName{
    string lname;
    public:
    LName( string lastName){
          lname = lastName;
    }
    friend void printName(fName fn, LName ln);
   
}; 
void printName(fName fn, LName ln){
    cout<<fn.fname<<" "<<ln.lname; 
}
int main(){
    fName fn("Yuvraj"); 
    LName ln("Singh");
       printName(fn,ln);
}