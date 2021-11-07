class Super{
    int a =10; 
    void disp(){
        System.out.println("Super class value: "+a); 
    }
}
class Sub extends Super{
    int b =20; 
    void disp(){
        System.out.println("Sub class value: "+b); 
    }
}
class MethodOverride{
    public static void main(String[] args){
        Sub obj = new Sub(); 
        obj.disp();
    }
}