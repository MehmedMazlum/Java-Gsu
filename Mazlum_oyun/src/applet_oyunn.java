
import java.awt.* ;
import java.applet.Applet; 
import java.awt.event.* ;

public class applet_oyunn extends Applet implements ActionListener {

	String mesaj ="" ;
	String mesaj_1 ="";
	String mesaj_2 ="";
	Button b ;
	Button c ; 
	TextField a ;
	int k ;
	int oyun_sayisi ;
	int sayi = 0 ;
	int count = 0 ;
	int t ;
	
	public void init()
	{
		setBackground(Color.yellow) ;
		a = new TextField(20) ;
		add(a);
		b = new Button("Tikla");
		b.addActionListener(this) ;
		add(b);
		c = new Button("Durma");
		c.addActionListener(this);
		add(c) ;
	}
	
	public void paint( Graphics p)
	{
	Font tt = new Font("Times New Roman", Font.PLAIN, 30);
	p.setFont(tt);
	p.drawString(mesaj_1, 600, 500);	
	if ( ((oyun_sayisi%100)/10) == (oyun_sayisi/1000) || ((oyun_sayisi%100)/10) == ((oyun_sayisi/100)%10 )
		    || ((oyun_sayisi%100)/10) == (oyun_sayisi%10) || (oyun_sayisi/1000) == ((oyun_sayisi/100)%10) 
		    || (oyun_sayisi/1000) == (oyun_sayisi%10) || ((oyun_sayisi/100)%10) == (oyun_sayisi%10  ))
		    
	{
		p.drawString("rakamlari ayni olan sayi giremezsiniz ", 600, 600);
		oyun_sayisi = (int)(Math.random()*8853) + 1023 ;
		mesaj_1 = String.valueOf(oyun_sayisi);
	}
		p.drawString("yeni cekilen" +" "+mesaj_1, 600, 700);
		
		if ( count == 2)
			p.drawString("+2 oyun bitmistir", 100,100);
		else if ( count == 1)
			p.drawString("+1", 100, 100);
		else if ( count == 0)
			p.drawString("0", 100, 300);
		else if ( count == -1)
			p.drawString("-1", 100, 400);
		else  if ( count == -2)
			p.drawString("-2", 100, 500);
		
		p.drawString(mesaj_2, 100, 600);
		
	
	
		 }

	
	public void actionPerformed(ActionEvent e)
	{
		
		
		String s = e.getActionCommand() ;
		if(s.equals("Tikla"))
		{	
			mesaj = a.getText() ;
			sayi = Integer.valueOf(mesaj);
			
			if( ( sayi%1000 != (sayi/100)%10) && (sayi%1000 != (sayi%100)/10 ) && (sayi%1000 != (sayi%10 )
					&& ((sayi/100)%10 != (sayi%100)/10 ) && ((sayi/100)%10) != sayi%10) && ((sayi%100)/10 
							!= sayi%10 )) 
			  {
				 if ( oyun_sayisi == sayi )
				 {
					 count = 2 ;
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
				 }
				 else if ( (sayi/1000 == oyun_sayisi/1000) || ( (sayi/100)%10 == (oyun_sayisi/100)%10 ) || 
						( sayi%10 == oyun_sayisi%10 ) || ( (sayi%100)/10 == (oyun_sayisi%100)/10 ) )
				 {
					 count = 1 ;
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
					 
				 }
			  }
			  else
			  {		
				  mesaj_2 = "Rakamlari ayni olan bir sayi giremezsiniz. Yeni bir sayi giriniz" ;
				  
			  }

						
			}
		else if (s.equals("Durma"))
		{
			oyun_sayisi = (int)(Math.random()*8853) + 1023 ;
			mesaj_1 = String.valueOf(oyun_sayisi) ;
			
		}
		repaint() ;
	}


}



