package son_ekler;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.* ;

public class ap_1 extends Applet  implements MouseListener, MouseMotionListener  {
 
 Point a ;
 String mesaj ="Merhaba" ;
  int k = 0 ;
 int i = 100 ;
 int j = 100 ;
 int m = 0  ;
 public void init() {
  setBackground(Color.yellow) ;
  
  
  addMouseListener(this) ;
  addMouseMotionListener(this) ;
 }

 public void paint(Graphics p) {
   
  Font tt = new Font ("Arial", Font.PLAIN, 30) ;
  p.setFont(tt) ;
  
  //p.drawString("Fare koordinatlari :", 10, 20 );

  
   if( 50 < a.x  && a.x < 150 && 150 < a.y  && a.y < 220  )
    {
    p.setColor(Color.blue) ;
    setBackground(Color.red) ;
   }

 else
 {
  p.setColor(Color.black) ;
  setBackground(Color.green);
 }
  p.fillOval (100,150, 50,50 ) ; 
    try {
    Thread.sleep(100) ;
    }
   catch(Exception e)
   {    
   }
   repaint() ;
 }
 
 public void mouseMoved( MouseEvent e )
 {
  a = e.getPoint() ;
  repaint() ;
  
 }
 
 public void mousePressed(MouseEvent e)
  {
 }
 
 public void mouseDragged(MouseEvent e)
 {
  
 }
 
 public void mouseReleased(MouseEvent e)
 {
  
 }
 public void mouseClicked(MouseEvent e)
 {
  
 }
 public void mouseEntered(MouseEvent e)
  {
  
 }
 public void mouseExited(MouseEvent e)
 {
  
 }
}
