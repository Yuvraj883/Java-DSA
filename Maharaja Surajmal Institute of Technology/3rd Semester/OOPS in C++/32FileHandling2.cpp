#include<iostream>
#include<string>
#include<fstream>
using namespace std;
main()
{
 char c;
 ifstream fin;
 fin.open("demo.txt");
 while(!fin.eof())
 {
 c=fin.get();
 cout<<c;
 }
 fin.close();
} 
