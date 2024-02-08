import java.util.*; 

class Main{
    public static void main(String[] args){
        Stack <Integer> st = new Stack<>(); 
        st.addAll(Arrays.asList(1,2,3,4)); 
        System.out.println(st);  

        reverseStack(st);
        System.out.println(st);  
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return; 
        }
        
        int n = st.pop(); 
        reverseStack(st); 
        insertAtBottom(st, n); 
        
    }
    public static void insertAtBottom (Stack<Integer> st, int num){
        if(st.isEmpty()){
            st.push(num); 
            return;
        }
        int n = st.pop(); 
        insertAtBottom(st,num); 
        st.push(n);
    }
}