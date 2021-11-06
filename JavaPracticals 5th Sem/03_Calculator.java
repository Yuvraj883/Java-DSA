import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
            int n1, n2;
            System.out.print("Input the first number: ");
            n1 = scn.nextInt();
            System.out.print
            ("Input the second number: ");
            n2 = scn.nextInt();
            System.out.println("****Operations****");
            System.out.println("1. Add \n 2. Subtract \n 3. Multipy \n 4. Division \n 5. Remainder \n 6. Exit ");
            System.out.print("Choose an operation to perform on the numbers entered: ");
            int ch = scn.nextInt();
            
              
                switch (ch) {
                case 1:
                    System.out.println("Sum = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Difference = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Product = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Divident = " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Remainder = " + (n1 % n2));
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
                }
                

            

        
    }
}