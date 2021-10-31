import java.util.*; 
public class Pattern05{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt(); 
        int stars=1;
        int space =n/2;
        for (int i=1; i<=n; i++){
            for (int k=1; k<=space; k++){
                System.out.print("\t");
            }
            for (int j=stars; j>0; j--){
         System.out.print("*\t");
        }
        if (i<(n/2)+1){
            
            stars+=2;
            space --;
        }
        else {
            
            stars-=2;
            space++;
        }
       
        System.out.println();
        }
        scn.close();
    }

}