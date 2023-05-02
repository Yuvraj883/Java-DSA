import java.util.*;

class Volume
    {
        int l, b, h;
        
        Volume(int l, int b, int h)
        {
            this.l = l;
            this.b = b;
            this.h = h;
        }
        
        void calculatevolume()
        {
            int volume = l*b*h;
            System.out.println("Volume of the cuboid = "+volume);
        }
    }

public class Main
{
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length width and the height of the cuboid = ");
        int l, b, h;
        l = scn.nextInt();
        b = scn.nextInt();
        h = scn.nextInt();
        
        Volume v = new Volume(l, b, h);
        v.calculatevolume();
    }
}