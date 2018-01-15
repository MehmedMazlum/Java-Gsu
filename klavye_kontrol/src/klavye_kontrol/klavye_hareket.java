package klavye_kontrol;

import java.awt.* ;
import java.applet.Applet; 
import java.awt.event.* ;



public class klavye_hareket  extends Applet implements KeyListener {

	int koordX = 200 ;
	int koordY = 200 ;
	String hedef = "<----->" ;
	
	String mesaj = "Ok tuslarýna basarak hedefi yonlendirin" ;
	
	public void init() 
	{
		setBackground(Color.white) ;
		
		addKeyListener(this) ;
		requestFocus() ;
	}
	
	public void paint (Graphics g)
	{
		Font f = new Font("Arial", Font.PLAIN, 14);
		g.setFont(f);
		g.drawString(mesaj, 10, 25);
		
		Font w = new Font("Arial", Font.BOLD,22 ) ;
		g.setFont(w);
		g.drawString(hedef, koordX, koordY);
		
	 
	}
	
	public void keyPressed(KeyEvent e)
	{
		int tus = e.getKeyCode();
		switch (tus ){
		case (KeyEvent.VK_UP):
			koordY = koordY - 10 ;
			break ;
		case (KeyEvent.VK_DOWN):
			koordY = koordY + 10 ;
			break ;
		case (KeyEvent.VK_LEFT):
			koordX = koordX - 10 ;
			break ;
		case (KeyEvent.VK_RIGHT):
			koordX = koordX + 10 ;
			break ;
		
		}
			repaint() ;
	}
	
	public void keyReleased(KeyEvent e )
	{
		
	}

	public void keyTyped(KeyEvent e )
	{
		
	}
}
