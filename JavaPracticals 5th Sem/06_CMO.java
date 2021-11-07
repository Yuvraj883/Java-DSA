import java.util.*;
class Rectangle{
    int length, width; 
    void getData(int x, int y){
        length = x; 
        width = y; 
    }
    int rectArea(){
        int area = length*width; 
        return area; 
    }
} 

class RectArea{
    public static void main(String[] args){
        int area1, area2; 
        Rectangle rect1 = new Rectangle(); 
        Rectangle rect2 = new Rectangle(); 
        rect1.length = 15; 
        rect1.width = 10; 
        area1 = rect1.length*rect1.width; 
        rect2.getData(20,12); 
        area2= rect2.rectArea();

        System.out.println("Area1 = "+ area1); 
        System.out.println("Area2 = "+ area2);
     
        
    }
}
