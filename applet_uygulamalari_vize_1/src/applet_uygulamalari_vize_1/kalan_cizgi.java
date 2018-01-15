package applet_uygulamalari_vize_1;

import java.awt.* ;
import java.applet.Applet ;
import java.awt.event.* ;

public class kalan_cizgi extends Applet implements MouseListener , MouseMotionListener  {
	
	Point a ;
	int k  = 1 ;
	int c  ;
	int t  ;
	int m ;
	int n ;
	
	public void init()
	{
		setSize(500,300);
		setBackground(Color.yellow);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint( Graphics p)
	{
		Font tt = new Font("Times New Roman", Font.PLAIN, 17);
		p.setFont(tt);
	
		
		p.setColor(Color.red);
		
			
		if ( k == 0 )	
		{
			p.setColor(Color.black);
		
			k++ ;
		
		}

	if ( k == 1 )
	{
		p.drawLine(t, c, m, n);
		k = 0 ;
	
	}
		
	
	
	
		
	}
	
	public void mouseMoved(MouseEvent e )
	{
		
		
	}
	public void mousePressed(MouseEvent e)
	{
	k = 1 ;	
		 t = e.getX() ;
		 c = e.getY() ;
	
		 repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
	k = 1 ;
		m = e.getX();
		n = e.getY();
		repaint() ;
	}
	public void mouseReleased(MouseEvent e)
	{
		
		k = 0 ;
		
		repaint();
	}
	public void mouseClicked(MouseEvent e)
	{
		
	}
	public void mouseEntered(MouseEvent e)
	{
		
	}
	public void mouseExited(MouseEvent e)
	{
		
	}
	
}
