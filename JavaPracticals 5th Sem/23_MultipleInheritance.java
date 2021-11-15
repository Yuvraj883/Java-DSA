interface A1{
    void disp();
}
interface Be{
    void show(); 
}
class Test1 implements A1,Be{
    public void disp(){
        System.out.println("A1"); 
    }
    public void show(){
        System.out.println("Be"); 
    }
    public static void main(String[] args){
        Test1 t = new Test1(); 
        t.disp(); 
        t.show(); 
    }
}