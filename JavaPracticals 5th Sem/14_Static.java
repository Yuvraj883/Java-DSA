class Demo{
    static int a = 0; 
    static void display(){
        System.out.println("Static Method");
    }
    static {
        System.out.println("Static block"); 
    }
}

class MainStatic{
    public static void main(String[] args){
        System.out.println(Demo.a); 
        Demo.display();
    }
}