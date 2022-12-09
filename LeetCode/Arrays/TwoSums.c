/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int n = numsSize;
    int *arr = (int*)malloc(2*sizeof(int));  
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(nums[j]==target-nums[j]){
                arr[0] = i; 
                arr[1] = j;
                return arr; 
            }
        }

    }
    return NULL; 
}