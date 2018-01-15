package sifreleme;

import java.awt.*;
import java.applet.Applet ;
import java.awt.event.* ;

/* þifreleme : tek Alfabeli Yerine Yerleþtirme Algoritmasý */
public class sifre_1 extends Applet implements ActionListener  {
 
 TextArea a ;
 TextArea t ;
 Button b ;
 Button c ;
 int i ;
 String alfabe = "abcçdefgðhýijklmnoöprsþtuüvyz" ;
 int j ;
 int sayi ;
 String mesaj ;
 String mesaj_2 ;
 char[] mesaj_3 = {} ;
 char[] mesaj_1 = {} ;  
 char[] s_alfabe = new char[29] ;
 char[] g_alfabe = new char[29] ;
 
 public void init() {

	 setSize(500,300);
	 setBackground(Color.yellow) ;
	 a = new TextArea ("",10,25,TextArea.SCROLLBARS_BOTH) ;
	 add(a) ;
  
   
  b = new Button("Sifrele") ;
  add(b) ;
  b.addActionListener(this) ;
  c = new Button ("Coz");
  add(c) ;
  c.addActionListener(this);
  t = new TextArea("",10,25,TextArea.SCROLLBARS_BOTH) ;
  add(t) ; 
   
 }

 public void paint(Graphics g) {
  Font tt = new Font ("Times New Roman", Font.PLAIN, 17) ;
  g.setFont(tt);

  
  g.drawString( String.valueOf(mesaj_3) , 100, 400 );

 }
 
 public void actionPerformed(ActionEvent e )
  {
  String c = e.getActionCommand() ;
  if (c.equals("Sifrele")) 
  {
	 mesaj = a.getText() ;
	int k = 0  ;
	 mesaj_1 = new char[mesaj.length()] ;

	  for (i= 0 ; i<29 ;i++)
			s_alfabe[i] = '0' ;
			
			i = 0 ;
			
			while(i<29)
			{
				sayi =  (int)(Math.random()*29) + 0 ;
				
		if(s_alfabe[sayi] == '0' )  
				{		s_alfabe[sayi] = alfabe.charAt(i);
							i++ ;
					}
				}
	for (i = 0; i< mesaj.length() ; i++)
	{	for(j = 0 ; j<29 ; j++)
		{	if (mesaj.charAt(i) == alfabe.charAt(j))
		{
	mesaj_1[k] = s_alfabe[j] ;  /* þifreli alfabe üzerinden þifreli mesaj yazilir */
			k ++ ;

				}
		}
	}
		 
t.setText(String.valueOf(mesaj_1)) ;	  
			
  } 
  if (c.equals("Coz"))
  {
	mesaj_2 = String.valueOf(mesaj_1) ;
	mesaj_2 = t.getText() ;
    int k = 0 ;
    mesaj_3 = new char[mesaj_2.length()] ;
    
    for ( i = 0 ; i<29 ; i++)
    		g_alfabe[i] = alfabe.charAt(i) ;
    
    for (i = 0; i< mesaj_2.length() ; i++)
	{	
    for ( j =0 ; j< 29 ; j++)
    	{
    		if(mesaj_2.charAt(i) == s_alfabe[j])
    		{
    			mesaj_3[k] = g_alfabe[j] ;
    			k++ ;
    		}
    	}
    	}
    t.setText(String.valueOf(mesaj_3)) ;
  } 
   repaint() ;
  }
 
}
