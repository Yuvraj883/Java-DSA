
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        
        // Your code here
        long maxWaterTrapped = 0 ; 
        int []lMax = new int[n]; 
        int []rMax = new int[n];
        lMax[0]= arr[0];
        rMax[n-1]= arr[n-1];
        
        for(int i=1; i<n; i++){
            if(arr[i]>lMax[i-1]){
                lMax[i]=arr[i]; 
            }
            else{
                lMax[i]=lMax[i-1];
            }
        }
        for(int i=n-2; i>=0; i--){
            if(rMax[i+1]<arr[i]){
                rMax[i]=arr[i]; 
            }
            else{
                rMax[i]=rMax[i+1];
            }
        }
        
        int []water = new int [n];
        for(int i=0; i<n; i++){
            if(lMax[i]>=rMax[i]){
              water[i]= rMax[i]-arr[i];
            }
            else {
                water[i] += lMax[i]-arr[i];
            }
        }
        
        for(int i=0; i<n; i++){
            // System.out.print(water[i]+" ");
            maxWaterTrapped +=water[i];
        }
        
        return maxWaterTrapped;
        
    } 
}
