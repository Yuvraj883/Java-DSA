import java.util.*; 
class SortArray{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in); 
        System.out.print("Enter the size of array: "); 
        int n = scn.nextInt(); 
        int[] arr = new int [n]; 
        System.out.print("Enter the array elements: "); 
        for (int i =0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i]; 
                    arr[i]= arr[j]; 
                    arr[j]= temp;
                }
            }
        }
        System.out.print("The sorted array is: "); 
        for (int i =0; i<n; i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
        scn.close(); 
    }
}