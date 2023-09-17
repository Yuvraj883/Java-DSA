class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum = 0;

        if(nums.size()==0){
            return 0;
        }
        
        
        for(int i=0; i<nums.size(); i++){
          String s = decimalToBinary(i);
            int ones = countOnes(s);
            // System.out.println(ones+" "+nums.get(i)+" "+k);
            if(ones == k){
                sum += nums.get(i);
                // System.out.println(sum +" "+ nums.get(i));
                // System.out.println("True");

            }
        // System.out.println(s+" "+ones);

        }
        
        return sum;
        
        
    }
    
    public static int countOnes(String s){
        
        int ones = 0;
        
        for(int i = 0; i<s.length(); i++){
            if( s.charAt(i) == '1'){
                ones++;
            }
            
        }
        
        return ones;
    }
    
    public static String decimalToBinary(int num){
            
        StringBuilder sb = new StringBuilder(); 
        
        if(num==0){
            return "0";
        }
        
        while(num>0){
            
            int remainder = num%2; 
            sb.insert(0, remainder);
            
            num = num/2; 
        }
        return sb.toString();
        
    }
}