import java.util.*; 

class Volume{
    int findVolume(int ...args){
        int volume = 1; 
        for(int i:args){
            volume = volume*i; 
        }
   
    return volume; 
    }
}


public class Main{

    public static void main(String[] args){
        Volume v = new Volume();
        int volume =  v.findVolume(10, 20, 30);

       System.out.println("Volume = " +volume); 
    }
}