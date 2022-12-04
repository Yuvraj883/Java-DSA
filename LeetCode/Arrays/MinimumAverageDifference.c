int minimumAverageDifference(int* nums, int numsSize){
long total = 0; 
long sum = 0; 
int minDiff = INT_MAX; 
int minIdx = 0;
for (int i=0; i<numsSize; i++){
    total+=nums[i]; 
}

for(int i =0; i<numsSize; i++){
    sum+=nums[i];
    int n = numsSize-i-1; //Number of remaining elements
    long sum2 = total-sum; 
    int diff = 0; 
    if(n ==0){
        diff = sum/(i+1); 

    }
    else {
        diff = sum/(i+1)-sum2/n; 
    }
    //Finding the |mode| value of the difference.
    if(diff<0){
        diff = diff*-1; 
    }

    if(diff<minDiff){
        minDiff = diff;
        minIdx = i; 
    }

}

return minIdx; 

}