package application_sifra;

import java.awt.* ;
import java.awt.event.* ;


	class bosluk
	{
		static String boslukat(String metin)
		{
			String metin2 = "" ;
			int n = metin.length() ;
			for(int i =0 ; i<n ;i++)
				if(!(metin.substring(i,i+1)).equals(" "))
					metin2 = metin2 + metin.substring(i,i+1);
				return metin2 ;
			}
	}
		
	
class kriptolama
{
	String kriptolama(String metin)
	{
		int n , k = 0 , m,p ;
		double r ;
		String kripto ="" , metin2 = "" ;
		metin = metin.toLowerCase();
		metin2 = bosluk.boslukat(metin);
		
		n = metin.length() ;
		r = Math.sqrt(n) ;
		m = (int)r ;
		if(m*m != n)
			m++ ;
		int m2 = m ;
		while(m>0)
		{
			p = k ;
			do 
			{
				kripto = kripto + metin2.substring(p,p+1);
				p = p+m2 ;
				
			}while(p<n) ;
			k++ ;
			m-- ;
		}
		return kripto ;
		
	}
}

	public class hocanin_cozum implements WindowListener, ActionListener
	{
		TextArea t1,t2 ;
		Button b1 ;
		
		public void pencereolustur()
		{
			Frame pencere = new Frame("Jul Sezar'ýn Kutu þifreleme yöntemi");
			pencere.setLocation(400,250);
			pencere.setBackground(Color.yellow);
			pencere.setSize(700,500);
			Rectangle r = new Rectangle(700,500);
			pencere.setMaximizedBounds(r);
			pencere.setLayout(new FlowLayout(FlowLayout.LEFT,15,30));
			
			Label l1 = new Label("Orijinal Metin :");
			Label l2 = new Label("Kriptolanmis metin");
			
			b1 = new Button("Þifrele");
			b1.addActionListener(this);
			
			t1 = new TextArea() ;
			t2 = new TextArea() ;
			pencere.add(l1);
			pencere.add(t1);
			pencere.add(b1 );
			pencere.add(l2);
			pencere.add(t2) ;
			
			pencere.addWindowListener(this);
			pencere.setVisible(true);
			
		}
		
		public static void main(String args[])
		{
			hocanin_cozum p = new hocanin_cozum() ;
			p.pencereolustur();
		}
		
		public void actionPerformed(ActionEvent e )
		{
			String s = e.getActionCommand();
			if(s.equals("Þifrele"))
			{
				String metin = t1.getText();
				kriptolama k = new kriptolama();
				t2.setText(k.kriptolama(metin));
				
			}
			
		}
		
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		public void windowOpened(WindowEvent e){
			
		}
		public void windowClosed(WindowEvent e){
			
		}
		public void windowIconified(WindowEvent e){
			
		}
		public void windowDeiconified(WindowEvent e)
		{
			
		}
		public void windowActivated(WindowEvent e )
		{
			
		}
		public void windowDeactivated(WindowEvent e )
		{
			
		}
	}

