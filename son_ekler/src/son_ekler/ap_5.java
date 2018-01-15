package son_ekler;


import java.awt.*;
import java.applet.*;
import java.awt.event.* ;
  
public class ap_5 extends Applet implements ActionListener {
  
  
  TextField a ;
  Button b ;
  String mesaj = "" ;
   String mesaj_1 = "asal degildir" ;
  String mesaj_2 = "asaldir" ;
  int i ;


 public void init() {
  setBackground (Color.yellow) ;
  a = new TextField(20 );
  add(a) ;
  a.setText("Buraya isminizi giriniz") ;
   b = new Button("OK");
  add(b) ;
  b.addActionListener(this) ; 
   
  
 }

 public void paint(Graphics p) {
  
  Font tt = new Font ("Times New Roman", Font.PLAIN, 30 );
   p.setFont(tt) ;
   int  k = Integer.valueOf(mesaj) ;
    for (i = 2 ; i<= Math.sqrt(k) ; i++ )
   {
    if ( k%i == 0 )
    {
    p.drawString(mesaj_1, 100,200);      
    }
    else
    {
     
    p.drawString(mesaj_2, 100,200); 
    }
    
   }
  
  
 }
 
 public void actionPerformed(ActionEvent e )
 {
  String c = e.getActionCommand() ;
  if (c.equals("OK"))
    mesaj = a.getText();
   repaint() ;  
  
 }
}        
