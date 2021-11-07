import java.util.*;

class Room {
    int length;
    int breadth;

    Room(int x, int y) // constructor1
    {
        length = x;
        breadth = y;
    }

    Room(int x) // constructor2
    {
        length = breadth = x;
    }

    Room() {
        length = 50;
        breadth = 40;
    }

    int area() {
        return (length + breadth);
    }
}

class ConstructorOverload {
    public static void main(String args[]) {
        Room r1 = new Room(25, 15);
        Room r2 = new Room(20);
        Room r3 = new Room();
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
    }
}