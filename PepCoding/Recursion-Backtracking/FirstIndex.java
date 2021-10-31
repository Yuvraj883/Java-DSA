import java.util.*; 
public class FirstIndex{
    
    public static int firstIndex(ArrayList<Integer> list,int x, int idx){
        if (idx==list.size()){
            return -1; 
        }
       
        if(list.get(idx)==x){
            return idx; 
        }
        else{
            int ans = firstIndex(list, x, idx+1); 
            return ans; 
        }
       

    }
    // Main Body
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        int n = scn.nextInt(); 
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i=0; i<n; i++){
            int val = scn.nextInt(); 
            list.add (val); 
        }

        int x= scn.nextInt(); 
        System.out.println(firstIndex(list, x, 0)); 
        scn.close(); 
    }
}