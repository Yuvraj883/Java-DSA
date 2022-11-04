#include <iostream>
using namespace std; 

int main(){
    int num1, num2, num3; 
    int greatestNum; 
    cout<<"Enter the three integers you want to compare: "; 
    cin>>num1>>num2>>num3; 

    greatestNum = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3); 
    cout<<greatestNum<<" is the greatest integer among "<<num1<<", "<<num2<<" and "<<num3; 
    return 0;
}