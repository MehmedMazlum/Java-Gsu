package object_oriented_1;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.* ;

public class applet_2 extends Applet  implements MouseListener, MouseMotionListener  {
    
 Point a ;
 String mesaj ="Merhaba" ;
  int k = 0 ;
 int i = 300 ;
 int j = 300 ;
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
 
  
  //if( a != null)
  //{
   //p.drawString("x = "+a.x, 10,60) ;
    //p.drawString("y = "+a.y, 10,80) ;
   
  //}
   p.drawString(mesaj,i, j );
     k = k%4 ;
     if( k == 1 )
 {
 i = i + 10 ;
  
 }
 if ( k == 2 )
 {
 i = i; 
 
  }

 if ( k == 3 )
 {
 i = i - 10 ;
 
 }
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

  k++ ;
  repaint() ;
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
