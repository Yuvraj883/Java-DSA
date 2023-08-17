class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            int element = nums[i];

            if(element>=1  && element<=nums.length){

                int chair = element-1; 

                if(nums[chair]!=element){
                    nums[i] = nums[chair];
                    nums[chair]=element; 
                    i--;
                }
            }

        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }

        return (nums.length+1);
    }
}