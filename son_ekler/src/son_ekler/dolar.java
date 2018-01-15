package son_ekler;


import java.awt.* ;
import java.awt.event.* ;

public class dolar implements ActionListener, WindowListener {
    
    Frame a ;
    Panel b ;
    Button dugme ;
    Button dugme_1 ;
     Label etiket ;
    TextField c ;
    TextField d ;
    String mesaj ;
    String mesaj_1 ;
    Double k ;
    Double m ;
    
    public dolar (String title )
    {
     a = new Frame(title);
      b = new Panel();
     c = new TextField(10);
     dugme = new Button("TL'YE CEVÝR");
     d = new TextField(10) ;
     dugme_1 = new Button("$ A CEVÝR");
    }
    
    public void olustur()
     {
     a.setSize(500,500);
     a.setBackground(Color.yellow);
     a.setLocation(500,500);
     b.add(c);
     b.add(dugme);
     b.add(d);
      b.add(dugme_1);
     a.add(b);
     a.pack();
      dugme.addActionListener(this);
     dugme_1.addActionListener(this);
     a.addWindowListener(this);
     a.setVisible(true);
     
     
     
    }
    
        public static void main(String[] args) {
      
     dolar pencere = new dolar("Merhaba") ;
     pencere.olustur() ;
     
     
  
     
   
   
    }
    
    public void actionPerformed(ActionEvent e)
     {
     String s = e.getActionCommand() ;
     if (s.equals("TL'YE CEVÝR"))
     {
      mesaj = c.getText() ;
      try 
      {
       k = Double.valueOf(mesaj)*2.11 ;
       d.setText(String.valueOf(k)  ) ; 
       }
      catch(Exception f)
      {
       k = -1.0 ;
      }
     
     }
     if (s.equals("$ A CEVÝR"))
     {
      mesaj_1 = d.getText() ; 
      try 
      {
       m = Double.valueOf(mesaj_1)/2.11 ;
        c.setText(String.valueOf(m) ); 
      }
     catch(Exception f)
     {
      m = -2.0 ;
     }
      
     
      
     }
    }
    
    public void windowClosing(WindowEvent e)
     {
     System.exit(0) ;
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
    public void windowDeiconified(WindowEvent e)
    {
     
    }
    public void windowActivated(WindowEvent e)
    {
     
    }
    public void windowDeactivated(WindowEvent e )
     {
     
    }
    
}
