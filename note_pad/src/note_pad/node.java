package note_pad;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.print.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


//Basit bir Window Uygulamas�


//BufferReader ile ilgili internetten faydalanmaya �al��t���m siteler: Ama bu a�a��daki �� siteden bi�ey kullanmad�m san�r�m.
//http://alvinalexander.com/java/java-bufferedreader-readline-string-examples
//http://stackoverflow.com/questions/6791282/java-create-strings-from-buffered-reader-and-compare-strings
//http://stackoverflow.com/questions/8324388/passing-parameters-to-the-print-method-java


public class node implements WindowListener, ActionListener,Printable
{
    Frame a_fr;
    GridBagLayout a=new GridBagLayout();
GridBagConstraints b=new GridBagConstraints();
    
    TextArea input;
    TextField c;
    Panel p;
    Button b1,b2,b3,b4;
     String path,metin,line,line2,line5,metin3="",print_metin="";
     int i=0,sat�r_x=70,sat�r_y=-180;
   
    public node(String title){
        
        a_fr=new Frame(title);
        p=new Panel();
        }  


		//Bu siteden Scanner s�n�f�n�n sat�r sat�r okuma's�n�n kullan�m�na bakt�m ve uyfulad�m kod �zerinde.
		//http://www.kodejava.org/examples/241.html	
		public int print (Graphics g, PageFormat pf, int sayfa){
			if(sayfa!=0)return NO_SUCH_PAGE;
			path=c.getText();
			File file = new File(path);
				try{
			Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line5 = scanner.nextLine();
                g.drawString(""+line5+"\n",sat�r_x,sat�r_y);
                sat�r_y=sat�r_y+10;
            		}
				}catch (FileNotFoundException e) {
            e.printStackTrace();
        }	
			return PAGE_EXISTS;
			} 


        public void olustur()
        {    
             	a_fr.setSize(500,500);
            a_fr.setBackground(Color.white);
                        a_fr.setLocation(350,200);  




            // p.add(etiket1);
            // p.add(etiket2);
            
    
         p.setLayout(a);
b.fill=GridBagConstraints.BOTH;
b.insets=new Insets(3,3,3,3);




b.gridx=0;
b.gridy=0;
b.gridwidth=4;
b.gridheight=1;
input=new TextArea(20,40);
a.setConstraints(input,b);
p.add(input); // textarea


b.gridx=0;
b.gridy=1;
b.gridwidth=4;
b.gridheight=1;
c=new TextField(10);
a.setConstraints(c,b);
p.add(c); // textfield


b.gridx=0;
b.gridy=2;
b.gridwidth=1;
b.gridheight=1;
b1=new Button("NEW");
a.setConstraints(b1,b);
b1.addActionListener(this);
p.add(b1);


b.gridx=1;
b.gridy=2;
b.gridwidth=1;
b.gridheight=1;
b2=new Button("LOAD");
a.setConstraints(b2,b);
b2.addActionListener(this);
p.add(b2);


b.gridx=2;
b.gridy=2;
b.gridwidth=1;
b.gridheight=1;
b3=new Button("SAVE");
a.setConstraints(b3,b);
b3.addActionListener(this);
p.add(b3);


b.gridx=3;
b.gridy=2;
b.gridwidth=1;
b.gridheight=1;
b4=new Button("PRINT");
a.setConstraints(b4,b);
b4.addActionListener(this);
p.add(b4);


		a_fr.add(p);
            a_fr.pack();
            a_fr.addWindowListener(this);
            a_fr.setVisible(true); 


            }
            
             
    public static void main(String args[])
    {
       node pencere=new node("NOTEPAD");
       pencere.olustur();
        }


public void actionPerformed(ActionEvent e){
        String s=e.getActionCommand();
            if(s.equals("NEW")){
                	input.setText("");
		path=c.getText();


		try
		{
			File a_f=new File(path);
				if(!a_f.exists())
					a_f.createNewFile();
				else
						input.setText("Boyle dosya zaten var");




		}
		catch(Exception u)
		{
			input.setText("Beklenmedik Hata!");
		}


                }
                
                
//C:\Users\ok\Desktop\Staj_bakt�g�m_�irketler.txt
                 if(s.equals("LOAD")) {
                 	input.setText("");
			path=c.getText();
		try
		{
			File file = new File(path);
BufferedReader rd = new BufferedReader(new FileReader(file));
while ((line = rd.readLine()) != null)
    input.append(line + "\n");// textArea'ya yaz�yo b�t�ne sat�rlar�
rd.close();
			}
		catch(Exception u)
			{
					input.setText("Beklenmedik bir problem olu�tu.");	
			}  
                 }
                 
                 
                   if(s.equals("SAVE")){
			metin3=input.getText();
		path=c.getText();
		try{
			FileOutputStream a_out=new FileOutputStream(path);
			PrintWriter b_w= new PrintWriter(a_out);
			b_w.println(metin3);
			b_w.close();
		}
		catch(Exception u)
		{
			input.setText("B�lye bir dosya yok!");
		}
                     }
                
               if(s.equals("PRINT")){
			try{
			PrinterJob islem=PrinterJob.getPrinterJob();
			islem.setPrintable((node) this);// bu kullan�m�--> "(notepad_printable) this" , internetten buldum.
			if(islem.printDialog()) islem.print();
			}catch(Exception exen){
				System.out.println("Beklenmeyen bir sorun olu�tu!");
			}


                  }
        }


        public void windowClosing(WindowEvent e)
            {
           System.exit(0);
            }
            
            public void windowOpened(WindowEvent e){}
                public void windowClosed(WindowEvent e){}
                    public void windowIconified(WindowEvent e){}
                        public void windowDeiconified(WindowEvent e){}
                            public void windowActivated(WindowEvent e){}
                                    public void windowDeactivated(WindowEvent e){}


    }
