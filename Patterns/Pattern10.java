import java.util.*; 
public class Pattern10{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int is = -1; 
        int os = 1; 
        for (int i=0; i<n; i++){
            for (int j=0; j<os; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j=0; j<is;j++){
                System.out.print("\t");
            }

            if (n/2<=i){
                os-=1; 
                is -=2;
            }
            else{
                os +=1; 
                is +=2;
            }
        }
        scn.close ();
    }
}