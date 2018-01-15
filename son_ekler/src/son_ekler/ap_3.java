package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;
  
public class ap_3 extends Applet implements ActionListener {
  
  Button b ;
  Button k ;
  Button n ;
   int i= 100 ;
  int j = 200 ;


 public void init() {
  
  b = new Button("KIRMIZI");
  add(b) ;
  k = new Button("SARI") ;
  add(k) ;
  n = new Button ("BEYAZ");
   add(n) ;
  
  b.addActionListener(this) ; 
  k.addActionListener(this) ; 
  n.addActionListener(this) ;
  
 }

 public void paint(Graphics p) {
  Font tt = new Font ("Times New Roman", Font.PLAIN, 30 );
   p.setFont(tt) ;
  
 }
 
 public void actionPerformed(ActionEvent e )
 {
  String c = e.getActionCommand() ;
  if (c.equals("KIRMIZI"))
  { 
  setBackground (Color.red) ;
  }
  else if (c.equals("SARI"))
   {
  setBackground (Color.yellow) ;
  }
  else if (c.equals("BEYAZ"))
  {
   setBackground (Color.white) ;
  }
   repaint() ;  
  
 }
}         
