import Package1.Class1;
class Class2 extends Class1{
    int n = 20; 
    void dispB(){
        System.out.println("Class 2"); 
        System.out.println("Value = "+ val); 
        System.out.println("n = "+n); 
    }
}
class Packages{
    public static void main(String[] args){
        Class2 obj = new Class2(); 
        obj.dispA(); 
        obj.dispB(); 
        //Class1 c = new Class1(); 

    }
}