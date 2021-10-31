import java.util.*; 
public class ReverseANumber{
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in); 
        int num= scn.nextInt(); 
        for (int i= num; i!=0; i/=10){
            System.out.println(i%10);
            
        }
        scn.close ();
    }
}