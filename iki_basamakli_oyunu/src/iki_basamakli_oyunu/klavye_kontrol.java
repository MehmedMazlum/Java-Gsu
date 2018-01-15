package iki_basamakli_oyunu;

import java.awt.* ;
import java.applet.Applet; 
import java.awt.event.* ;

public class klavye_kontrol extends Applet implements KeyListener, MouseListener   {

	String s = "" ;
	int x ;
	int y ;
	int width, height ;
	String mesaj = "Klavye uzerinden bir tusa basiniz" ;
	
	public void init() {
		setBackground(Color.orange) ;
		 //width = getSize().width;
	      //height = getSize().height;
	      //x = width/2;
	      //y = height/2;
		addKeyListener(this) ;
		addMouseListener(this) ;
	}
	
public void paint(Graphics g)
{
	Font f = new Font("Arial", Font.BOLD,18) ;
	g.setFont(f) ;
	g.drawString("" + mesaj, 10,65) ;

	      g.setColor( Color.gray );
	      //g.drawLine( x, y, x, y-10 );
	      //g.drawLine( x, y, x+10, y );
	      g.setColor( Color.black );
	      g.drawString( s, x, y );

 }

public void keyPressed(KeyEvent e)
{

	
}
public void keyReleased(KeyEvent e )
{
	
}
public void keyTyped(KeyEvent e )
{
	 char c = e.getKeyChar();
	      if ( c != KeyEvent.CHAR_UNDEFINED ) {
	         s = s + c;
	         repaint();
	         e.consume();
}

}
public void mouseEntered( MouseEvent e ) { }
public void mouseExited( MouseEvent e ) { }
public void mousePressed( MouseEvent e ) { }
public void mouseReleased( MouseEvent e ) { }
public void mouseClicked( MouseEvent e ) {
   x = e.getX();
   y = e.getY();
   s = "";
   repaint();
   e.consume();
}

}