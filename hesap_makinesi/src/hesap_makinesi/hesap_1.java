package hesap_makinesi;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
//GridBagLayout �zerine �rnek bir program

public class hesap_1 extends Applet implements ActionListener {

String sayi_1="",sayi_2="";
Double sayi1=0.0d,sayi2=0.0d,sonuc=0.0d;
String okuma="",yazma="",tampon="",tampon2="",deneme="",sonuc_str="";
int sayac=0,i=0;
Boolean ilk_operator_kullan�ld�=false;
Boolean ikinci_operator_kullan�ld�=false;
Boolean ilk_operator_eksi_ise=false,flag1=false,flag2=false,nokta_kullan�ld�=false,nokta_kullan�ld�2=false;
int operator=0,k=0;


public void actionPerformed(ActionEvent e){	// repaint();   KOYCAK MIYIZ???????????????????


String s=e.getActionCommand();


if(s.equals("5")){
okuma=t.getText();
yazma=okuma+"5";
t.setText(yazma);
okuma="";
yazma="";
}
if(s.equals("6")){
okuma=t.getText();
yazma=okuma+"6";
t.setText(yazma);
okuma="";
yazma="";
}

if(s.equals("e�ittir")){
	okuma=t.getText();

 if(ilk_operator_kullan�ld�==true){
			deneme=okuma.substring(sayi_1.length()+1,okuma.length());
		

				sayi_2=deneme;
				sayi2=Double.valueOf(deneme);
				ikinci_operator_kullan�ld�=true;
						if(operator==1){//toplama
						sonuc=sayi1+sayi2;
						sonuc_str=String.valueOf(sonuc);
						flag1=true;
						t.setText("="+sonuc_str);
						
						}
				}
}

if(s.equals("art�")){							// + i�areti
okuma=t.getText();

			if(ilk_operator_kullan�ld�==false){
				yazma=okuma+"+";
		t.setText(yazma);
		sayi_1=okuma;
sayi1=Double.valueOf(okuma);
ilk_operator_kullan�ld�=true;
		operator=1;
				}

}
}
}