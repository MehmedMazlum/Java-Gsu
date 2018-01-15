package final_icin_uygulamalar;

import java.awt.* ;
import java.applet.Applet ;


public class final_2 extends Applet 
{
  int i;
	int x[] = {320,310,300,290,280,270,260,250,240,230,220} ;
	int y[] = {150,150,150,150,150,150,150,150,150,150,150};
	int z[] = {0,0,0,0,0,0,0,0,0,0,0};
	double teta ;
	double teta_1 ;
	double r3 = new Double(361*Math.random());
	double k ;
	public void init()
	{
		setSize(500,300);
		setBackground(Color.yellow);
	}


	public void paint(Graphics p)
	{
		p.setColor(Color.black);

		for(i=0;i<11;i++)  
		{
			x[i]=(int)(x[i] + 10*Math.cos(r3));
			y[i]=(int)(y[i] + 10*Math.sin(r3)); 
		         
			if(x[i] > 490 || x[i] <  0 ) 
			{
				r3 = 360 - r3 ;
			}
			if(y[i] < 0 || y[i] > 290 )
			{
				r3 = 180 - r3 ;
			}
		}
		
		for (i=0;i<10;i++)
			p.drawLine(x[i],y[i],x[i+1],y[i+1]);


		try
		{
			Thread.sleep(100);
		}
		catch(Exception e) {}
		
		repaint();
	
	
	
	}

}
