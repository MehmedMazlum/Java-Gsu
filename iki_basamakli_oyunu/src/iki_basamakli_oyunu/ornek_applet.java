package iki_basamakli_oyunu;


import java.awt.*; 
import java.applet.*;
import java.awt.event.* ;

public class ornek_applet extends Applet implements ActionListener 
{	String str ;
     TextField T1 ;
     int a ;
     int x ;
     int y ;
     int f ;
     int k ;
      public void init(){
    	  
    	  x = 100 ;
    	  y = 100 ;
    	  f = 1300 ;
    	  k = 100 ;
    	  setBackground(Color.orange);
    	  Button p = new Button ("Baslat");
    	  add(p) ;
    	  p.addActionListener(this);
    	 
          Button k = new Button ("Durdur") ;
          add(k) ;
          k.addActionListener(this) ;
         
          
      }

        public void paint(Graphics g){
       g.setColor(Color.blue);     
       g.fillRect(x, y, 100, 100);
       g.setColor(Color.red) ;
       g.fillRect(f ,k,100,100);
       if ( x == f)
    	   g.setColor(Color.gray) ;
	
        }
            public void actionPerformed (ActionEvent e ){
             String s = e.getActionCommand();
            	if (s.equals ("Baslat"))
            	{
            			if ( x+100 != f)
            		x = x + 20 ;

            	}
            	if(s.equals("Durdur"))
            	{	if ( f != x+100)
            			f = f - 20 ;
            	}
            		repaint();
        		

            }
}