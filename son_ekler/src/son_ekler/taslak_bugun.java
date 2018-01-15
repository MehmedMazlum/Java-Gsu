package son_ekler;


import java.awt.* ;
import java.awt.event.* ;

public class taslak_bugun implements WindowListener,ActionListener
{
 Frame a ;
 Panel b ;
 Button dugme ;
 Label etiket ;
  TextArea c ;
   TextArea t ;
  int i ;
  int k ;
 int g = 0 ;
 int j = 0, z= 0  ;
 int t ;
 String sifre = "bugunsaatikidesaldiriyoruz" ;
 int n ;
 int tk ;
 String mesaj ;
 
 public taslak_bugun(String title)
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
	 taslak_bugun p = new taslak_bugun("Merhaba") ;
   p.olustur() ;
  
  
  
  
 }


 public void actionPerformed(ActionEvent e )
  {
  String c = e.getActionCommand() ;
  if (c.equals("Sifrele")) 
   {
   n = (int)Math.sqrt(sifre.length()) ;
 char b[][] = new char[n][n+1] ;
 char dizi[] = new char [sifre.length()] ;
   tk = n ;
   mesaj = c.getText() ;
   for(i=0 ; i<mesaj.length(); i++)

{
 b[j][z] = mesaj.charAt(i) ;
j++ ;
g++ ;
 if (g == tk)
{
g = 0 ;
z = z+1 ;
j = 0 ;
}
}
k = 0 ;
i = 0 ;
j = 0 ;
t = 0 ;

 while (i<n && j<n+1){

dizi[k] = b[i][j] ;
 k++ ; 
j++ ;
t++ ;
 if (t == n+1)
{
j = 0 ;
i = i +1 ;
t = 1 ;
}
}

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
