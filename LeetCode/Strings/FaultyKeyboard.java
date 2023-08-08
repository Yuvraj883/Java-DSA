class Solution {
    public String finalString(String s) {
        StringBuilder finalString = new StringBuilder(); 
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)=='i'){
                finalString.reverse();
            }
            else{
                            finalString= finalString.append(s.charAt(i)); 

            }
        }
        return finalString.toString();
        
    }
}