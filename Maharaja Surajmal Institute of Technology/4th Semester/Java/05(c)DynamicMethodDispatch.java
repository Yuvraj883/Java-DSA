class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
  
class B extends A
{
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
  
class C extends A
{
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
  

class Dispatch
{
    public static void main(String args[])
    {
        
        A a = new A();
        B b = new B();
        C c = new C();
  
        A ref;
        // ref refers to an A object
        ref = a;
        // calling A's version of m1()
        ref.m1();
        // now ref refers to a B object
        ref = b;
        // calling B's version of m1()
        ref.m1();
        // now ref refers to a C object
        ref = c;
        // calling C's version of m1()
        ref.m1();
    }
}