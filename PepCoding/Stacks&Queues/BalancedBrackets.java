import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                Boolean val = checkBrackets(st, '(');

                if (val == false) {
                    System.out.println("false");
                    return;
                }
            } else if (ch == ']') {
                Boolean val = checkBrackets(st, '[');
                if (val == false) {
                    System.out.println("false");
                    return;
                }

            } else if (ch == '}') {
                Boolean val = checkBrackets(st, '{');
                if (val == false) {
                    System.out.println("false");
                    return;
                }

            }
        }
        if (st.size() == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scn.close();
    }

    public static boolean checkBrackets(Stack<Character> st, char och) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != och) {
            return false;
        } else {
            st.pop();
            return true;
        }

    }
}