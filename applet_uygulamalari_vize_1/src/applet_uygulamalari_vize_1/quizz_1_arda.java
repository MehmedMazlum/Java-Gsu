package applet_uygulamalari_vize_1;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;

public class quizz_1_arda extends Applet implements  MouseMotionListener, MouseListener {
 
 Point a ;
 int x = 125 ;
  int y = 75 ;
  int m ;
 
 public void init() {
  
	 setSize(500,300);
	
	 addMouseMotionListener(this) ;
  addMouseListener(this) ;
 }

 public void paint(Graphics g) {
  Font tt = new Font ("Times New Roman", Font.PLAIN,17);
   g.setFont(tt);
  g.fillOval(100,50,50,50) ;
  g.drawLine(125,50,500,0);
  g.drawLine(125,100,50,300);

   if (a != null)
  {
   g.drawString("x="+a.x,10,60);
   g.drawString("y="+a.y,10,80);
   }
  if ( Math.sqrt((a.x-125)*(a.x-125) + (a.y-75)*(a.y-75)) <= 25 )  
  {
	  setBackground(Color.orange);
  }
  else if (((374*(a.y-50)))<=( 50*(125-a.x) ) )
  {
	  setBackground(Color.blue);
  }
  else  if ((a.y>=55)&&(75*(100-a.y))>=(200*(a.x-125)))
  {
	  setBackground(Color.blue);
  }
  else
	  setBackground(Color.MAGENTA);
 

 }
 
 public void mouseMoved(MouseEvent e )
 {
   a = e.getPoint() ;
  repaint() ;
 }
 public void mousePressed(MouseEvent e )
 {
  
 }
 public void mouseDragged(MouseEvent e )
 {
  
 }
 public void mouseReleased(MouseEvent e )
 {
   
 }
 public void mouseClicked(MouseEvent e)
 {
  
 }
 public void mouseEntered(MouseEvent e )
 {
  
 }
 public void mouseExited(MouseEvent e)
 {
  
 }
 
}