import java.util.*; 
class Constructor{
    public static void main(String[] args){
        Perimeter p1 = new Perimeter(); 
        p1.calPerimeter(); 
        Perimeter p2 = new Perimeter(5,10); 
        p2.calPerimeter();
    }
}

class Perimeter{
    int l, b, j; 
    Perimeter(){
        l =0;
        b = 0; 

    }
    Perimeter(int x, int y){
        l =x;
         b =y; 
    }
    void calPerimeter(){
        int p; 
        p=2*(l+b); 
        System.out.println("The perimeter of rectangle is= "+p); 
    }
}