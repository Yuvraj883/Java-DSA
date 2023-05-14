// import java.util.*;

// class ArrayList{
//     public static void main(String[] args){
//         ArrayList<Integer> stack = new ArrayList<Integer>();

//         System.out.print("Select 0 for using Stack or 1 for using Queue: ");
//         int StackOrQueue = scn.nextInt();

//         Switch(StackOrQueue){
//             case 0:
//                 stackOperations();
//             case 1:
//                 queueOperations();
//             default:
//                 System.out.println("Choose either 0 or 1.");
//         }

//     }
//     void stackOperation(){

//     }
// }

import java.util.ArrayList;

public class ArrayListOperations {

  public static void main(String[] args) {
    ArrayList<Integer> stack = new ArrayList<Integer>();
    ArrayList<Integer> queue = new ArrayList<Integer>();
    // Stack Operations
    System.out.println("Stack Operations");
    stack.add(10);
    stack.add(20);
    stack.add(30);
    System.out.println("Stack: " + stack);
    int pop = stack.remove(stack.size() - 1);
    System.out.println("Popped element from stack: " + pop);
    System.out.println("Stack after pop: " + stack);
    int peek = stack.get(stack.size() - 1);
    System.out.println("Peek element from stack: " + peek);
    System.out.println("Stack after peek: " + stack);
    // Queue Operations
    System.out.println("\nQueue Operations");
    queue.add(10);
    queue.add(20);
    queue.add(30);
    System.out.println("Queue: " + queue);
    int remove = queue.remove(0);
    System.out.println("Removed element from queue: " + remove);
    System.out.println("Queue after remove: " + queue);
    int element = queue.get(0);
    System.out.println("First element from queue: " + element);
    System.out.println("Queue after element: " + queue);
  }
}
