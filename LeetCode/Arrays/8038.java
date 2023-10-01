class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        int [] arr = new int[k+1];
        int count = 0; 
        for(int i=nums.size()-1; i>=0;i--){

            count++;
            if(nums.get(i)<=k && arr[nums.get(i)]==0){
                arr[nums.get(i)]=1;
            }
            if(isFilled(arr)==1){
                break;
            }


            
        }
        return count;
        
    }
    public static int isFilled(int[] arr){
        
        // int isFull = 1; 
        for(int i=1; i<arr.length; i++){
            if(arr[i]==0){
                return 0;
            }
        }
        return 1;
    }
}