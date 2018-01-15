package son_ekler;


import java.awt.*;
import java.applet.Applet;

public class ruzgar_gulu extends Applet {
 
 
 double teta = 0 ;
 double teta_1 = 90;
 double teta_2 = 180 ;
 double teta_3 = 270 ;
  
 
 public void init() {
  
  setBackground(Color.yellow);
 }

 public void paint(Graphics g) {
  
  //g.drawString("Welcome to Java!!", 50, 60 );
  //g.drawOval(200,100,180,180);
   //g.drawLine(200,190,380,190);
  //g.drawLine(290,100,290,280);
  g.fillArc(600,400,50,50,(int)teta,45);
  g.fillArc(600,400,50,50,(int)teta_1,45);   
  g.fillArc(600,400,50,50,(int)teta_2,45);
  g.fillArc(600,400,50,50,(int)teta_3,45);
  
  teta = teta + 10 ;
   teta_1 = teta_1 + 10 ;
    teta_2 = teta_2 + 10 ;
     teta_3 = teta_3 + 10 ;
  

  
  
 
  try
  {
   Thread.sleep(100);
  }
  catch(InterruptedException e)
   {
   
  }
 repaint() ;
 }
}
