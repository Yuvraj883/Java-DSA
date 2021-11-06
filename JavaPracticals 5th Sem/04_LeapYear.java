import java.util.*; 
class LeapYear{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        System.out.print("Enter year(YYYY): "); 
        int y = scn.nextInt(); 
        if((y%4==0 && y%100 !=0) || (y % 400 == 0)){
            System.out.println("The year entered is leap year."); 
        }
        else {
            System.out.println("The year entered isn't a leap year."); 
        }
        scn.close(); 
    }
}