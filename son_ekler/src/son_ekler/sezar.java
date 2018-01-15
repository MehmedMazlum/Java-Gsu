package son_ekler;

import java.awt.* ;
import java.awt.event.* ;

public class sezar implements WindowListener,ActionListener
{
 Frame a ;
 Panel b ;
 Button dugme ;
 Label etiket ;
  TextArea c ;
 TextArea t ;
 char ba[][] ;
 char dizi[] ;
 int i ;
 int k ;
 int g = 0 ;
 int j = 0, z= 0  ;
 int u ;
 String sifre ;
 int n ;
 int tk ;
 String mesaj  ;
 String mesaj_2 ;
  
 public sezar(String title)
  {
   a = new Frame(title) ; 
   b = new Panel() ;
   dugme = new Button("Sifrele");
   etiket = new Label("Bu butona týklayabilirsiniz");
   c = new TextArea ("",10,25,TextArea.SCROLLBARS_BOTH) ;
    t = new TextArea("",10,25,TextArea.SCROLLBARS_BOTH) ;
     
  }

public void olustur ()
{
 a.setSize(500,500) ;
 a.setBackground(Color.white);
 a.setLocation(500,500) ;
 b.setBackground(Color.yellow);
  b.add(c) ;
 b.add(dugme);
 b.add(t);
 a.add(b);
 a.pack() ;
 a.addWindowListener(this);
 a.setVisible(true);
 dugme.addActionListener(this);
}
 
 public static void main(String args[])
 {
    sezar p = new sezar("Merhaba") ;
   p.olustur() ;    
   
 }


 public void actionPerformed(ActionEvent e )
  {
  String w = e.getActionCommand() ;
  if (w.equals("Sifrele")) 
    {
 mesaj = c.getText().replaceAll("\\s","") ;
 n = (int)Math.sqrt(mesaj.length());
ba = new char [n][n+1] ;
dizi = new char [mesaj.length()];
tk = n ;
j = 0 ;
z = 0 ;
for(i=0 ; i<mesaj.length() ; i++)
 {
 ba[j][z] = mesaj.charAt(i);
 j++ ;
 g++ ;
 if ( g == tk)
  {
   g = 0 ;
   z = z+1 ;
   j = 0 ;
  }
}
k = 0 ;
i = 0 ;
j = 0 ;
u = 0 ;
  while(i<n && j<n+1)
   {
   dizi[k] = ba[i][j] ;
   k++ ;
   j++ ;
   u++ ;
  
  if(u == n + 1 )
  {
   j = 0 ;
   i = i+1 ;
   u = 1 ;
  }
  }
   for(i=0 ; i<mesaj.length();i++)
  {
   mesaj_2 += Character.toString(dizi[i]) ;
    // bskaizuailygaddouteirnisru
  }
 t.setText(mesaj_2.toLowerCase());
}
  }
public void windowClosing(WindowEvent e )
  {
    System.exit(0);
 }
 public void windowOpened(WindowEvent e )
  {
   
 }
 public void windowClosed(WindowEvent e )
 {
   
 }
 public void windowIconified(WindowEvent e )
 {
    
  }
 public void windowDeiconified(WindowEvent e )
 {
     
 }
  public void windowActivated(WindowEvent e )
  {
      
 }
 public void windowDeactivated(WindowEvent e )
 {
       
 }
}
