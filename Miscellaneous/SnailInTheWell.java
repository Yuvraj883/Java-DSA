//import Miscellaneous.*;
import java.util.*; 
public class SnailInTheWell{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        System.out.print("Enter the height of the well: ");
        int n = scn.nextInt();
        int climb = 7; 
        int fall = 2; 
        int climbed=0;
        int day= 0;
        while(climbed<n){
            //day Time

            climbed+=climb;
            day++;
            if(climbed>=n){
                break;
            }
            else{
                //night time
                climbed-=fall;
            }
        }
        System.out.println("It would take Snail "+day+" day(s) to climb the Well."); 
    }
}