#include <bits/stdc++.h>
using namespace std;

class Time {
	int hrs, mins;
public:
	Time(int, int);
	// Casting operator
	operator int();
};

Time::Time(int a, int b){
	hrs = a;
	mins = b;
}

Time::operator int(){
	cout << "***Conversion of Class type to Basic Type***"<< endl;
	return (hrs * 60 + mins);
}

int main(){	
    
	int hour, mins;
	cout<<"Enter hours and minutes: "; 
    cin>>hour>>mins;
	Time t(hour, mins);

    int duration;
	duration = t;
	cout << "Total Minutes are "<< duration << endl;
	return 0;
}
