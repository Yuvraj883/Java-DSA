import java.util.*; 
class Pyramid{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        System.out.print("Enter the number of rows: "); 
        int row = scn.nextInt(); 
       
        for (int i =0; i<=row; i++){
            for (int k =i; k<=row; k++){
                System.out.print(" "); 
            }
            for (int j = 0; j<=(i-1);j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
        scn.close();

    }
}