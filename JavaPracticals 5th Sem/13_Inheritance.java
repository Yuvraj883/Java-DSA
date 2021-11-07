class Super1{
    public void Super(){
        System.out.println("Super Class"); 
    }
    protected void disp(){
        System.out.println("Super Class Disp"); 
    }
}
class Sub1 extends Super1{
    public void Sub1 (){
        System.out.println("Derived Class");
    }
    public void show(){
        System.out.println("Derived class-show");

    }
}

class Inherit{
    public static void main(String[] args){
        Sub1 p = new Sub1(); 
        p.disp(); 
        p.show();
    }
}