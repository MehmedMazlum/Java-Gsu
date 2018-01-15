package son_ekler;

import java.awt.*;
import java.applet.Applet ;
import java.awt.event.* ;

public class aplet_aplet extends Applet implements ActionListener  {
 
 TextArea a ;
 TextArea t ;
 Button b ;
  Button c ;
 String mesaj ;
 int i ;
 String alfabe ;
 int m ;
 int y; 
  int j ;
 public void init() {
  setBackground(Color.yellow) ;
  
  alfabe  = "abcçdefgðhýijklmnoöprsþtuüvyz" ;
  // m = (int)(Math.random()*29) + 0 ;

  
   /* for ( j= 0; j< mesaj.length() ; j++ )
    {
     for ( y = 0 ; y<alfabe.length() ; y++)
     {
      mesaj = alfabe.substring(y,y+1) ;
      
       if ( mesaj == alfabe.substring(y,y+1) )
      {
       y ++ ;
      }
       
     }
    }*/
  
  
  a = new TextArea ("",10,25,TextArea.SCROLLBARS_BOTH) ;
  add(a) ;
  
   
  b = new Button("Sifrele") ;
  add(b) ;
  b.addActionListener(this) ;
  c = new Button ("Coz");
  add(c) ;
  
  t = new TextArea("",10,25,TextArea.SCROLLBARS_BOTH) ;
   add(t) ;
  
 }

 public void paint(Graphics g) {
  Font tt = new Font ("Times New Roman", Font.PLAIN, 17) ;
  g.setFont(tt);
  g.drawString(mesaj, 100, 400 );
  
 }
 
 public void actionPerformed(ActionEvent e )
  {
  String c = e.getActionCommand() ;
  if (c.equals("Sifrele")) 
  {
    mesaj = a.getText() ;
    t.setText(mesaj) ;
  } 
  if (c.equals("Coz"))
  {
    
  } 
   repaint() ;
  }
 
}
