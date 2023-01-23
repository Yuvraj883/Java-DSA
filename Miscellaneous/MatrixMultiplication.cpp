#include<iostream> 
using namespace std; 

int main(){
    int r1, c1; 
    cout<<"Enter the number of rows and cols in the first matrix: "; 
    cin>> r1>>c1; 
    int a[r1][c1]; 
    cout<<"Enter the elements of the first matrix: "<<endl; 
    for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            cin>>a[i][j]; 
        }
    }

    int r2, c2; 
    cout<<"Enter the number of rows and cols in the second matrix: "; 
    cin>>r2>>c2; 
    int b[r2][c2]; 
    cout<<"Enter the elements of the second matrix: "<<endl; 
    for(int i=0; i<r2; i++){
        for(int j=0; j<c2; j++){
            cin>>b[i][j]; 
        }
    }

    if(r2!=c1){
        cout<<"Invalid input!! The given matrices can't be multiplied together.";
    }
    else{
        int c[r1][c2];
        //Initializing the c matrix with 0; 
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                c[i][j]=0; 
            }
        }

        for(int i=0; i<r2; i++){
            for(int j=0;j<c2; j++){
                for(int k=0; k<c1; k++){
                    c[i][j] += a[i][k]*b[k][j]; 
                }
            }
        }
        cout<<"The product of the two matrices is: "<<endl;
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                cout<<c[i][j]<<" "; 
            }
            cout<<endl;
        }
    }


}