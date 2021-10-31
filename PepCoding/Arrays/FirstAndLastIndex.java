import java.util.*;
public class FirstAndLastIndex{
    public static void main(String [] argc ){
        Scanner scn  = new Scanner (System.in); 
        int n = scn.nextInt(); 
        int [] arr = new int[n]; 
        for (int i= 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
         
        int data = scn.nextInt();
        int lo = 0; 
        int high = arr.length -1; 
        int li = -1; 
        while (lo<= high){
            int mid =(lo+high)/2;
            if (arr[mid]>data){
                high = mid -1;
            }
            else if (arr[mid]<data){
                lo = mid+1;
            }
            else{
                li = mid; 
                lo = mid+1;
            }
        }

        lo =0; 
        high = arr.length-1; 
        int fi =-1; 
        while (lo<=high){
            int mid = (lo+high)/2;
            if (arr[mid]>data){
                high = mid -1; 
            }
            else if (arr[mid]<data){
                lo = mid+1;
            }
            else{
                fi = mid; 
                high = mid-1;
            }
        }
        System.out.println(fi); 
        System.out.println(li);
        scn.close();

    }
}