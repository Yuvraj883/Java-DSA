import java.util.*; 

class Cuboid{
    int length=10; 
    int width= 10; 
    int height = 12; 
    int volume = 0; 
}

class Volume{
    Cuboid findVolume(Cuboid c){

    c.volume =  c.length*c.height*c.width; 
    return c; 
    }
}


class Demo{

    public static void main(String[] args){
        Cuboid c = new Cuboid();
        Volume v = new Volume();
        Cuboid c2 =  v.findVolume(c);

       System.out.println(c2.volume); 
    }
}