class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0; 
        for(int i=0; i<prices.length; i++){
           if(prices[i]<minPrice){
               minPrice = prices[i];
           }
           else{
               maxProfit = prices[i]-minPrice>maxProfit?prices[i]-minPrice:maxProfit;
           }
        }
        return maxProfit; 
    }
}