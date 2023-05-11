import java.util.*; 

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        System.out.print("Enter your name: ");
        String name = scn.next(); 
        System.out.print("Enter your age: ");
        int age = scn.nextInt(); 
        System.out.println("Your username is: "+name+age); 
    }
}