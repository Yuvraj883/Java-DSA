import java.util.*; 
public class Subsets{
    public static void main(String[] argc){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr = new int [n]; 
        for (int i = 0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int limit = (int)Math.pow(2, arr.length);
        for (int i=0; i<limit; i++){
            String subSet= "";
            int temp= i;
            for (int j= arr.length-1; j>=0; j--){
                int r = temp%2; 
                temp = temp/2; 
                if(r==0){
                    subSet= "-\t"+subSet; 
                }
                else{
                    subSet = arr[j]+"\t"+subSet;
                }

            }
            System.out.println(subSet);
        }
        scn.close();
    }
}