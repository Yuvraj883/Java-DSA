import java.util.*; 
public class PrintDecreasing{
    public static int printDecreasing(int n){
        if (n ==1){
            System.out.println(n); 
            return 0 ;
        }
        else{
            System.out.println(n); 
            return printDecreasing(n-1);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        int n= scn.nextInt(); 
        printDecreasing(n); 
        scn.close();
    }
}