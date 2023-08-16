class Solution{
    public String removeConsecutiveCharacter(String S){
        StringBuilder sb = new StringBuilder(S);
        for(int i=1; i<sb.length(); i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                sb.deleteCharAt(i);
                i--;
            }
            
        }
        return sb.toString();
    }
}