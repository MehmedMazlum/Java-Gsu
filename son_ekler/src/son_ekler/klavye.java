package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;


public class klavye extends Applet implements KeyListener {
    
    int x = 200 , y = 200 ;
    String isaret ="+" ;
     
    public void init() {
    setBackground(Color.yellow);
    addKeyListener(this) ;
    
    }

    public void paint(Graphics g) {
        
        Font tt = new Font ("Times New Roman", Font.PLAIN, 30) ;
         g.setFont(tt) ;
        g.drawString("Welcome to Java!!", 50, 60 );
        
        g.drawString(""+isaret, x,y);
    }
    
    public void keyPressed ( KeyEvent e )
        
     {
        int tus = e.getKeyCode() ;
    
    switch ( tus )
        
    {
        case(KeyEvent.VK_UP): if (y < 300  )

             y = y- 10 ;
              break ;
    
        case (KeyEvent.VK_DOWN):
         if ( y > 0 )
                 y =  y +10  ; 
                     break ;
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