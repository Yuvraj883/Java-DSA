import java.util.*; 
public class Pattern08{ 
    public static void main (String[] argc){
        Scanner scn = new Scanner (System.in); 
        int n= scn.nextInt(); 
        for (int i=n-1; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
        }
        scn.close();
    }
}