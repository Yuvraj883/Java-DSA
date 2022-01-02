import java.util.*;

class Aman {
    int[] a = new int[5];

    Aman(int arr[]) {
        System.out.print("Currently in parameterised constructor: ");

        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] + 5;
            // Yaha se print krne pe sahi values print ho rhi h jo mai daal rha hu new array
            // me
            System.out.print(a[i] + " ");

        }
        System.out.println();

    }

    Aman() {
        System.out.print("currently in non-parameterised constructor: ");

        for (int i = 0; i < a.length; i++) {
            // but yaha se print krane pe 0 print kr rha h hr baar kyunki abhi tk
            // parameterised constructor call hi nhi hua h
            // to default value print ho rhi h
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}

public class Constructor {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }
        Aman obj = new Aman(arr);
        Aman obj2 = new Aman();
        // Main se access kr rha hu to yaha se bhi sahi work kr rha h
        System.out.print("Currently in Main Function accessing the a through Aman obj: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(obj.a[i] + " ");
        }
        System.out.println();

    }
}