package object_oriented_1;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.* ;

public class applet_4 extends Applet  implements MouseListener, MouseMotionListener  {
 
 Point a ;
boolean c ;
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
   
  Font tt = new Font ("Arial", Font.PLAIN, 20) ;
  p.setFont(tt) ;
  p.setColor(Color.green);
  p.fillRect (100,150, 100,50 ) ; 
  p.setColor(Color.red);
  p.drawString("("+a.x+" ," + a.y +")", a.x, a.y );

   if( a.x > 100 && a.x < 200 && a.y > 150 && a.y < 200 )
    {
    p.drawString("Mouse is in the rectangle",500,500);
    }
 else
 {
	 p.drawString("Mouse is out of the rectangle",500,500);
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
	 a = e.getPoint() ;
	  repaint() ;
 }
 public void mouseEntered(MouseEvent e)
  {
	
		
		   
 }
 public void mouseExited(MouseEvent e)
 {
}
 
}