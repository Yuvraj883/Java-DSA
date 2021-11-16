import java.awt.*; 
import java.applet.*; 
//<applet code ="GraphicsClass.class" width =500 height = 500></applet>
 class GraphicsClass extends Applet{
     public void init(){
         setBackground(Color.black); 
         setForeground(Color.white); 

     }
     public void paint(Graphics g){
         int x[] = {200,250,280,290,200,750}; 
         int y[] = {100,200,300,400,500,450};
         g.setColr(Color.red); 
         g.setFont(new Font("Aerial1",1,20)); 
         g.drawString("Welcom to Ce", 40,60); 
         g.setColor(Color.green); 
         g.drawRect(40,70,100,40); 
         g.fillRect(40,70,100,40); 
         g.drawOval(40,170,30,60); 
         g.fillOval(40,170,30,60); 
         g.drawLine(40,240,140,240); 
         g.drawArc(40, 260, 60, 100, 60,60); 
         g.drawOval(40,280,30,3);
         g.drawPolygon(x,y,6); 


     }
 }
