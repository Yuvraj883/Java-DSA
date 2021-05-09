import java.util.*; 
public class DisplayReverseOfArray{
    public static void displayArray(ArrayList<Integer> list,int n){
        if (n<0){
            return ; 
        }
        System.out.println(list.get(n)); 
        displayArray(list, n-1); 
        
    } 
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i=0; i<n; i++){
            int val = scn.nextInt(); 
            list.add(val); 
        }
        
        displayArray(list, n-1); 
        scn.close(); 
    }
}