package final_icin_uygulamalar;

/* geçen senenin finalinin 3.sorusu */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.print.*;
//import java.io.FileNotFoundException;

class bosluk {
	static String boslukat(String metin) {
		String metin2 = "";
		int n = metin.length();
		for (int i = 0; i < n; i++)
			if (!(metin.substring(i, i + 1)).equals(" "))
				metin2 = metin2 + metin.substring(i, i + 1);
		return metin2;
	}
}

class kriptolama {
	String kriptolama(String metin3) {
		int sayi;
		int i;
		String alfabe = "abcçdefgðhýijklmnoöprsþtuüvyz";

		String metin = "";
		metin3 = metin3.toLowerCase();
		metin = bosluk.boslukat(metin3);
		char yeni_sifre[] = new char[metin.length()];
		char yep_yeni[] = new char[2 * metin.length()];
		String kripto = "";
		for (i = 0; i < yeni_sifre.length; i++) {
			yeni_sifre[i] = '0';
		}
		i = 0;
		while (i < yeni_sifre.length) {
			sayi = (int) (Math.random() * 29) + 0;

			if (yeni_sifre[i] == '0') {
				yeni_sifre[i] = alfabe.charAt(sayi);
				i++;
			}

		}
		int j = 0;
		int k = 0;
		i = 0;
		while (i < yep_yeni.length) {
			while ((j < yeni_sifre.length) && (k < metin.length())) {
				if (i % 2 == 0) {
					yep_yeni[i] = metin.charAt(k);
					k++;
					i++;
				}

				if (i % 2 != 0) {
					yep_yeni[i] = yeni_sifre[j];
					j++;
					i++;
				}
			}
		}
		int t = yep_yeni.length;
		int n = yep_yeni.length / 4;
		if (n * 4 < t)
			n = n + 1;

		int bk = n * 2;
		int tk = n;
		int h = 1;
		int v = 0;
		while (v != 4) {

			kripto = kripto + String.valueOf(yep_yeni[bk]);
			bk++;
			n--;

			if (n == 0 && (h == 1)) {
				v = v + 1;
				h = h + 1;
				n = tk;

				bk = 0;
			}
			if (n == 0 && h == 2) {
				v = v + 1;
				h = h + 1;
				bk = tk * 3;
				n = t - bk;

			}
			if (n == 0 && h == 3) {
				v = v + 1;
				h = h + 1;
				n = tk;
				bk = tk;
			}
			if (n == 0 && h == 4)
				v = v + 1;
		}
		return kripto;
	}
}

public class uykusuza_masallar implements WindowListener, ActionListener,
		Printable {

	GridBagLayout a = new GridBagLayout();
	GridBagConstraints b = new GridBagConstraints();
	Frame pencere;
	Panel panel;
	Button dugme;
	TextArea c;

	public uykusuza_masallar(String title) {
		pencere = new Frame(title);
		panel = new Panel();

	}

	public void pencereolustur() {
		panel.setLayout(a);
		b.fill = GridBagConstraints.BOTH;
		b.insets = new Insets(3, 3, 3, 3);

		b.gridx = 0;
		b.gridy = 0;
		b.gridwidth = 5;
		b.gridheight = 1;
		c = new TextArea(15, 35);
		a.setConstraints(c, b);
		panel.add(c);

		b.gridx = 0;
		b.gridy = 1;
		b.gridwidth = 5;
		b.gridheight = 1;
		dugme = new Button("TIKLA");
		a.setConstraints(dugme, b);
		dugme.addActionListener(this);
		panel.add(dugme);

		pencere.setLocation(400, 250);
		pencere.setBackground(Color.yellow);
		pencere.setSize(500, 500);
		Rectangle r = new Rectangle(500, 500);
		pencere.setMaximizedBounds(r);
		pencere.add(panel);
		pencere.pack();
		pencere.addWindowListener(this);
		pencere.setVisible(true);

	}

	public static void main(String args[]) {
		uykusuza_masallar p = new uykusuza_masallar("UYGULAMA");
		p.pencereolustur();
	}

	public int print(Graphics g, PageFormat pf, int sayfa) {
		if (sayfa != 0) {
			return NO_SUCH_PAGE;
		}
		return PAGE_EXISTS;
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("TIKLA")) {
			String adres = "C:\\Intel\\Logs\\simsor.txt";
			String metin1 = c.getText();
			try {
				//
				FileReader gf = new FileReader(adres) ;
				BufferedReader gc = new BufferedReader(gf) ;
				String metin = gc.readLine() ;
				String sa = "" ;
				while(metin != null)
				{
					sa = sa + metin ;
					metin = gc.readLine() ;
					
					
				}
				FileOutputStream gh = new FileOutputStream(adres);
				PrintWriter y = new PrintWriter(gh);
				kriptolama k = new kriptolama();
				String metin_3 = sa + k.kriptolama(metin1)  ;
				y.println( metin_3);
			
				gc.close();
				y.close();
				 
			} catch (IOException ex) {

			}

		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

}
