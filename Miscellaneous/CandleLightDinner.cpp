#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	long long t;
	cin >> t;
	
	while(t>0){
	    long long a,y,x;
	      cin >> a >> y >> x;
	      
	      if(a >= y){
	            cout << x*y << endl;
	      }
	      else {
	            cout << x*a +1 << endl;
	      }
	      t--;
	}
	return 0;
}