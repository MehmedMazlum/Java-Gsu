package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;




public class bomba_bomba extends Applet implements KeyListener {



 int x = 50 ;

 int v = 10 ;

 int p ;

 int d ;

 int g = 5 ;

 int t = 0 ;

 int k = 0 ;

 int m = 200 ;



 public void init() {

setSize(500,300);

 setBackground(Color.yellow);

 addKeyListener(this) ;



}


 public void paint(Graphics g) {



 Font tt = new Font ("Times New Roman", Font.PLAIN, 30) ;

g.setFont(tt) ;

 //g.drawString("Welcome to Java!!", 50, 60 );

 

g.drawLine(0,280,500,280);

 g.fillRect(m,230,50,50) ;



 g.fillRect(x, 50, 50,30) ;



 g.fillOval(p,d,10,10);

 p = x + 20 ;

 d = 50 ;



 if ( k == 1 )

{



 t = t + 1 ;

 p = p + v*t ;

 d = d + 5*t*t ;



}



 if ( d > 300 || p > 500)

{

 k = 0 ;

 t = 0 ;



}

 if ( (p >= m && p <= (m +50)) && (d>= 230 && d<= 280 ) )

{

 g.drawString("hedef vurulmustur", 100, 100);

 m = m + 10 ;

}

 try

{

Thread.sleep(100);

 }catch(Exception e)

{

}



 x = x + 10;

 if (x == 500 )

{

 x = 0 ;

}

repaint();




}



 public void keyPressed ( KeyEvent e )

{

 int tus = e.getKeyCode() ;

 switch(tus)

{

 case(KeyEvent.VK_SPACE):

{ 

 k++ ; 



 } break ;





}

repaint() ;

}



 public void keyReleased(KeyEvent e )

{



}

 public void keyTyped( KeyEvent e )

{




} 

}
