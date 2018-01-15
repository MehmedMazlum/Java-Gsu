package son_ekler;

import java.awt.*;
import java.applet.*;
import java.awt.event.* ;

public class alican_uygulama extends Applet implements MouseListener, MouseMotionListener {
 
 Point a ;
 int x ;
  int y ;


 public void init() {

  addMouseListener(this) ;
  addMouseMotionListener(this) ;
 }

 public void paint(Graphics g) {

  g.fillOval(200,200,100,100) ;
      if ( Math.sqrt((a.x-200)*(a.x-200) + (a.y-200)*(a.y-200)) <= 50  )
  {
  g.drawString("evet", 600,600) ;
   }
   else
    g.drawString("hayir", 600,600) ;
  
  setBackground(Color.green) ;
  
 }
 
 public void mouseMoved (MouseEvent e)
  {
  a = e.getPoint() ;
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
