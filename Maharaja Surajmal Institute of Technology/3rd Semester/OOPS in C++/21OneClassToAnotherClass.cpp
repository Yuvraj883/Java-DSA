#include <iostream>
using namespace std;

class Time{
    int hrs, min;
public:
    Time(int h, int m){
        hrs = h;
        min = m;
    }

    int getMinutes(){
        int tot_min = (hrs * 60) + min;
        return tot_min;
    }
    void display(){
        cout << "Hours: " << hrs << "\n";
        cout << "Minutes : " << min << "\n";
    }
};

class Minute{
    int min;

public:
    Minute(){
        min = 0;
    }

    void operator = (Time T){
        min = T.getMinutes();
    }

    void display(){
        cout << "Total Minutes : " << min <<endl;
    }
};

int main(){
    int hour,min; 
    cout<<"Enter the number of hours and minutes: "; 
    cin>>hour>>min; 
    Time t1(hour, min);
    t1.display();
    Minute m1;
    m1.display();
    cout << "***one class to another class conversion***\n";
    m1 = t1;
    m1.display();
    return 0;
}
