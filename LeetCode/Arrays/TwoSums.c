/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int n = numsSize;
      int *arr = malloc(2*sizeof(int));  
    for(int i=0; i<n; i++){
            arr[0] = -1; 
                arr[1] = -1;
        for(int j=i+1; j<n; j++){
            if(nums[j]+nums[i]==target){
                *returnSize = 1; 
                arr[0] = i; 
                arr[1] = j;
                // printf("%d %d",i, j);
                return arr; 
            }
        }

    }
    *returnSize = 0; 
    return NULL; 
}