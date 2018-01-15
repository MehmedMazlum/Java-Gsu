package hesap_makinesi;


import java.awt.*;
import java.applet.Applet;
import java.awt.event.* ;


public class hesap_hesap extends Applet implements ActionListener  {
 GridBagLayout a = new GridBagLayout() ;
 GridBagConstraints b = new GridBagConstraints() ;
  
 Button b1 ;
 Button b2 ;
 Button b3 ;
 Button b4 ;
 Button b5 ;
 Button b6 ;
 Button b7 ;
 Button b8 ;
 Button b9 ;
 Button b10 ;
 Button b11 ;
 Button b12 ;
 Button b13 ;
 Button b14 ;
 Button b15 ;
 Button b16 ;
 Button b17 ;
 TextField t ;
 Double first_number ;
 Double second_number ;
 int flag = 0 ;
 int flag1 = 0 ;
 Double result ;
 String okuma = "" ;
 String deneme ;
 String sayi_1 ;
 String sayi_2 ;
 Double sayi2 = 0.0 ;
 Double sayi1 = 0.0 ;
 int operator ;
 String sonuc_str ;
 String yazma = "" ;
 public void init() {
 
 setSize(500,300);
 setBackground(Color.yellow);
 this.setLayout(a) ;
 b.fill = GridBagConstraints.BOTH ;
 b.insets = new Insets(3,3,3,3) ;
 
 b.gridx = 0 ;
 b.gridy = 1 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b1 = new Button("C");
 a.setConstraints(b1,b);
 b1.addActionListener(this) ;
 add(b1);
 

 
 
 b.gridx = 0 ;
 b.gridy = 2 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b2 = new Button("7");
 a.setConstraints(b2,b);
 b2.addActionListener(this) ;
 add(b2);
 
 
 
 b.gridx = 0 ;
 b.gridy = 3 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b3 = new Button("4");
 a.setConstraints(b3,b);
 b3.addActionListener(this) ;
 add(b3);
  
 
 b.gridx = 0 ;
 b.gridy = 4 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b4 = new Button("1");
 a.setConstraints(b4,b);
 b4.addActionListener(this) ;
 add(b4);
 
 
 
 b.gridx = 0 ;
 b.gridy = 5 ;
 b.gridwidth = 2 ;
 b.gridheight = 1 ;
 b5 = new Button("0");
 a.setConstraints(b5,b);
 b5.addActionListener(this) ;
 add(b5);
 
 
 b.gridx = 1 ;
 b.gridy = 1 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b6 = new Button("/");
 a.setConstraints(b6,b);
 b6.addActionListener(this) ;
 add(b6);
 
 
 b.gridx = 2 ;
 b.gridy = 1 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b7 = new Button("*");
 a.setConstraints(b7,b);
 b7.addActionListener(this) ;
 add(b7);
 
 b.gridx = 3 ;
 b.gridy = 1 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b8 = new Button("-");
 a.setConstraints(b8,b);
 b8.addActionListener(this) ;
 add(b8);
 
 b.gridx = 1 ;
 b.gridy = 2 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b9 = new Button("8");
 a.setConstraints(b9,b);
 b9.addActionListener(this) ;
 add(b9);
 
 b.gridx = 2 ;
 b.gridy = 2 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b10 = new Button("9");
 a.setConstraints(b10,b);
 b10.addActionListener(this) ;
 add(b10);
 
 b.gridx = 3 ;
 b.gridy = 2 ;
 b.gridwidth = 1 ;
 b.gridheight = 2 ;
 b11 = new Button("+");
 a.setConstraints(b11,b);
 b11.addActionListener(this) ;
 add(b11);

 b.gridx = 1 ;
 b.gridy = 3 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b12 = new Button("5");
 a.setConstraints(b12,b);
 b12.addActionListener(this) ;
 add(b12);
 
 b.gridx = 2 ;
 b.gridy = 3 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b13 = new Button("6");
 a.setConstraints(b13,b);
 b13.addActionListener(this) ;
 add(b13);
 
 b.gridx = 3 ;
 b.gridy = 4 ;
 b.gridwidth = 1 ;
 b.gridheight = 2 ;
 b14 = new Button("=");
 a.setConstraints(b14,b);
 b14.addActionListener(this) ;
 add(b14);

 b.gridx = 1 ;
 b.gridy = 4 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b15 = new Button("2");
 a.setConstraints(b15,b);
 b15.addActionListener(this) ;
 add(b15);
 
 b.gridx = 2 ;
 b.gridy = 4 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b16 = new Button("3");
 a.setConstraints(b16,b);
 b16.addActionListener(this) ;
 add(b16);
 
 
 b.gridx = 2 ;
 b.gridy = 5 ;
 b.gridwidth = 1 ;
 b.gridheight = 1 ;
 b17 = new Button(",");
 a.setConstraints(b17,b);
 b17.addActionListener(this) ;
 add(b17);

 
 b.gridx = 0 ;
 b.gridy = 0 ;
 b.gridwidth = 4 ;
 b.gridheight = 1 ;
 t = new TextField("");
 a.setConstraints(t,b);
 add(t); 
 
 
 
 } 

 public void paint(Graphics g) {
  
  
 }
 
