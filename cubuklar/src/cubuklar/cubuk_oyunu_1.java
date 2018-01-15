package cubuklar;



import java.awt.*;
import java.applet.Applet;


public class cubuk_oyunu_1 extends Applet{
  int x_cubuk=100 ;
  int y_cubuk=100 ;
  int x_cubuk2=100 ;
  int  y_cubuk2=100;
  int teta=0;


	public void init() {
	}


	public void paint(Graphics g) {


	g.drawLine(x_cubuk,y_cubuk,x_cubuk2,y_cubuk2);


	x_cubuk=100+(int)(60*Math.cos(Math.PI*teta%360));
	y_cubuk=100-(int)(60*Math.sin(Math.PI*teta%360));
	//x_cubuk2=100-(int)(60*Math.cos(Math.PI*teta%360));
	//y_cubuk2=100+(int)(60*Math.sin(Math.PI*teta%360));


	teta=teta+10;




		try{
			Thread.sleep(50);
			}catch(Exception e){}
		repaint();
	}
}

