import java.util.*; 

class Main{
    public static void main(String[] args){
        Volume v = new Volume(10,10,12); 
        v.calcVolume(); 
    }
}

class Box{
    int length = 0; 
    int height = 0; 
    int width = 0; 

    Box(int h, int l, int w){
        height = h; 
        length = l; 
        width = w;
        
    }
    void calcVolume(){
        System.out.println("This function is to be overriden!!"); 
    }

}

class Volume extends Box{
    Volume(int h, int l, int w){
        super(h, l, w);
       
    }
    void calcVolume(){
         System.out.println("Volume = "+height*length*width);
    }
}