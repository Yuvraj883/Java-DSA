import java.util.*; 
public class Pattern04{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt (); 
        int spaces=0; 
       int stars = n;
        for (int i=1; i<=n; i++){
            for (int j=0; j<spaces;j++){
                System.out.print("\t");
            }
            for (int k =0; k<stars; k++){
                System.out.print("*\t");
            }
            System.out.println ();
            spaces++;
            stars--;
        }
        scn.close();
    }
}