#include <stdio.h>
int main(){
    int amt; 
    printf("Enter the amount: "); 
    scanf("%d",&amt); 
    int c2000=0, c500=0, c200=0, c100=0, c50=0, c20=0, c10=0, c5=0, c2=0, c1=0; 
    if(amt>=2000){
        c2000 = amt/2000; 
        amt = amt%2000;
    }
     if(amt>=500 && amt<2000){
        c500= amt/500; 
        amt = amt%500;
    }
     if(amt>=200 && amt<500){
        c200 = amt/200;
        amt = amt%200;
    
    }
     if(amt>=100 && amt< 200){
        c100 = amt/100; 
        amt = amt%100;
    }
     if(amt>=50 && amt<100){
        c50 = amt/50; 
        amt= amt%50; 
    }
     if (amt>=20 && amt<50){
        c20 = amt/20; 
        amt = amt%20; 

    }
     if (amt >= 10 && amt<20){
        c10 = amt/10; 
        amt = amt%10;
    }
     if(amt>=5 && amt<10){
        c5= amt/5;
        amt = amt%5;
    }
     if (amt>=2&& amt<5){
        c2 = amt/2;
        amt = amt%2;
    }
     if(amt>=1 && amt<2){
        c1 = amt/1; 
        amt = amt%1;
    }
    printf("The entered amount breaks down in Indian Rupee as follows: \n ");
    printf("2000 = %d\n",c2000);
    printf("500= %d\n",c500);
    printf("200 = %d\n",c200);
    printf("100= %d\n",c100);
    printf("50= %d\n",c50);
    printf("20= %d\n",c20);
    printf("10 = %d\n",c10);
    printf("5 = %d\n",c5);
    printf("2 = %d\n",c2);
    printf("1 = %d\n",c1);

}