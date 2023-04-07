import java.util.*; 
class Demo{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        int n; 
        System.out.print("Enter the size of the array: "); 
        n = scn.nextInt(); 
        int [] arr = new int[n]; 
        System.out.print("Enter the array elements: "); 

        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();

        }
        int min = 9999; 
        int max = -9999; 
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The largest value in the array is: "+max); 
        System.out.println("The smallest value in the array is: "+min);
    }
}