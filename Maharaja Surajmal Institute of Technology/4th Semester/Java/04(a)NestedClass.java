import java.util.*; 

class OuterClass{
    int outer_x = 10;
    static int outer_y = 20; 
    final int outer_z = 30; 

    class NestedClass{
        void display(){
            // System.out.println("Outer_x = "+OuterClass.outer_x); 
            OuterClass out = new OuterClass();
            out.outer_x = 40; 
            //Static members can be directly accessed in the nested class
            outer_y = 50; 
            // outer_z = 40;  final variables cant be reassigned value, static variable can be 
            System.out.println("Outer_x = "+out.outer_x); 
            System.out.println("Outer_y = "+outer_y); 
            System.out.println("Outer_z = "+out.outer_z); 

        }
    }
    
}

 public class Main{
    public static void main(String[] args){
        OuterClass out = new OuterClass(); 
        OuterClass.NestedClass nestedObj = out.new NestedClass(); 
        nestedObj.display(); 
    }
}