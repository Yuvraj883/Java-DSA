import java.applet.*; 
import java.awt.*; 
public class DispImage extends Applet{
    Image img1; 
    public void init(){
        img1 = getImage(getDocumentBase(),"29_QRCode.svg"); 

    }
    public void paint(Graphics g){
        g.drawImage(img1, 10,10, this);
    }

}