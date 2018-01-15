package object_oriented_1;

import java.awt.* ;
import java.applet.Applet ;



public class applet_3 extends Applet  {

	public void init()
	{
		setBackground(Color.yellow) ;
		
		Label a = new Label ("Bir etiket :") ;
		add(a) ;
		
		TextField b = new TextField(20) ;
		add(b) ;
		b.setText("Buraya sayi gir!");
		
		TextField sifre = new TextField(6) ;
		add(sifre) ;
		//sifre.setEchoCharacter(' * ');
		sifre.setText("Bir");
		
		Choice secimlistesi = new Choice() ;
		add(secimlistesi) ;
		secimlistesi.addItem("Secenek 1");
		secimlistesi.addItem("Secenek 2");
		secimlistesi.addItem("Secenek 3");
		secimlistesi.addItem("Secenek 4");
		secimlistesi.addItem("Secenek 5");
		secimlistesi.addItem("Secenek 6");
		
	Checkbox d = new Checkbox ("Onay");
	add(d) ;
	d.setState(true);
	
	CheckboxGroup radyodugmesi = new CheckboxGroup() ;
	add(new Checkbox ("Evet", radyodugmesi, true));
	add(new Checkbox ("Hayir", radyodugmesi, false));
	
	TextArea s = new TextArea(10,20) ;
	add(s) ;
	s.setText("Buraya yazi yazilabilir");
	
	Button k = new Button("Dugme");
	add(k);
	}

public void paint(Graphics p)
{
	Font tt = new Font ("Italic", Font.PLAIN, 17) ;
	
	p.setFont(tt) ;
	p.drawString("Bu bir deneme GUI programidir.", 200, 200);
}

}
