import java.util.*; 

class Main{
    public static void main(String[] args){
        ArithmeticOps ops = new Calculator(); 
        ops.add(); 
        ops.sub(); 
        ops.multiply(); 
    }
}

interface Addition{
    void add(); 
}

interface ArithmeticOps extends Addition{
    void sub(); 
    void multiply(); 
}

class Calculator implements ArithmeticOps{
    public void add(){
        System.out.println("Addition method"); 
    }
    public void sub(){
        System.out.println("Subtraction method"); 
    }
    public void multiply(){
        System.out.println("Multiplication method");
    }
}

