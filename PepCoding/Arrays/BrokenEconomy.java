import java.util.*; 
public class BrokenEconomy{
    public static void main(String[] argc){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt(); 
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt();
        }
        int d = scn.nextInt();

        int low = 0; 
        int high = arr.length -1;
        scn.close();

        while (low<=high){
            int mid = (low+ high)/2; 
            if (arr[mid]>d){
                high = mid -1;
            }
            else if(arr[mid] < d){
                low = mid+1; 
            }
            else{
                System.out.println(arr[mid]);
                return ;
            }
        }
        System.out.println (arr[low]);
        System.out.println(arr[high]);
    }
}