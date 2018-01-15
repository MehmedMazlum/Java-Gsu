package deneme_applet_odev;

import java.awt.* ;
import java.applet.Applet; 



public class odev_1 extends Applet
{
  int x=0,y=0;
  int x1 = 0 ;
  int y1 = 130 ;
  double teta=3.14/2;


		public void init(){
	
		setBackground(Color.yellow);
		setSize(500,300);
		
		}


	public void paint(Graphics p)
	{	
	teta=teta - (3.14/20);
	x=(int)(10*Math.cos(teta));
	y=10-(int)(10*Math.sin(teta));
	p.drawLine(0, 150, 50, 220);
	p.drawLine(50, 220, 500, 220);
	
	p.drawOval(x1, y1, 20, 20);
	p.drawLine(10, 140, 10+x, 130+y);

		try{
			Thread.sleep(100);
		}
		catch(Exception e){}
		repaint();		
	}


}
