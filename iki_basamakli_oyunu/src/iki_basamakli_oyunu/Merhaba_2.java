package iki_basamakli_oyunu;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Merhaba_2 extends Applet implements ActionListener 

{

	int x1=10,x2=470;

	public void init()
{

		setBackground(Color.yellow);

}

public void paint (Graphics p)

{

Font tt = new Font("Arial",Font.PLAIN,25);
p.setFont(tt);
	p.drawString("Mer",x1,60);
	p.drawString("haba",x2,60);

	if(x1<=250 && x2>=265)

		{

          x1=x1+5;
          x2=x2-5;

		}

try

		{

			Thread.sleep(100);

		}

		catch(Exception e){}

		repaint();

	}

public void actionPerformed(ActionEvent e )
{
	
}

}