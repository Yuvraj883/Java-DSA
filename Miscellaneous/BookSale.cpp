#include <bits/stdc++.h>
using namespace std;

int main()
{
  //write your code here
  int t; 
  cin>>t; 
  while (t>0){
    int n, m; 
    cin>>n>>m; 
    int books[n]; 
    for (int i=0; i<n; i++){
      cin>>books[i];
    }
    sort(books, books+n);
    int sum = 0; 
    for (int i =0; i<m; i++){
      if(books[i]<0){
      sum+= books[i]; 
      }
    }
    sum = sum*(-1);
    cout<<sum;
    cout<<endl; 
    t--;
  }
  
  return 0;
}