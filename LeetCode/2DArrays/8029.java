class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int []ans = new int[100];
        int count = 0;
        for(List<Integer> row: nums){
            // for(Integer nums: num){
            //     if(ans[num-1]==0){
            //         ans[num-1]=1;
            //     }
            // }
            // System.out.println(row.get(0)+" "+row.get(1));
            for(int i=row.get(0)-1; i<row.get(1); i++){
                if(ans[i]==0){
                    ans[i]=1;
                }
            }
        }
        
        for(int i=0; i<100; i++){
            if(ans[i]==1){
                count++;
            }
        }
        
        return count;
    }
}