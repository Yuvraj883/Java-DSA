class A {
    int a = 20;

    void show() {
        System.out.println("A"+a);
    }
}

class B extends A {
    int b = 20;

    void display() {
        System.out.println("B"+b);
    }
}

class C extends B {
    int c = 30;

    void disp() {
        System.out.println("C"+c);
    }
}

class MultipleInheritance {
    public static void main(String args[]) {
        C obj = new C();
        obj.disp();
        obj.display();
        obj.show();
    }
}