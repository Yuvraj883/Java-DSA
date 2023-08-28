class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int lo = 0; 
        int hi = nums.length-1;
        int mid = (lo+hi)/2;

        while(lo<=hi){
            if(target==nums[mid]){
                return mid;
            }
            else if(target>nums[mid]){
                lo = mid+1; 
            }
            else if(target<nums[mid]){
                hi = mid-1;
            }
        mid = (lo+hi)/2;

        }

        return lo;
    }
}