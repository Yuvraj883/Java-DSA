import java.util.Scanner;

public class StringOperations {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str, str2;
    StringBuffer sb, sb2;
    int choice;
    do {
      System.out.println("Menu");
      System.out.println("1. Compare two Strings");
      System.out.println("2. Concatenate two Strings");
      System.out.println("3. Convert String to StringBuffer");
      System.out.println("4. Convert StringBuffer to String");
      System.out.println("5. Append two StringBuffers");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter first String: ");
          str = scanner.next();
          System.out.print("Enter second String: ");
          str2 = scanner.next();
          if (str.equals(str2)) {
            System.out.println("Strings are equal");
          } else {
            System.out.println("Strings are not equal");
          }

          break;
        case 2:
          System.out.print("Enter first String: ");
          str = scanner.next();
          System.out.print("Enter second String: ");
          str2 = scanner.next();
          System.out.println("Concatenated String: " + str.concat(str2));
          break;
        case 3:
          System.out.print("Enter String: ");
          str = scanner.next();
          sb = new StringBuffer(str);
          System.out.println("String converted to StringBuffer: " + sb);
          break;
        case 4:
          System.out.print("Enter StringBuffer: ");
          sb = new StringBuffer(scanner.next());
          str = sb.toString();
          System.out.println("StringBuffer converted to String: " + str);
          break;
        case 5:
          System.out.print("Enter first StringBuffer: ");
          sb = new StringBuffer(scanner.next());
          System.out.print("Enter second StringBuffer: ");
          sb2 = new StringBuffer(scanner.next());
          sb.append(sb2);
          System.out.println("Appended StringBuffer: " + sb);
          break;
        case 6:
          System.out.println("Exiting program...");
          break;
        default:
          System.out.println("Invalid choice, please try again");
      }
    } while (choice != 6);
  }
}
