import java.util.*; 
public class DigitInANumber{
    public static int digitInANumber(int n, int d){
        int count= 0;
        for (int i=n; i>0; i/=10){
            if (i%10==d){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt (); 
        int d= scn.nextInt(); 
       System.out.println(digitInANumber(n, d));
       scn.close();

    }
}