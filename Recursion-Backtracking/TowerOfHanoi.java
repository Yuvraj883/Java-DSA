import java.util.*; 
public class TowerOfHanoi{
    public static void towerOfHanoi(int n, int a, int b, int c){
        if (n ==0){
            return ; 
        }
        towerOfHanoi(n-1, a,c,b); 
        System.out.println(n +"["+ a+" -> "+b+ "]");
         towerOfHanoi(n-1, c,b,a); 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int a = scn.nextInt(); 
        int b = scn.nextInt(); 
        int c = scn.nextInt(); 
        towerOfHanoi(n, a, b, c); 
        scn.close();

    }
}