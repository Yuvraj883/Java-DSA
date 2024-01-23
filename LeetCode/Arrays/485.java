class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int currentMax = 0; 
        int max = 0; 

        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                currentMax++; 
            }
            else if(arr[i]==0){
                 if(currentMax>max){
                max = currentMax; 
            }
            currentMax =0; 
            }

                     

        }

          if(currentMax>max){
                max = currentMax; 
            }

            return max; 
        
    }
}