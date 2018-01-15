package iki_basamakli_oyunu;

import java.awt.* ;
import java.applet.Applet; 
import java.awt.event.* ;

public class Applet_basamak_oyun extends Applet implements ActionListener {

	String mesaj ;
	Button b ;
	TextField a ;
	int sayi ;
	int oyun_sayisi ;
	int count ;
	
	
	
	public void init()
	{
		setBackground(Color.yellow) ;
		b = new Button("Tikla ");
		a = new TextField(5) ;
		add(a);
		b.addActionListener(this) ;
		add(b);
	}
	
	public void paint( Graphics p)
	{
		oyun_sayisi = (int)(Math.random()*8853) + 1023 ;
		
		
		if (sayi == -1 )
			p.drawString("Harf giremezsiniz tekrar deneyin", 150, 280);
		else 
		{
		     int oyun_sayisi = (int)(Math.random()*8853) + 1023 ;
		     System.out.println(+oyun_sayisi); 
		     int sayi = 0 ; 
		     int count = 0 ;
		     
		     while ( 
		    ((oyun_sayisi%100)/10) == (oyun_sayisi/1000) || ((oyun_sayisi%100)/10) == ((oyun_sayisi/100)%10 )
		    || ((oyun_sayisi%100)/10) == (oyun_sayisi%10) || (oyun_sayisi/1000) == ((oyun_sayisi/100)%10) 
		    || (oyun_sayisi/1000) == (oyun_sayisi%10) || ((oyun_sayisi/100)%10) == (oyun_sayisi%10  ))
		     	{
		      
		      p.drawString("Rakamlari ayni olan sayi giremezsiniz",600,600) ;
		      oyun_sayisi = (int)(Math.random()*8853) + 1023 ;
		     	}
		 p.drawString("yeni cekilen :" + oyun_sayisi) ;   
		  do {
			  if( ( sayi%1000 != (sayi/100)%10) && (sayi%1000 != (sayi%100)/10 ) && (sayi%1000 != (sayi%10 )
					&& ((sayi/100)%10 != (sayi%100)/10 ) && ((sayi/100)%10) != sayi%10) && ((sayi%100)/10 
							!= sayi%10 )) 
			  {
				 if ( oyun_sayisi == sayi )
				 {
					 count = 2 ;
				 p.drawString("+2",600,600);
				 }
				 else if ( ( ((sayi%100)/10 == oyun_sayisi/1000) && (sayi/1000 == (oyun_sayisi/100)%10 )  && ((sayi/100)%10 == oyun_sayisi%10)  && (sayi%10 == (oyun_sayisi%100)/10 )
		)|| ( ((sayi%100)/10 == oyun_sayisi%10 ) && (sayi/1000 == (oyun_sayisi/100)%10) && ((sayi/100)%10 == oyun_sayisi/1000) && (sayi%10 == (oyun_sayisi%100)/10)) 
		|| (((sayi%100)/10 == (oyun_sayisi/100)%10) && (sayi/1000 == oyun_sayisi%10) && ((sayi/100)%10 == oyun_sayisi/1000) && (sayi%10 == (oyun_sayisi%100)/10))
		|| (((sayi%100)/10 == (oyun_sayisi/100)%10) && (sayi/1000 == oyun_sayisi%10) && ((sayi/100)%10 == (oyun_sayisi%100)/10) && (sayi%10 == oyun_sayisi/1000)
		|| ((sayi%100)/10 == oyun_sayisi/1000) && (sayi/1000 == oyun_sayisi%10) && ((sayi/100)%10 == (oyun_sayisi%100)/10) && (sayi%10 == (oyun_sayisi/100)%10) 
		) || (((sayi/100)%10 == oyun_sayisi%10) && (sayi/1000 == oyun_sayisi%1000) &&((sayi/100)%10 == (oyun_sayisi%100)/10) && (sayi%10 == (oyun_sayisi/100)%10)
		) || (((sayi%100)/10 == oyun_sayisi%10 ) && (sayi/1000 == (oyun_sayisi/100)%10 ) && ((sayi/100)%10 == (oyun_sayisi%100)/10) && (sayi%10 == oyun_sayisi/1000)
		)|| (((sayi%100)/10 == oyun_sayisi%10) && (sayi/1000 == (oyun_sayisi%100)/10) && ((sayi/100)%10 == oyun_sayisi/1000) && (sayi%10 == (oyun_sayisi/100)%10) 
		) || ( ((sayi%100)/10 == (oyun_sayisi/100)%10) && (sayi/1000 == (oyun_sayisi%100)/10) && ((sayi/100)%10 == oyun_sayisi%10 ) && (sayi%10 == oyun_sayisi/1000) ) 
		|| (  ((sayi%100)/10 == oyun_sayisi/1000) && (sayi/1000 == (oyun_sayisi%100)/10) && ((sayi/100)%10 == oyun_sayisi%10) && (sayi%10 == (oyun_sayisi/100)%10)))
			 
				 {
					 count = -2 ;
					 p.drawString("-2",600,600);
				 }
		else if ( ( ((sayi%100)/10 == oyun_sayisi/1000) || (sayi/1000 == (oyun_sayisi/100)%10 )  || ((sayi/100)%10 == oyun_sayisi%10)  || (sayi%10 == (oyun_sayisi%100)/10 )
				)|| ( ((sayi%100)/10 == oyun_sayisi%10 ) || (sayi/1000 == (oyun_sayisi/100)%10) || ((sayi/100)%10 == oyun_sayisi/1000) || (sayi%10 == (oyun_sayisi%100)/10)) 
				|| (((sayi%100)/10 == (oyun_sayisi/100)%10) || (sayi/1000 == oyun_sayisi%10) || ((sayi/100)%10 == oyun_sayisi/1000) || (sayi%10 == (oyun_sayisi%100)/10))
				|| (((sayi%100)/10 == (oyun_sayisi/100)%10) || (sayi/1000 == oyun_sayisi%10) || ((sayi/100)%10 == (oyun_sayisi%100)/10) || (sayi%10 == oyun_sayisi/1000)
				|| ((sayi%100)/10 == oyun_sayisi/1000) || (sayi/1000 == oyun_sayisi%10) || ((sayi/100)%10 == (oyun_sayisi%100)/10) || (sayi%10 == (oyun_sayisi/100)%10) 
				) || (((sayi/100)%10 == oyun_sayisi%10) || (sayi/1000 == oyun_sayisi%1000) || ((sayi/100)%10 == (oyun_sayisi%100)/10) || (sayi%10 == (oyun_sayisi/100)%10)
				) || (((sayi%100)/10 == oyun_sayisi%10 ) || (sayi/1000 == (oyun_sayisi/100)%10 ) || ((sayi/100)%10 == (oyun_sayisi%100)/10) || (sayi%10 == oyun_sayisi/1000)
				)|| (((sayi%100)/10 == oyun_sayisi%10) || (sayi/1000 == (oyun_sayisi%100)/10) || ((sayi/100)%10 == oyun_sayisi/1000) || (sayi%10 == (oyun_sayisi/100)%10) 
				) || ( ((sayi%100)/10 == (oyun_sayisi/100)%10) || (sayi/1000 == (oyun_sayisi%100)/10) || ((sayi/100)%10 == oyun_sayisi%10 ) || (sayi%10 == oyun_sayisi/1000) ) 
				|| (  ((sayi%100)/10 == oyun_sayisi/1000) || (sayi/1000 == (oyun_sayisi%100)/10) || ((sayi/100)%10 == oyun_sayisi%10) || (sayi%10 == (oyun_sayisi/100)%10)) )
				 {
					 count = -1 ;
					 p.drawString("-1",600,600);
				 }
				 else if ( (sayi/1000 == oyun_sayisi/1000) || ( (sayi/100)%10 == (oyun_sayisi/100)%10 ) || 
						( sayi%10 == oyun_sayisi%10 ) || ( (sayi%100)/10 == (oyun_sayisi%100)/10 ) )
				 {
					 count = 1 ;
					 p.drawString("+1", 600,600);
				 }
				 else if ( 
						 
						 ((sayi%100)/10 != (oyun_sayisi%100)/10) && ((sayi%100)/10 != oyun_sayisi/1000) 
						 && ((sayi%100)/10 != (oyun_sayisi/100)%10 ) && ((sayi%100)/10 != oyun_sayisi%10)
						&& ((sayi/100)%10 != (oyun_sayisi%100)/10) && ((sayi/100)%10 != oyun_sayisi/1000) &&
						((sayi/100)%10 != (oyun_sayisi/100)%10 ) && ((sayi/100)%10 != oyun_sayisi%10) && 
						 (sayi%10 != (oyun_sayisi%100)/10) && (sayi%10 != oyun_sayisi/1000) 
						 && (sayi%10 != (oyun_sayisi/100)%10 ) && (sayi%10 != oyun_sayisi%10) && 
						 (sayi/1000 != (oyun_sayisi%100)/10) && (sayi/1000 != oyun_sayisi/1000) 
						 && (sayi/1000 != (oyun_sayisi/100)%10 ) && (sayi/1000 != oyun_sayisi%10) )
				 {
					 count = 0 ;
					 p.drawString("0", 600,600);
					 
				 }
			  }
			  else
				  p.drawString("Rakamlari ayni olan bir sayi giremezsiniz. Yeni bir sayi giriniz",600,600) ;
		  
		    } while( count != 2) ;
		}
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand() ;
		if(s.equals("Tikla"))
		{
			mesaj = a.getText() ;
			try 
			{
			sayi = Integer.valueOf(mesaj) ;	
			}
			catch(Exception f )
			{
				sayi = -5 ;
			}
		repaint() ;
		}
	}

}
