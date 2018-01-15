package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;


public class bomba extends Applet implements KeyListener {
   
    int x = 50  ;
    int v = 10  ;
    int p = 50 ;
     int d = 70 ;
    int g = 5 ;
    int t = 0 ;
    int k = 0 ;
   
    public void init() {
    setBackground(Color.yellow);
    addKeyListener(this) ;
   
    }

    public void paint(Graphics g) {
        
        Font tt = new Font ("Times New Roman", Font.PLAIN, 30) ;
        g.setFont(tt) ;
        //g.drawString("Welcome to Java!!", 50, 60 );
      
        g.drawLine(0,280,500,280);
         g.fillRect(200,230,50,50) ;
         
           g.fillRect(x, 50, 50,30) ;
        g.fillOval(p,d,10,10);
    if ( k == 1 )
    {
        
        t = t + 1 ;
        p = p + v*t ;
        d =  d + 5*t*t ;
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
                
                }    break ;
                
            
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