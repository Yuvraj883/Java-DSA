import java.util.*; 

class Main{
    public static void main(String[] args){
        Box b = new Box(); 
        Volume v = new Volume(); 
        // v.V(); 
    }
}

class Box{
    int length = 10; 
    int height = 10; 
    int width = 12; 

}

class Volume extends Box{
    Volume(){
        System.out.println("Volume = "+ height*length*width); 
    }
}