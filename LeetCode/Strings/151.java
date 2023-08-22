class Solution {
    public String reverseWords(String s) {
        String arr []= s.split("[' ']");
    
        String ans = "";
        


        for(int i=arr.length-1; i>=0;i--){
            if(arr[i].length()==0 ){
                continue;


            }
            else if(i==0 ){
            ans = ans+arr[i];

            }
            else{
            ans = ans+arr[i]+" ";

            } 

        }

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        System.out.println(arr.length);

        return ans.trim();
        
    }
}