import java.util.*; 
class FibonacciSeries{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n1=0, n2=1, n3, count; 
        System.out.print("Enter the number of fibonaccis you want: "); 
        count = scn.nextInt(); 
        System.out.print(n1+" "+n2);
        while(count>0){
            n3 = n1+n2; 
            System.out.print(" "+n3);
            n1=n2;
            n2 =n3;
            count--; 
        }
        System.out.println();
        scn.close();
    }

    
}