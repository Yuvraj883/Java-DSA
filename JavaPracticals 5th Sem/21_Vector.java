import java.util.*;

class Vector1 {
    public static void main(String ar[]) {
        Vector<Integer> vobj = new Vector<>();
        vobj.add(5);
        vobj.add(7);
        vobj.add(9);
        vobj.add(2);
        vobj.add(1);
        System.out.println("Vector is " + vobj);
        System.out.println("current capacity of Vector object is " + vobj.capacity());
        vobj.addElement(4);
        System.out.println("Vector is " + vobj);
        System.out.println("Remove element at index 4 " + vobj.remove(4));
        System.out.println("Vector after removal" + vobj);
        vobj.removeElementAt(3);
        System.out.println("Vector after removal" + vobj);
        vobj.insertElementAt(12, 1);
        System.out.println("Values in Vector object are :" + vobj);
    }
}