 public void actionPerformed(ActionEvent e)
  {
  String s = e.getActionCommand() ;
  
  if (s.equals("/"))
  {
	  okuma=t.getText();
	   yazma=okuma+"/";
	   sayi_1 = okuma ;
	   first_number = Double.valueOf(sayi_1) ;
	   t.setText(yazma);
	   okuma="";
	   yazma="";
	   operator = 4 ;
  }
   if (s.equals("C"))
  {
	   
	   first_number = 0.0 ;
	   second_number = 0.0 ;
	   result = 0.0 ;
	   t.setText("");
  
  }
   if (s.equals("*"))
  {
	   okuma=t.getText();
	   yazma=okuma+"*";
	   sayi_1 = okuma ;
	   first_number = Double.valueOf(sayi_1) ;
	   t.setText(yazma);
	   okuma="";
	   yazma="";
	   operator = 3 ;
  }
   if (s.equals("-"))
   {
	   okuma=t.getText();
	   yazma=okuma+"-";
	   sayi_1 = okuma ;
	   first_number = Double.valueOf(sayi_1) ;
	   t.setText(yazma);
	   okuma="";
	   yazma="";
	   operator = 2 ;
   }

   
   if (s.equals("+"))
  {
	 
	   	   
	   okuma=t.getText();
	   yazma=okuma+"+";
	   sayi_1 = okuma ;
	   first_number = Double.valueOf(sayi_1) ;
	   t.setText(yazma);
	   okuma="";
	   yazma="";
	   operator = 1 ;
	   
  }	   

								
								
					
   if (s.equals("="))
  {
	   	okuma = t.getText() ;

	   			if (operator == 1)
	   				{
	   				deneme=okuma.substring(sayi_1.length()+1,okuma.length());
	   				sayi_2=deneme;
	   				second_number=Double.valueOf(deneme);
	   				t.setText(yazma);
	   				okuma="";
	   				yazma=""; 
	   				result = first_number + second_number ;
	   				yazma = String.valueOf(result) ;
	   				t.setText(yazma );
	   				operator = 0 ;
	   				okuma = "" ;
	   				yazma = "" ;
	   				sayi_1 = "" ;
	   				sayi_2 = "" ;
	   				
	   				}
	   		
	   		if (operator == 2 )
	   		{
	   			deneme=okuma.substring(sayi_1.length()+1,okuma.length());
   				sayi_2=deneme;
   				second_number=Double.valueOf(deneme);
   				t.setText(yazma);
   				okuma="";
   				yazma=""; 
   				result = first_number - second_number ;
   				yazma = String.valueOf(result) ;
   				t.setText(yazma );
   				operator = 0 ;
   				okuma = "" ;
   				yazma = "" ;
   				sayi_1 = "" ;
   				sayi_2 = "" ;
	   		}
	   			
	   	if (operator == 3)
	   	{
	   			deneme=okuma.substring(sayi_1.length()+1,okuma.length());
				sayi_2=deneme;
				second_number=Double.valueOf(deneme);
				t.setText(yazma);
				okuma="";
				yazma=""; 
				result = first_number * second_number ;
				yazma = String.valueOf(result) ;
				t.setText(yazma );
				operator = 0 ;
				okuma = "" ;
				yazma = "" ;
				sayi_1 = "" ;
				sayi_2 = "" ;
	   	}
		if (operator == 4)
		{
	   	deneme=okuma.substring(sayi_1.length()+1,okuma.length());
			sayi_2=deneme;
			second_number=Double.valueOf(deneme);
			t.setText(yazma);
			okuma="";
			yazma=""; 
			result = first_number / second_number ;
			yazma = String.valueOf(result) ;
			t.setText(yazma );
			operator = 0 ;
			okuma = "" ;
			yazma = "" ;
			sayi_1 = "" ;
			sayi_2 = "" ;
		}	
	   	
	   	
  }
   if (s.equals(","))
  {
	   okuma=t.getText();
	   yazma=okuma+".";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
  }
   if (s.equals("0"))
   {
	   okuma=t.getText();
	   yazma=okuma+"0";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
   } 
   if (s.equals("1"))
  {
	   okuma=t.getText();
	   yazma=okuma+"1";
	   t.setText(yazma);
	   okuma="";
	   yazma="";  
  } 
   if (s.equals("2"))
  {
	   okuma=t.getText();
	   yazma=okuma+"2";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
  }
   if (s.equals("3"))
  {
	   okuma=t.getText();
	   yazma=okuma+"3";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
  }
   if (s.equals("4"))
  {
	   okuma=t.getText();
	   yazma=okuma+"4";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
  }
   if (s.equals("5"))
  {
	   okuma=t.getText();
	   yazma=okuma+"5";
	   t.setText(yazma);
	   okuma="";
	   yazma="";

  }
   if (s.equals("6"))
  {
	   okuma=t.getText();
	   yazma=okuma+"6";
	   t.setText(yazma);
	   okuma="";
	   yazma="";

	   
	   
  }
   if (s.equals("7"))
  {
	   okuma=t.getText();
	   yazma=okuma+"7";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
  }
   if (s.equals("8"))
  {
	   okuma=t.getText();
	   yazma=okuma+"8";
	   t.setText(yazma);
	   okuma="";
	   yazma="";
   }
   if (s.equals("9"))
  {
	   okuma=t.getText(); // labeldan alýnan string 
	   yazma=okuma+"9"; // buna sayiyi ilave ediyoruz 
	   t.setText(yazma); // sonra bu ilave ettigimizle beraber tekrar label a yazýyoruz
	   okuma=""; // okuma yý bosalt 
	   yazma=""; // yazmayi bosalt
	  
  }
 }
}
