package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;
  
public class ap_4 extends Applet implements ActionListener {
  
  
  String mesaj = "Merhaba" ;
   Button b ;
  Button k ;
  int i= 100 ;
  int j = 200 ;


 public void init() {
  setBackground (Color.yellow) ;
  b = new Button("SOL");
  add(b) ;
  k = new Button("SAG") ;
   add(k) ;
  b.addActionListener(this) ; 
  k.addActionListener(this) ; 
  
 }

 public void paint(Graphics p) {
  Font tt = new Font ("Times New Roman", Font.PLAIN, 30 );
  p.setFont(tt) ;
   p.drawString(mesaj, i,j); 
  
 }
 
 public void actionPerformed(ActionEvent e )
 {
  String c = e.getActionCommand() ;
  if (c.equals("SOL"))
  { 
   
   i = i- 5 ;
  }
  else if (c.equals("SAG"))
   {
   i = i + 5 ;
  }
   repaint() ;  
  
 }
}  
