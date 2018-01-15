package final_icin_uygulamalar;

import java.awt.* ;
import java.awt.event.* ;

class bosluk 
{
	static String boslukat(String metin)
	{
		String metin2 = "" ;
		int n = metin.length() ;
		for(int i=0 ; i <n ; i++)
		if(!(metin.substring(i, i+1)).equals(" "))
		{
			metin2 = metin2 + metin.substring(i, i+1);
		}
		return metin2 ;
	}
}


 class kriptolama{
	
	 String kriptolama(String metin)
	 {
		 int n , k = 0 , m, p ;
		 double r ;
		 String kripto = "" ;
		 String metin_2 = "" ;
		 metin = metin.toLowerCase() ;
		 metin_2 = bosluk.boslukat(metin) ;
		 
		 n = metin_2.length() ;
		 r = Math.sqrt(n) ;
		 m = (int)r ;
		 if (m*m != n)
			 m++ ;
		 int m2 = m ;
		 while(m > 0)
		 {
			 p = k ;
			 do 
			 {
				 kripto = kripto + metin_2.substring(p, p+1);
				 p = p+m2 ;
			 }
			 while(p<n);
			 k++ ;
			 m-- ;
		 }
		 return kripto ;
	 }

}
 
public class jul_sezar implements WindowListener, ActionListener 
{
	TextArea t1 ;
	TextArea t2 ;
	Button b1 ;
	public void pencereolustur()
	{
		Frame pencere = new Frame("Jul Sezar kutu sifreleme");
		pencere.setLocation(400,250 );
		pencere.setBackground(Color.yellow);
		pencere.setSize(700,500) ;
		Rectangle r = new Rectangle(700,500) ;
		pencere.setMaximizedBounds(r);
		pencere.setLayout(new FlowLayout(FlowLayout.LEFT,15,30));
		
		Label l1 = new Label("Orijinal metin");
		Label l2 = new Label("Kriptolanmis metin");
		
		b1 = new Button("Þifrele!");
		
		b1.addActionListener(this);
		
		t1 = new TextArea() ;
		t2 = new TextArea() ;
		
		pencere.add(l1);
		pencere.add(t1);
		pencere.add(b1);
		pencere.add(l2);
		pencere.add(t2);
		
		pencere.addWindowListener(this);
		pencere.setVisible(true);
		
		
	}
	
	public static void main( String args[])
	{
		jul_sezar p = new jul_sezar() ;
		p.pencereolustur(); 
	}
	
	public void actionPerformed(ActionEvent e )
	{
		String s = e.getActionCommand();
		if(s.equals("Þifrele!"))
		{
			String metin = t1.getText() ;
			kriptolama k = new kriptolama() ;
			t2.setText(k.kriptolama(metin));
			
		}
	}
	
	public void windowClosing(WindowEvent e )
	{
		System.exit(0);
		
	}
	public void windowOpened(WindowEvent e)
	{
		
	}
	public void windowClosed(WindowEvent e)
	{
		
	}
	public void windowIconified(WindowEvent e)
	{
		
	}
	public void windowDeiconified(WindowEvent e)
	{
		
	}
	public void windowActivated(WindowEvent e)
	{
		
	}
	public void windowDeactivated(WindowEvent e)
	{
		
	}
}
