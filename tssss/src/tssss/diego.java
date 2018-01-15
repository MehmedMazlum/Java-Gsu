package tssss ;
/* perþembe nin quizz i */
import java.awt.*;
import java.applet.Applet;



public class diego extends Applet 
{
  int i;
	int x[] = {340,330,320};
	int y[] = {200,200,200};
	int z[] = {0,0,0};
	double teta ;
	double teta_1 ;
	double k ;
	public void init()
	{
		setSize(500,300);
		setBackground(Color.green);
	}


	public void paint(Graphics p)
	{
		p.setColor(Color.black);
		p.drawLine(200, 200, 400, 200);
		p.drawLine(200, 200, 200, 50);
		p.drawLine(200,50,400,200);
		p.setColor(Color.red);

k = 250/150 ;
teta_1 = Math.tan(Math.PI + k);
teta = (Math.atan(teta_1))*180/(Math.PI)  ;
p.drawString(Double.toString(teta),50,50);
		for(i=0;i<3;i++)  
		{
			switch(z[i])
			{
			case 0: x[i]=x[i] - 10;	         //x[] = {300,290,280,270,260,250,240,230,220,210,200};
					if(x[i]== 200  ) 
						z[i]=1;
						break;
			case 1: y[i]=y[i] - 10;          //y[] = {150,150,150,150,150,150,150,150,150,150,150};
						if(y[i]==50) 
							z[i]=2;
						break;
			case 2:	x[i]=(int)(x[i] + 10*Math.cos(teta));
					y[i]=(int)(y[i] + 10*Math.sin(teta));
						if(y[i]==200) 
						{
							x[i] = 360 ;
							z[i]=0;
						}
						break;
			}
		}
		
		for (i=0;i<2;i++)
			p.drawLine(x[i],y[i],x[i+1],y[i+1]);


		try
		{
			Thread.sleep(100);
		}
		catch(Exception e) {}
		
		repaint();
	
	
	
	}

}

