#include<iostream>
#include<fstream>
using namespace std;
main()
{
 ofstream fout("abc.txt");
 fout<<"Yuvraj";
 cout<<fout.tellp()<<endl;
 fout.seekp(-4,ios_base::cur);
 cout<<fout.tellp()<<endl;
 fout<<" Singh";
 fout.close();
 ifstream fin("abc.txt");
 cout<<(char)fin.get()<<endl;
 fin.seekg(2);
 cout<<fin.tellg()<<endl;
 cout<<(char)fin.get();
} 
