import java.util.*; 
public class SandClock{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt(); 
        int space=0;
        for (int i=n; i>0; i--){
            for (int j=0; j<space; j++){
                System.out.print("\t");
            }
            for (int j=1; j<=i; j++){
                System.out.print("\t\t*");
            }
            System.out.println();
            space++;
        }
        int ispace=n-1;
        for (int i=1; i<=n; i++){
            for (int j=ispace; j>0; j--){
                System.out.print("\t");
            }
            for (int j=0; j<i; j++){
                System.out.print("\t\t*");
            }
            System.out.println();
            ispace--;
        }
        scn.close();
        
    }
}