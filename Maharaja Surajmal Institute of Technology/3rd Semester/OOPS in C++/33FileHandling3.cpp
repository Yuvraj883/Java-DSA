#include <iostream>
#include <string>
#include <fstream>
using namespace std;
main()
{
 char c;
 ofstream fout1, fout2;
 ifstream fin1, fin2;
 fout1.open("demo.txt", ios::app);
 fout2.open("abc.txt");
 fout1 << "\nOOPS \nMaharaja Surajmal Institute of Technology";
 fout2 << "Welcome to abc.txt ";
 fout2 << "I am Yuvraj Singh";
 fout1.close();
 fout2.close();
 fin1.open("demo.txt");
 fin2.open("abc.txt");
 while (!fin1.eof())
 {
 c = fin1.get();
 cout << c;
 }
 cout << endl;
 while (!fin2.eof())
 {
 c = fin2.get();
 cout << c;
 }
 fin1.close();
 fin2.close();
} 