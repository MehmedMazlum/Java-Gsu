package klavye_kontrol;

import java.awt.*;
import java.applet.*;
import java.awt.event.* ;

/* mouse ile cember surukleme */    /* 12 mart çarsamba */

public class klavye_1 extends Applet implements MouseListener, MouseMotionListener {
 
 Point a ;
 int x ;
 int y ;
boolean secim  = false  ;
 

public void init() {

  addMouseListener(this) ;
  addMouseMotionListener(this) ;
 }

 public void paint(Graphics g) {
	 
  g.fillOval(x,y,100,100) ;

  setBackground(Color.green) ;
 }
 
 public void mouseMoved (MouseEvent e)
  {

  
 }
 public void mousePressed(MouseEvent e)
 {
  a = e.getPoint() ;
   if ( Math.sqrt((a.x-(x+50))*(a.x-(x+50)) + (a.y-(y+50))*(a.y-(y+50))) <= 50 )
	 {
	    secim = true  ;
	 }
   repaint() ;
 }
 public void mouseReleased(MouseEvent e )
 {
	 secim = false ;
	 a = null ;
 }
 public void mouseClicked(MouseEvent e )
  {
  
 }
 public void mouseDragged(MouseEvent e )
 {
	
	 
	 int dx = e.getX()  - a.x  ;
     int dy = e.getY()  - a.y  ;
       if ( secim ) {
           x += dx;
           y += dy;
       } 

       a = e.getPoint();
       repaint();
 }
 public void mouseEntered(MouseEvent e)
 {
  
 }
 public void mouseExited(MouseEvent e)
 {
  
 }
}
