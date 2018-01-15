package quizz_4;

import java.awt.* ;
import java.applet.Applet ;

public class ucgen extends Applet {

	int x = 200;
	int y = 200 ;
	double x1 = 200 ;
	double y1 = 180 ;
	Double c ;
	int uzunluk ;
	int uzunluk_1 = 20 ;
	Double teta ;
	Double teta_1 ;
	public void init()
	{
		setSize(500,300);
		setBackground(Color.white);
	}
	
	
	public void paint(Graphics g)
	{
		
		 
		g.drawLine(200, 200, 400, 200);
		g.drawLine(200, 200, 200, 50);
		g.drawLine(200,50,400,200);
		g.setColor(Color.orange);
		g.drawLine((int)x, (int)y, (int)x1, (int)(y-20));
		
	
		y = y - 10 ;
	
	if(y < 60)
	{
			y1=  (y1+10*Math.sin(270));
			x1 = (x1+10*Math.cos(270));
	}
		

	
	try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			
		}
		repaint() ; 
	}
	
}
