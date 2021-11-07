class Sample{

        final int a; 
        static final int b; 
       void sample(){
            a=20; 
        }
        static{
            b=30; 
        }
        void display(){
            final int c;
             c = 40; 
             System.out.println(c);
        }


    public static void main(String[] args){
        Sample s= new Sample (); 
        System.out.println(s.a); 
        System.out.println(s.b); 
        s.display(); 
    }
}