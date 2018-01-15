package helikopter_1;
/* Pazartesi 5 Mayis günü Helikopter oyunu (elips þeklinde dönen pervane) */
import java.awt.*;
import java.applet.Applet;
import java.awt.event.* ;

public class helikopter extends Applet implements KeyListener {
 
 int teta = 270 ;
 int teta_1 = 270 ;
 int a ;
 int b ;
 int c ;
 int d ;
 int x1  ;
 int x2 ;
 int x3 = 50;
 int x4 = 50 ;
 int x5 = 80 ;
 int x6 ;
 int x7 = 400 ;
 int x8 = 50 ;
 int y1 ;
 int y2  ;
 int y3 = 100;
 int y4 = 30 ;
 int y6 = 110 ;
 int y7 = 100 ;
 int y8 = 30 ;
 int y9 ;
 int y10 ;
 int kx_1 ;
 int kx_2 ;
 int ky_1 ;
 int ky_2 ;
 int kx_5 = 410 ;
 int ky_6 = 110 ;
 int skor = 0 ;
 int skor_1 = 0 ;
 
 int p = 0 ;
 int t = 0 ;
 
 public void init() {
  
  setSize(500,300);
  setBackground(Color.yellow);
  addKeyListener(this);
 }

 public void paint(Graphics g) {

  Font tt = new Font("Times New Roman",Font.PLAIN,20);
  g.setFont(tt);
  g.fillRect(x3,y3,x4,y4);
  g.fillRect(x7, y7, x8, y8);
if(t == 1)
{
	x5 = x5 + 10 ;
	
	   if (x5 == 490)
	   {
		   t = 0 ;
		   x5 = 80 ;
		   y6 = y3 + 10 ;
	   }

}
if (p == 1 )
{
	kx_5 = kx_5 - 10 ;
	if (kx_5 == 0 )
	{
		p = 0 ;
		kx_5 = 410 ;
		ky_6 = y7 + 10 ;
	}
}

g.fillOval(x5,y6,10,10);
g.fillOval(kx_5, ky_6, 10, 10);
g.drawLine(x3 + 25,y3,x4 + 25,y3-40);
g.drawLine(x7 + 25, y7, x7 + 25, y7 - 40);

if((teta_1 >320 && teta_1 < +40) || (teta_1 >140 && teta_1 < 220))
{
	  c = (int)(60*Math.cos(2*3.14159*teta_1/360));
	  d = (int)(20*Math.sin(2*3.14159*teta_1/360)); 
}
else
{
	 c = (int)(60*Math.cos(2*3.14159*teta_1/360));
	 d = (int)(20*Math.sin(2*3.14159*teta_1/360));
}
kx_1 = x7 + 25 + c ;
ky_1 = y7 - 40 + d ;
kx_2 = x7 + 25 - c ;
ky_2 = y7 - 40 - d ;

if((teta > 320 && teta < +40) || (teta>140 && teta <220))
   {
  a = (int)(60*Math.cos(2*3.14159*teta/360));
  b = (int)(60*Math.sin(2*3.14159*teta/360));
  }
  else
  {
  a = (int)(60*Math.cos(2*3.14159*teta/360));
  b = (int)(20*Math.sin(2*3.14159*teta/360));
   }
  x1 = x3 + 25 +a ;
  y1 = y3 - 40 +b ;
  x2 = x4 + 25 -a ;
  y2 = y3 - 40 -b ;
  g.drawLine(x1,y1,x2,y2);
  g.drawLine(kx_1,ky_1,kx_2,ky_2);  
  teta = teta + 30 ;
  teta_1 = teta_1 + 30 ;
 
  if((kx_5 < 90 && kx_5 > 50) && (ky_6 > y3-10 && ky_6 < y3 + y4))
  {
	setBackground(Color.green); 
  	skor_1= skor_1 + 1  ;
  
  	
  } 
  else
	  setBackground(Color.yellow);
  if ((x5 > 400 && x5 < 450) && (y6 > y7-10 && y6 < y7 + y8 ))
  {
	  skor = skor + 1 ;
	  setBackground(Color.gray);
  }
  else
	  setBackground(Color.yellow); 
  
  g.drawString(skor+"-"+skor_1, 200, 200);
  try{
   Thread.sleep(120) ;
  }
  catch(Exception e )
   {
   
  }
  repaint() ;
 }
 public void keyPressed(KeyEvent e)
 {
  int a = e.getKeyCode() ;
  switch(a)
  {
   case(KeyEvent.VK_A): 
    if(y1 >0 && y2 >0)
    { 
    
    	y3 = y3 - 10 ;
    if(t != 1)
    	y6 = y6 - 10 ;
    }
    break ;
   case(KeyEvent.VK_Z): 
    if(y3 <270)
    {
     y3 = y3 + 10 ;
     if( t!= 1)
     y6 = y6 + 10 ;
     }
    
    break ;
   case(KeyEvent.VK_SPACE):

   	t = 1 ;		
   	    

	   
   break ;
    case(KeyEvent.VK_UP):
    	if(ky_1 >0 && ky_2 >0)
    	{
    		y7 = y7 - 10 ;
    		if(p!= 1)
    		ky_6 = ky_6 - 10 ;
    	}
    	break ;
   case(KeyEvent.VK_DOWN):
	   if(y7 <270)
	   {
		   y7 = y7 + 10 ;
		   if(p != 1)
			  ky_6 = ky_6 + 10 ;
	   }
	   break ;
   case(KeyEvent.VK_ENTER):
	   p = 1 ;
	   
	   break ;
   
   
  }
  
 }
 public void keyReleased(KeyEvent e)
 {
  
 }
 public void keyTyped(KeyEvent e )
  {
  
 }
}
