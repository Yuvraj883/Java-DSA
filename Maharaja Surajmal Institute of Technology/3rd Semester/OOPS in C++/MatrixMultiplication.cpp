#include <iostream> 
using namespace std; 

int main(){
    int rows1, cols1, rows2, cols2; 
    int arr[3][3], arr2[3][3];

    //First matrix inputs
    cout<<"Enter the number of rows and cols of the first matrix: "; 
    cin>>rows1>>cols1; 

    cout<<"Enter the elements of the first matrix:\n ";   
   
      for(int i=0; i<rows1; i++){
        for(int j=0; j<cols1; j++){
            cin>>arr[i][j]; 
        }
    }

    //Second matrix inputs

    cout<<"Enter the number of rows and cols in second matrix: "; 
    cin>>rows2>>cols2; 

    cout<<"Enter the elements of second matrix: \n"; 
    for(int i=0; i<rows2; i++){
        for (int j=0; j<cols2; j++){
            cin>>arr2[rows2][cols2]; 
        }
    }

    //Printing the both matrices
    cout<<"Matrix1"<<endl;
    for(int i=0; i<rows1; i++){
    for(int j=0; j<cols1; j++){
        cout<<arr[i][j]<<" "; 
        }
        cout<<endl; 
    }
    cout<<"Matrix2"<<endl;
    for(int i=0; i<rows2; i++){
    for(int j=0; j<cols2; j++){
            cout<<arr2[i][j]<<" "; 
        }
        cout<<endl; 
    }
}