package iki_basamakli_oyunu;

import java.awt.* ;
import java.applet.Applet; 
import java.awt.event.* ;

public class Merhaba_1 extends Applet  implements MouseListener, MouseMotionListener  {

	public void init()
	{
			setBackground(Color.yellow) ;
			
			Label a = new Label ("Bir etiket :");
			add(a) ;
			
			TextField b = new TextField(20) ;
			add(b) ;
			
			TextField sifre = new TextField(6) ;
			add(sifre );
			sifre.setEchoCharacter('*');
			
			Choice secimlistesi = new Choice() ;
			add(secimlistesi ) ;
			secimlistesi.addItem("Secenek 1");
			secimlistesi.addItem("Secenek 2");
			secimlistesi.addItem("Secenek 3");
			
			Checkbox d = new Checkbox("Onay");
			add(d) ;
			d.setState(true );
			
			CheckboxGroup radyodugmesi = new CheckboxGroup() ;
			add(new Checkbox("Evet", radyodugmesi,true)) ;
			add(new Checkbox("Hayir", radyodugmesi, false)) ;
			
			TextArea s = new TextArea(10,20);
			add(s) ;
			s.setText("Buraya yazi yazilabilir") ;
			
			Button k = new Button ("Dugme");
			add(k) ;
			
	}
	
	public void paint ( Graphics p)
	{
	
		Font tt = new Font ("Arial", Font.PLAIN, 17);
		p.setFont(tt) ;
		p.drawString("Bu bir deneme GUI programidir.", 200, 200) ;

	}
	 public void mouseMoved( MouseEvent e )
	 {
	
	  
	 }
	 
	 public void mousePressed(MouseEvent e)
	  {
	 }
	 
	 public void mouseDragged(MouseEvent e)
	 {
	  
	 }
	 
	 public void mouseReleased(MouseEvent e)
	 {
	  
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
