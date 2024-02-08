import java.util.*; 

class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in); 
        Stack <Integer> st = new Stack<>(); 
        st.addAll(Arrays.asList(3,2,1)); 
        System.out.print("Enter the num you want to insert at the bottom: "); 
        int num = scn.nextInt(); 
        insertAtBottom(st, num); 
        System.out.println(st); 
    }

    public static void insertAtBottom(Stack<Integer> st, int num){
        if(st.isEmpty()){
            st.push(num);
            return; 
        }

        int n = st.pop(); 
        insertAtBottom(st,num ); 
        st.push(n); 
    }

}