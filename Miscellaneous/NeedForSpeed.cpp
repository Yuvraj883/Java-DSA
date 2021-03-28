#include <iostream> 
#include <bits/stdc++.h>
#include <math.h> 

using namespace std; 

int main(){
    long long t; 
    cin>>t; 
    while (t>0){

        double long u,v,s,a; 
        cin>>u>>v>>s>>a; 
        if (u==v){
            cout<<"Yes"<<endl; 
           
        }
        else{
         long int vel; 
        vel = (u*u)-(2*a*s); 
       long int Fvel = sqrt(vel);
       //cout<<Fvel<<endl;
    if (Fvel<=v){
        cout<<"Yes"<<endl;
    }
    else{
        cout<<"No"<<endl;
    }
        }
    t--;

    }
    return 0; 
}