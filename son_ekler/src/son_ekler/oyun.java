package son_ekler;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class oyun extends Applet implements KeyListener

{

	int y1=130,y2=130;

	int x1=245, y=150;

	int skor=0;

   

	Double r3 = new Double (360 * Math.random());

	int teta = r3.intValue();

	public void init()

	{

		setBackground(Color.yellow);

		addKeyListener(this);

	}

	public void paint(Graphics p)

	{

		p.drawLine(40,0,40,300);

      p.drawString("A",20,20);

   

		p.drawLine(460,0,460,300);

        p.drawString("B",480,20);

        

        p.fillRect(50,y1,10,40);

        p.fillRect(440,y2,10,40);

        

        

		double r4 = Math.cos(2*3.14*teta/360);

		double r5 = Math.sin(2*3.14*teta/360);

		int x_hareket = (int)(12*r4);

		int y_hareket = (int)(12*r5);

		

        p.fillOval(x1,y,20,20);

        

		x1=x1+x_hareket;

		y=y+y_hareket;

	

	

		

			if(y>130 && y<170)

	 

			teta=360-teta;

			

			

		

			if(x1<60 && y>130 && y<170)

			teta=180-teta;

	

			

		try

		{

			Thread.sleep(100);

		}

		catch(Exception f){}

		repaint();

	}

        

   

   

	

	public void keyPressed(KeyEvent e)

	{

		int tus = e.getKeyCode();

		switch(tus)

		{

			case(KeyEvent.VK_UP) :if(y1>=10) y1=y1-10; break;

			case(KeyEvent.VK_DOWN) :if(y1<=250)y1=y1+10; break;

			case(KeyEvent.VK_A) :if(y2>=10)  y2=y2-10; break;

			case(KeyEvent.VK_Z) :  if(y2<=250)        y2=y2+10; break;

		}

		repaint();

	}

	public void keyReleased(KeyEvent e){}

	public void keyTyped(KeyEvent e){}

}