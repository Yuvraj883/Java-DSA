#include<iostream> 
using namespace std; 

int main(){
    int age; 
    cout<<"Enter your age: "; 
     cin>>age; 

    try{
        if(age>=25){
            cout<<"You are allowed to consume alcohol."<<endl;
        }
        else{
            throw age; 
        }
    }  
    catch(int age){
        cout<<"You must be over the age of 25 to consume alcohol, currently you are "<<age<<"!!"<<endl;
    }  

}