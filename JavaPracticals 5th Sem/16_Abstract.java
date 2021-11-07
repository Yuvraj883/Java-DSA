abstract class P1{
    abstract void display(); 

}
abstract class C1 extends P1{
    void display(){
        System.out.println("Class P");

    }
    abstract void show(); 
}

class B1 extends C1 {
    void show (){
        System.out.println("Class B");
    }
}
class Abstract1{
    public static void main(String[] args){
        B1 obj = new B1();
        obj.show(); 
    }
}