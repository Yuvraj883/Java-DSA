#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	
	while(t--){
	      int n;
	      cin >>n;
	      
	      int a[n];
	      int sum =0;
	      int ans =0;
	      for(int i=0 ; i< n; i++){
	            cin >> a[i];
	            sum +=a[i];
	      }
	      if (sum%2==0){
	            cout << 0 << endl;
	      }
	      else{
	            ans=0;
	            for(int i=0; i<n ; i++){
	                  if((a[i]%2 ==0) && ((a[i]+1)/2-1<= 0)){
	                        ans =1;
	                        break;
	                        
	                  }
	            }
	            if(ans==0){
	                  cout << -1 << endl;
	            }
	            else{
	                  cout << 1 << endl;
	            }
	      }
	}
	return 0;
}