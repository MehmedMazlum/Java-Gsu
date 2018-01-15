package ucak_savar;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.* ;
/* 21 Nisan Pazartesi ucak_savar oyunu */

public class ucak_savar_1 extends Applet implements KeyListener {
 
 Double teta = -90.0 ;
 int x = 175;
 int y = 260 ;
 int x1,y1;
 int x2 = 40 ;
 int x3 ;
 int y3 ;
 int k ;
 Double teta1 = -90.0 ;

 public void init() {
  
	 setSize(500,300);
	 setBackground(Color.yellow) ;
	 addKeyListener(this) ;
 }

 public void paint(Graphics g) {
  
 Font tt = new Font ("Times New Roman",Font.PLAIN,30) ;
  g.setFont (tt);
 g.fillRect(150,260,50,40);
 
 x2 = x2 + 10 ;
 if (x2 == 490)
  x2 = 0 ;
 g.fillRect(x2,40,50,30) ;
 
 x1 =(int)(60*Math.cos((2*Math.PI*teta)/360.0));
 y1 =(int)(60*Math.sin((2*Math.PI*teta)/360.0));
  g.drawLine(x,y,x+x1,y+y1);
 
 

 g.fillOval(x3,y3,5,5);
 
 
 x3 = (int)(x3 + 5*Math.cos(3.14*teta1/180.0));
 y3 = (int)(y3 + 5*Math.sin(3.14*teta1/180.0));
 
 if ((x3 >= x2 && x3 <= x2 + 40)&& (y3 >= 40 && y3 <= 70 ))
 {
	 setBackground(Color.blue) ;
 }
 else
 {
	 setBackground(Color.yellow) ;
 }
 g.drawString(Integer.toString(x3), 100,100);
 g.drawString(Integer.toString(y3), 200,100);
 try
 {
  Thread.sleep(100) ;
 }
 catch(Exception e )
 {
  
 }
 repaint() ;
 }
 
 public void keyPressed(KeyEvent e )
 {
  int tus = e.getKeyCode() ;
   
  switch(tus)
  {
   case(KeyEvent.VK_UP):
   
	x3 = x + x1 ;
    y3 = y + y1 ;
  teta1 = teta ;
  
    break ;
  
   case(KeyEvent.VK_LEFT):

	   if (teta>-180.0  )
    	teta = teta - 10 ;
   
     break ;
   case(KeyEvent.VK_RIGHT):
    
	   if (teta<0.0  )
    
    	 teta = teta + 10 ;
  
    break ;
  }
 
 repaint() ;
 }

 public void keyReleased(KeyEvent e)
 {
  
 }
 
 public void keyTyped(KeyEvent e)
  {
  
 }




}
