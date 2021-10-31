import java.util.*;

class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r, sum = 0, temp;
        System.out.print("Enter the number you want to check: ");
        int n = scn.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;

        }

        if (temp == sum) {
            System.out.println(temp + " is a palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number.");
        }
        scn.close();

    }
}