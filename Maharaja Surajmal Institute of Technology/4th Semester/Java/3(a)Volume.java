import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int l, b, h;
        System.out.print("Enter the length, breadth and height of the cuboid: ");
        l = scn.nextInt();
        b = scn.nextInt();
        h = scn.nextInt();
        
        int volume = l * b * h;
        
        System.out.println("Volume of cuboid= "+volume);
    }
}