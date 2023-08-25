class Solution {
    public int largestAltitude(int[] gain) {
        
        int maxAlt = 0;
        int currentAlt = 0; 

        for(int i=0; i<gain.length; i++){
          currentAlt +=gain[i]; 
          maxAlt = Math.max(maxAlt,  currentAlt);
        }
        return maxAlt; 
    }
}