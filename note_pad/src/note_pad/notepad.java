package note_pad ;

import java.awt.* ;
import java.awt.event.* ;
import java.awt.print.*;
import java.io.* ;
import java.util.Scanner;


public class notepad implements WindowListener,ActionListener,Printable {
    
Frame a ;
Panel b ;
Button yeni ;
Button yukle ;
Button kaydet ;
Button yazdir ; 
Label etiket ;
TextArea t1 ;
TextField t2 ;
FileReader k ;
BufferedReader p ;
String mesaj ;
String mesaj_2 ;
String mesaj_3 ;
String str ;
int satýr_x=70,satýr_y=-180;
GridBagLayout m = new GridBagLayout() ;
GridBagConstraints n = new GridBagConstraints() ;


	public int print(Graphics g, PageFormat pf, int sayfa) {
		if (sayfa != 0)
			return NO_SUCH_PAGE;
		mesaj = t2.getText();
		File file = new File(mesaj);
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line5 = scanner.nextLine();
				g.drawString("" + line5 + "\n", satýr_x, satýr_y);
				satýr_y = satýr_y + 10;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return PAGE_EXISTS;
	}

public notepad(String title)
{
 a = new Frame(title);
 b = new Panel();
 yeni = new Button("NEW");
 yukle = new Button("LOAD");
 kaydet = new Button("SAVE");
 yazdir = new Button("PRINT");
 etiket = new Label("Bu butona týklayabilirsiniz !");


} 

public void olustur()
{


 a.setSize(600,600) ;
 a.setBackground(Color.white);
 a.setLocation(500,500);
 b.setBackground(Color.yellow);
 Rectangle r = new Rectangle(700,500) ;
 a.setMaximizedBounds(r);
 a.add(b);
 b.setLayout(m);
 n.fill = GridBagConstraints.BOTH;
 n.insets=new Insets(3,3,3,3);
 
 n.gridx = 0 ;
 n.gridy = 0 ;
 n.gridwidth = 4 ;
 n.gridheight = 1 ;
 t1 = new TextArea(20,40);
 m.setConstraints(t1,n);
 b.add(t1); 

 n.gridx = 0 ;
 n.gridy = 1 ;
 n.gridwidth = 4 ;
 n.gridheight = 1 ;
 t2 = new TextField(20);
 t2.addActionListener(this) ;
 m.setConstraints(t2,n);
 b.add(t2);
 
 n.gridx = 0 ;
 n.gridy = 2 ;
 n.gridwidth = 1 ;
 n.gridheight = 1 ;
 m.setConstraints(yeni,n);
 yeni.addActionListener(this) ;
 b.add(yeni); 

 n.gridx = 1 ;
 n.gridy = 2 ;
 n.gridwidth = 1 ;
 n.gridheight = 1 ;
 m.setConstraints(yukle,n);
 yukle.addActionListener(this) ;
 b.add(yukle);
 
 
 n.gridx = 2 ;
 n.gridy = 2 ;
 n.gridwidth = 1 ;
 n.gridheight = 1 ;
 m.setConstraints(kaydet,n);
 kaydet.addActionListener(this) ;
 b.add(kaydet); 
 
 n.gridx = 3 ;
 n.gridy = 2 ;
 n.gridwidth = 1 ;
 n.gridheight = 1 ;
 m.setConstraints(yazdir,n);
 yazdir.addActionListener(this) ;
 b.add(yazdir); 
 
 a.pack() ;
 a.addWindowListener(this) ;
 a.setVisible(true);
 
 

}
    public static void main(String[] args) {
     
     notepad pencere = new notepad("Merhaba");
     pencere.olustur() ;

    }
    
    

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("LOAD")) {
			try {
				String mesaj_1 = t2.getText();

				k = new FileReader(mesaj_1);
				p = new BufferedReader(k);
				String metin;
				while ((metin = p.readLine()) != null) {
					t1.append(metin + "\n");// textArea'ya yazýyo bütün satýrlarý 
											
				}

			} catch (Exception y) {
				t1.setText("bir hata var");
			}
		}
		
		if(s.equals("PRINT"))
		{
			try{
	   			PrinterJob islem = PrinterJob.getPrinterJob();
	   			islem.setPrintable((notepad) this);// bu kullanýmý--> "(notepad_printable) this" , internetten buldum.
	   			if(islem.printDialog()) 
	   				islem.print();
	   			}
	   			catch(Exception exen){
	   				System.out.println("Beklenmeyen bir sorun oluþtu!");
	   			}


	}
		if(s.equals("SAVE"))
		{
			mesaj_3=t1.getText();
		mesaj_2 =t2.getText();
		try{
			FileOutputStream a_out=new FileOutputStream(mesaj_2);
			PrintWriter b_w= new PrintWriter(a_out);
			b_w.println(mesaj_3);
			b_w.close();
		}
		catch(Exception u)
		{
			t1.setText("Bölye bir dosya yok!");
		}
		}
           
		if (s.equals("NEW")) {
			str = t2.getText();

			try {
				File yeni_dosya = new File(str);
				if (!yeni_dosya.exists())
					yeni_dosya.createNewFile();
				else
					t1.setText("Boyle dosya zaten var");

			} catch (Exception u) {
				t1.setText("Beklenmedik Hata!");
			}

		}
	}
    public void windowClosing(WindowEvent e)
     {
     System.exit(0);
    }
    public void windowClosed(WindowEvent e)
    {
     
    }
    public void windowActivated(WindowEvent e)
    {
    }
     public void windowDeactivated(WindowEvent e)
     {
    }
     public void windowIconified(WindowEvent e)
    {
    }
     public void windowDeiconified(WindowEvent e)
    {
    }
     public void windowOpened(WindowEvent e)
    {
    }

     
    
}
