class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>(); 
        int n = prices.length; 
        int [] ans = new int [n]; 

        ans[n-1]=prices[n-1]; 
        st.push(prices[n-1]); 

        for(int i = n-2; i>=0; i--){
        // System.out.println(st);

            while(!st.isEmpty()){
                if(st.peek()<=prices[i]){
                    ans[i] = prices[i]-st.peek(); 
                    // System.out.println(prices[i]+" "+st.peek());
                    st.push(prices[i]);
                    break;
                }
                else{
                    st.pop(); 
                }
               
            }
             if(st.isEmpty()){
                    ans[i]=prices[i]; 
                    st.push(prices[i]);
                }
        }
        return ans; 
    }
}