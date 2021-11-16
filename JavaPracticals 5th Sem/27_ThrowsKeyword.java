import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.FileNotFoundException;
class ReadExcep{
    void readf() throws FileNotFoundException{
        FileInputStream f =  new FileInputStream("27_a.txt"); 

    }
    void savef() throws FileNotFoundException{
        String t = "This is exception."; 
        FileOutputStream f1 = new FileOutputStream("27_b.txt"); 

    }
}
class ThrowsKeyword{
    public static void main(String[] args){
        ReadExcep r = new ReadExcep();
        try{
            r.readf();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(); 
        }
        try{
            r.savef();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}