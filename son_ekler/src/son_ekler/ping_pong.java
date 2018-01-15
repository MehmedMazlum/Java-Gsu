package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;

public class ping_pong extends Applet implements KeyListener {
 
 int y = 150 ; 
 int t = 150 ;
 int d = 250 ;
  int k = 170 ;
 int aci = (int)(Math.random()*180) + 0 ;
 
 
 public void init() {
  setBackground(Color.yellow) ;
  addKeyListener(this) ;
 } 

 public void paint(Graphics g) {
  
  //g.drawString("Welcome to Java!!", 50, 60 );
   g.drawLine(40,0,40,300) ;
  g.drawLine(460,0,460,300);
  g.fillRect(50,y,10,40);
  g.fillRect(440,t,10,40);
  g.fillOval(d,k,10,10);
  g.drawString(Integer.toString(aci), 40,40);
  d = (int)(d + 10*Math.cos(aci*Math.PI/180));
   k = (int)(k + 10*Math.sin(aci*Math.PI/180));
  if ( ((d<=60) && ((k >=y)  && (k <= y + 30) ))  )
  {
   aci = 180 - aci ;
  }
  if (k <= t- 10 ||  k >= 290 )
  {
   aci = 360 - aci ;
   }
  try
  {
   Thread.sleep(200);
  }
  catch( InterruptedException f ){
  
  }
  repaint() ;
 }
 public void keyPressed(KeyEvent e )
 {
  int tus = e.getKeyCode() ;
  
  switch (tus)
   {
   case(KeyEvent.VK_UP):
   { if ( y != 0 ) 
    y = y - 10 ;
   break ;
   }
   
   case (KeyEvent.VK_DOWN):
   {
    if(y!= 260)
     y = y + 10 ;
   break ;
   }
   case(KeyEvent.VK_W):
    {
    if( t != 0)
     t = t - 10 ;
   break ;
   }
   case(KeyEvent.VK_Z):
   {
    if(t != 260)
    t = t + 10 ;
   break ;  
   }
  }
  
 repaint() ;
 } 
 public void keyReleased(KeyEvent e )
  {
  
 }
 
 public void keyTyped (KeyEvent e )
 {
  
 }
 

 
 
}
