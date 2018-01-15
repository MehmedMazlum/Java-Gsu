package son_ekler;

import java.awt.*;
import java.applet.*;
import java.awt.event.* ;

public class applleeeet extends Applet implements MouseListener, MouseMotionListener {
 
 Point a ;
 int x ;
  int y ;
 int z ;
 public void init() {

  addMouseListener(this) ;
  addMouseMotionListener(this) ;
 }

 public void paint(Graphics g) {
  x = (int)(Math.random()*255) + 0 ;
  y = (int)(Math.random()*255) + 0 ;
   z = (int)(Math.random()*255) + 0 ;
  
  g.drawString("Welcome to Java!!", 50, 60 );
  
 }
 
 public void mouseMoved (MouseEvent e)
 {
  a = e.getPoint() ;
  setBackground(new Color(x,y,z)) ;
   repaint() ;
 }
 public void mousePressed(MouseEvent e)
 {
  
 }
 public void mouseReleased(MouseEvent e )
 {
  
 }
 public void mouseClicked(MouseEvent e )
 {
  
 }
 public void mouseDragged(MouseEvent e )
  {
  
 }
 public void mouseEntered(MouseEvent e )
 {
  
 }
 public void mouseExited(MouseEvent e)
 {
  
 }
}
