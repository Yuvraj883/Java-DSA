import java.util.*; 
public class Pattern06{
    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
      int   stars=(n/2)+1; 
       int  space =1; 
        for (int i=1 ; i<=n; i++){
            for(int j=1; j<=stars; j++){
                System.out.print("*\t");
            }
            for (int k=1; k<=space; k++){
                System.out.print("\t");
            }
            for (int l =1; l<=stars; l++){
                System.out.print("*\t");
            }
            if (i<(n/2)+1){
                stars-=1; 
                space+=2;
            }
            else {
                stars ++; 
                space -=2;
            }
            System.out.println();
        }
        scn.close ();
    }
}