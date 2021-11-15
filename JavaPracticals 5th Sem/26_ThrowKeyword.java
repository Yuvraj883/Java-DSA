import java.util.*; 
import java.lang.RuntimeException;
class VException extends RuntimeException{
    VException(String msg){
        super(msg); 
    }
}

class Voting{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        System.out.print("Enter your age: "); 
        int a = scn.nextInt(); 
        try{
            if(a<18){
                throw new VException("You are not eligible to vote!"); 
            }
            else{
                System.out.println("You can Vote!"); 
            }
        }
        catch(VException e){
            e.printStackTrace();
        }
        scn.close(); 
    }
}