package durmayan_top;

import java.awt.* ;
import java.applet.Applet ;
 /* duvardan geliþ açýsýyla dönen top */

public  class  acýyla_donen extends Applet  {

	double x = 10 ;
	double y = 10  ;
	int aci = (int)(Math.random()*360) + 0 ;
	
	public void init(){
		
		setSize(500,300);
		setBackground(Color.yellow) ;
		
		 
	}
	
	public void paint( Graphics p){



p.drawString(Integer.toString(aci), 400, 400);

p.fillOval((int)x, (int)y, 10, 10);


x = x + 10*Math.cos(aci*Math.PI/180) ;
y = y + 10*Math.sin(aci*Math.PI/180) ;


	if ( (int)x <= 0 || (int)x >= 490  )
	{
	aci = 180 - aci ;
		
	}
if ((int)y <= 0 || (int)y >= 290)
{
	aci = 360 - aci ;
}
	

		try 
		{
			Thread.sleep(1000) ;
		}
		catch (Exception e)
		{}
		repaint() ;
	}
	
}
