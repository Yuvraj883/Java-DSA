#include <iostream> 
using namespace std; 

int main(){
    int r1,c1; 
    cout<<"Enter the number of rows and cols in the matrix1: "; 
    cin>>r1>>c1; 
    int a[r1][c1]; 
    cout<<"Enter the elements of the matrix1: "; 
    for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            cin>>a[i][j]; 
        }
    }

    int r2,c2; 
    cout<<"Enter the number of rows and cols in the matrix2: "; 
    cin>>r2>>c2;
    int b[r2][c2]; 
    cout<<"Enter the elements of the matrix2: "; 
    for(int i=0; i<r2; i++){
        for(int j=0; j<c2; j++){
            cin>>b[i][j]; 
        }
    }

    if(r1!=c2){
        cout<<"Invalid Input!!"<<endl; 
        return 0; 
    }

    int c[r1][c2]; 
    for(int i=0; i<r1; i++){
        for(int j=0; j<c2; j++){
            c[i][j]=0;
        }
    }
    
for(int i=0; i<r1; i++){
    for(int j=0; j<c2; j++){
        for(int k=0; k<r1; k++){
            c[i][j]+=a[i][k]*b[k][j]; 
        }
    }
}

for(int i=0; i<r1;i++ ){
    for(int j=0; j<c2; j++){
        cout<<c[i][j]<<" "; 
    }
    cout<<endl;
}


}