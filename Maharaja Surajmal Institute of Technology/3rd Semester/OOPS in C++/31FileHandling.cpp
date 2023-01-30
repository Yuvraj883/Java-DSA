#include<iostream>
#include<string>
#include<fstream>
using namespace std;
main()
{
 ofstream fout("demo.txt");
 fout<<"Yuvraj Singh\nIT-1\n61";
 cout<<"Updated demo.txt.";
 fout.close();
} 
