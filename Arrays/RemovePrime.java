import java.util.*; 
public class RemovePrime{
    public static boolean isPrime(int val){
        for (int i=2; i*i<=val;i++){
            if (val%i==0){
                return false;
            }
        }

        return true; 
    }
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int size = scn.nextInt();
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i=0; i<size; i++){
            int val = scn.nextInt(); 
            list.add(val);
        }
        for (int i=list.size()-1; i>=0; i--){
            int val = list.get(i); 
           if (isPrime(val)){
               list.remove(i);
           }
        }
        System.out.println(list);
        scn.close();
    }
}