#include<iostream>
#include<fstream>
using namespace std;
main()
{
 char c;
 ofstream fout("abc.dat",ios::binary|ios::out);
 ifstream fin("abc.txt");
 while(!fin.eof())
 {
 c=fin.get();
 fout<<c;
 }
 cout<<"Updated abc.dat";
 fin.close();
 fout.close();
} 
