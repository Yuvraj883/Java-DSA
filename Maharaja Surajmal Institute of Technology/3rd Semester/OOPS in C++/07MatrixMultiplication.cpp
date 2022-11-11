#include <iostream> 
using namespace std; 

// void matrixInput(int rows, int cols, int arr[rows][cols]){
   
    
// }
// void multiplyMatrices(int r1, int c1, int arr[][10], int r2, int c2, int arr2[][10]){
//     if(c1!=r2){
//         cout<<"Multiplication can't be performed on these two matrices.";
//      return;    
//     }
//     int product[r1][c2]; 
//     for (int i=0; i<r1; i++){
//         for (int j=0; j<c2; j++){
//             for (int k=0; k<r1; k++){
//                 product[i][j]+=arr[k][j]*arr2[i][k];
//             }
//         }
//     }

//     for(int i=0; i<r1; i++){
//         for (int j=0; j<c2; j++){
//             cout<<product[i][j];
//         }
//         cout<<endl;
//     }
    
// }
int main(){
    int rows1, cols1, rows2, cols2; 
    cout<<"Enter the number of rows and cols of the first matrix: "; 
    cin>>rows1>>cols1; 

    cout<<"Enter the elements of the first matrix:\n "; 
   
    int arr[10][10], arr2[10][10];
      for(int i=0; i<rows1; i++){
        for(int j=0; j<cols1; j++){
            cin>>arr[i][j]; 
        }
    }

    //  matrixInput(rows1, cols1, arr);     
    //  for(int i=0; i<rows1; i++){
    //     for(int j=0; j<cols1; j++){
    //         cout<<arr[i][j]; 
    //     }
    //     cout<<endl; 
    // }
    
cout<<"Enter the number of rows and cols in second matrix: "; 
cin>>rows2>>cols2; 

cout<<"Enter the elements of second matrix: \n"; 
for(int i=0; i<rows2; i++){
    for (int j=0; j<cols2; j++){
        cin>>arr2[rows2][cols2]; 
    }
}
// multiplyMatrices(rows1,cols1,arr,rows2,cols2,arr2); 
if(rows1!=cols2){
    cout<<"Invalid Input"<<endl; 
    // return 0; 
}
int product[10][10]; 
for(int i=0; i<rows1; i++){
    for(int j=0; j<cols2; j++){
        product[i][j]=0;
    }
    // cout<<endl;
}
for(int i=0; i<rows1; i++){
    for(int j=0; j<cols2; j++){
        for(int k=0; k<cols2; k++){
            product[i][j] += (arr[i][k])*(arr2[k][j]);
        }
    }
}

for(int i=0; i<rows1; i++){
    for(int j=0; j<cols2; j++){
        cout<<product[i][j]<<" ";
    }
    cout<<endl;
}

}