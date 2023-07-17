import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            System.out.println(valid(input));
		}
		
	}
   public static boolean valid(String s){
        Stack <Character> st = new Stack<>(); 
        
        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='(' || ch=='[' || ch == '{'){
                st.push(ch);
            }
            else if(st.isEmpty()){
                return false;
            }
            else{
                char top = st.pop();
                if((top=='(' && ch!=')') || (top=='[' && ch!=']') || (top=='{' && ch!='}') ){
                    return false;
                }
            }
         
        }
         return st.isEmpty();
    }
}



