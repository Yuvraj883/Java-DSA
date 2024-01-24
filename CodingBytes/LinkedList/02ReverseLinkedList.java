import java.util.*; 

class Node{
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null;
    }
}

class LinkedList{

    Node head; 

    LinkedList(){
        head = null; 
    }

    public void append(int data){
        Node newNode = new Node(data); 

        if(head == null){
            head = newNode; 
            return; 
        }

        Node current = head; 

        while(current.next!=null){
            current = current.next; 
        }
        current.next = newNode; 
    }

    public void printList(){
        Node current = head; 

        while(current!=null){
            System.out.print(current.data+" "); 
            current = current.next; 
        }
        System.out.println();
    }


    public void reverseList(){

        Node next = null; 
        Node current = head; 
        Node prev = null; 

        while(current!=null){
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 

        }

        head = prev; 
    }
}

class Main{
    public static void main(String[] args){

        LinkedList myList = new LinkedList(); 

        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.append(6);

        System.out.print("Linked List: "); 
        myList.printList(); 

        System.out.print("Reversed List: ");
        myList.reverseList(); 
        myList.printList();
 

        
    }
}