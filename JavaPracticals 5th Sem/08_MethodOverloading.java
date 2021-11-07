import java.util.*; 
class MethodSum{
    int sum(int x, int y){
        return (x+y); 
    }
    int sum (int x, int y, int z){
        return (x+y+z); 
    }
    double sum (double x, double y){
        return (x+y); 
    }
}
class MethodOverloading{
public static void main(String[] args){
    MethodSum s = new MethodSum (); 
    System.out.println("The sum is "+ s.sum(10,20)); 
    System.out.println("The sum is "+ s.sum(10, 20, 30)); 
    System.out.println("The sum is "+ s.sum(10.5,8.7)); 

}
}