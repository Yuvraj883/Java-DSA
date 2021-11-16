import java.applet.*; 
import java.awt.*; 
public class AppletParameters extends Applet{
    public void paint (Graphics g){
        String str = this.getParameter("Message"); 
        g.drawString(str, 100,80); 
    }

}