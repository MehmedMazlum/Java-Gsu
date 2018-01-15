package final_icin_uygulamalar;
/* finalin 2.sorusu */
import java.awt.*;
import java.applet.Applet;

public class final_3 extends Applet {

	int x1 = 100;
	int y1 = 100;
	int delay = 0;
	double aci = 361 * Math.random();
	double aci_1 = 361 * Math.random();
	int x2;
	int y2;
	Double r1 = new Double(361*Math.random());
	Integer x = new Integer(r1.intValue());
	Double r2 = new Double(361*Math.random());
	Integer y = new Integer(r2.intValue());
	
	public void init() {
		setSize(500, 300);
		setBackground(Color.yellow);
	}

	public void paint(Graphics g) {
		g.drawString("" + x1, 200, 200);
	setBackground(Color.yellow);
		
		x = (int)(x + 10*Math.cos(Math.PI*aci_1/180)) ;
		y = (int)(y + 10*Math.sin(Math.PI*aci_1/180)) ;
		g.drawOval(x, y, 80, 80);
		
		x2 = x1 + (int) (100 * (Math.cos(aci * Math.PI / 180.0)));
		y2 = y1 + (int) (100 * (Math.sin(aci * Math.PI / 180.0)));
		x1 = x1 + (int) (10 * (Math.cos(aci * Math.PI / 180.0)));
		y1 = y1 + (int) (10 * (Math.sin(aci * Math.PI / 180.0)));
		g.drawLine(x1, y1, x2, y2);	
		g.drawLine(x2,y2,x2 + (int) (10 * delay * (Math.cos(aci * Math.PI / 180.0))), y2 + (int) (10 * delay * (Math.sin(aci * Math.PI / 180.0))));
		
		if(y<=0 || y >= 220)
			aci_1 = 360 - aci_1 ;
		if(x<= 0 || x > 420)
			aci_1 = 180 - aci_1 ;
		
		
		if (((x2 + (int) (10 * (Math.cos(aci * Math.PI / 180.0)))) <= 0) || ((x2 + (int) (10 * (Math.cos(aci * Math.PI / 180.0)))) >= 500)) {
					delay++;
			if (delay >= 5) {
				aci = 180 - aci;
				x1 = x2;
				y1 = y2;
				x2 = x1 + (int) (100 * (Math.cos(aci * Math.PI / 180.0)));
				y2 = y1 + (int) (100 * (Math.sin(aci * Math.PI / 180.0)));
				delay = 0;
			}
		} else if (((y2 + (int) (10 * (Math.sin(aci * Math.PI / 180.0)))) <= 0) || ((y2 + (int) (10 * (Math.sin(aci * Math.PI / 180.0)))) >= 300)) {
					delay++;
			if (delay >= 5) {
				aci = 360 - aci;
				x1 = x2;
				y1 = y2;
				x2 = x1 + (int) (100 * (Math.cos(aci * Math.PI / 180.0)));
				y2 = y1 + (int) (100 * (Math.sin(aci * Math.PI / 180.0)));
				delay = 0;
			}
		} 

		if ( (Math.sqrt((x1 -(x + 40))*(x1-(x + 40 )) + (y1-(y + 40))*(y1 -(y + 40))) <= 40))  
		{
			setBackground(Color.green);
			x1 = x1 + (int) (5 * (Math.cos(aci * Math.PI / 180.0)));
			y1 = y1 + (int) (5 * (Math.sin(aci * Math.PI / 180.0)));
		}
		
		if(( Math.sqrt((x2 -(x + 40 ))* (x2 -(x + 40)) + (y2 - ( y + 40))* (y2 -(y + 40 ))) <= 40 ) )
		{
			setBackground(Color.green);
			x1 = x1 + (int) (5 * (Math.cos(aci * Math.PI / 180.0)));
			y1 = y1 + (int) (5 * (Math.sin(aci * Math.PI / 180.0)));
		}
		try {
			Thread.sleep(600);
		} catch (Exception e) {

		}
		repaint();
	}

}