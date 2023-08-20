class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = 0;
        int length2 = 0;
        int minLength = word1.length()>word2.length()?word2.length():word1.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<minLength; i++){
            sb.append(word1.charAt(i)); 
            length1++;
            sb.append(word2.charAt(i));
            length2++;
        }

       if(length1<word1.length()){
           sb.append(word1.substring(length1));
       }
       else if(length2<word2.length()){
           sb.append(word2.substring(length2));
       }

       return sb.toString();

        
    }
}