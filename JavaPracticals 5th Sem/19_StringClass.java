import java.util.*; 
class StringClass{
    public static void main(String[] args){
        String s = new String("Computer"); 
        System.out.println("String is "+s); 
        s.concat("Dept"); 
        System.out.println("Concatinated string is: "+s); 
        String s1 = s.concat("Dept"); 
        System.out.println("New Concatinated String is: "+s1); 
        System.out.println("Length is: "+s.length());
        System.out.println("Index is "+s.indexOf("e")); 
        System.out.println("UpperCase letters: "+s.toUpperCase()); 
        System.out.println("LowerCase letters: "+s.toLowerCase()); 
        System.out.println("Comparision of two Strings: "+s.compareTo(s1)) ; 
        System.out.println(s.trim()); 

    }
}