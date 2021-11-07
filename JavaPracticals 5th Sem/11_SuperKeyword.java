class P{
    int n=10; 

    void msg(){
        System.out.println("Super Class"); 
    }

}

class Child extends P{
int n = 20;
 void msg(){
     System.out.println(n); 
     System.out.println(super.n); 
     System.out.println("SubClass");
     super.msg(); 

 } 

}
class SuperKeyword{
    public static void main(String[] args){
        Child obj = new Child(); 
        obj.msg();
    }
}