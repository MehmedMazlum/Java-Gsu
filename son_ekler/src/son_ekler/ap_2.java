package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;
  
public class ap_2 extends Applet implements ActionListener {
  
  Button b ;
  Button k ;
  Button n ;
   String mesaj = "Merhaba" ;
   int i= 100 ;
  int j = 200 ;


 public void init() {
  
 }
 
 
 public void paint(Graphics p) {

  Font tt = new Font ("Times New Roman", Font.PLAIN, 30 );
   p.setFont(tt) ;

  p.drawString(mesaj, i,j) ;
  while ( )
  i =  i + 10 ;
   try
  {
   Thread.sleep(1000) ;
  }
  catch (Exception  e) {} 
  repaint() ; 
  
 }
 
 public void actionPerformed(ActionEvent e )
  {
 }
}    
