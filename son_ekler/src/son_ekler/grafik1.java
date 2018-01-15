package son_ekler;


import java.awt.*;
import java.applet.Applet ;
import java.awt.event.* ;

public class grafik1 extends Applet implements ItemListener {
 
 Choice fs ;
 Choice ft ;
 Choice fp ;
 String b ;
  String c ;
 String h ;
 int t ;
 
 
 public void init() {
  setBackground(Color.yellow);
  fs = new Choice() ;
  ft = new Choice() ;
  fp = new Choice() ;
  String[] k = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames() ;
   String[] m = new String[4] ;
   m[0] = "Normal" ;
   m[1] = "italik" ;
   m[2] = "kalin" ;
      m[3] = "kalin italik" ;
  for(int i = 0 ; i<k.length ; i++ )
   fs.addItem(k[i]);
  fs.addItemListener(this);
  for(int j = 0 ; j<4 ;j++)
  {
   ft.addItem(m[j]);
  }
  
  for(int wd = 8 ; wd<73 ;wd++)
  {
   fp.addItem(String.valueOf(wd));
  }  
   ft.addItemListener(this);
  fp.addItemListener(this);
  
  add(fs);
  b = k[0] ;
  add(ft);
  c = m[0] ;
  add(fp);
  
 }

 public void paint(Graphics g) {
  
  Font q = new Font(b,Font.PLAIN,Integer.valueOf(h)) ;
   Font y = new Font(b,Font.ITALIC,Integer.valueOf(h));
  Font v = new Font(b,Font.BOLD,Integer.valueOf(h));
  Font z = new Font(b,Font.BOLD + Font.ITALIC,Integer.valueOf(h));
  
  if ( t == 0 )
  g.setFont(q);
   
  if (t == 1 )
  g.setFont(y);
  
  if (t == 2 )
  g.setFont(v);
  
  if (t == 3 )
  g.setFont(z);
  
  g.setColor(new Color(120,80,200));
  
  g.drawString("JAVA Programlama Dili",100,200);
   
  
 }
 
 public void itemStateChanged(ItemEvent e)
 {
  b = fs.getSelectedItem() ;
  c = ft.getSelectedItem() ;
  if (  c == "Normal")
  {
   t = 0 ;
  }
  if ( c == "italik" )
   {
   t = 1 ;
  }
  if (c == "kalin")
  {
   t = 2 ;
  }
  if (c ==  "kalin italik")
  { t = 3 ;
  }
  h = fp.getSelectedItem() ; 
  repaint() ;
 }
}
