import java.util.*; 
public class JavaOutPutFormatting{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
           System.out.println("================================");
        for(int j=0; j<3; j++){
        String str = scn.next(); 
        int n = scn.nextInt(); 
        int len = str.length();
      
        System.out.print(str); 
        for (int i=0; i<15-len; i++){
            System.out.print(" "); 

        }
       
        if(n ==0){
            System.out.print("00");
        }
        else{
             int count =3; 
        for (int i=n; i>0; i/=10){
            count--; 
        }
        
    
     //   count = 3-count; 
        
        for (int i=0; i<count; i++){
            System.out.print("0");
        }
        }
        System.out.print(n);
        System.out.println();
   
         
        
        }
              System.out.println("================================"); 
              scn.close();
            }
}
