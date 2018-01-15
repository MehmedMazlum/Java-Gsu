package final_icin_uygulamalar;


/**
 * @(#)tersli_sayilar.java
 *
 *
 * @author 
 * @version 1.00 2014/5/31
 */

import java.util.*;

public class nejat_2 {
        
    /**
     * Creates a new instance of <code>tersli_sayilar</code>.
     */
    public nejat_2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     	int lengthNumber=0;//baslangic degeri atiyoruz y'ye
     	int FirstNumber=9;
     	
     	int LastNumber=1;
     	String str123 = "" ;
     	String tampon1="";
     	String tampon2="";
     	int BigNumber=0;
     	String tamponStr="";
     	String tersTamponStr="";
     	int tamponInt=0;
     	int tersTamponInt=0;
     	int farkInt=0;
     	String farkStr="";
     	String[] DigerTersliSayilar = new String[5];
     	DigerTersliSayilar[0]="0";
     	DigerTersliSayilar[1]="2";
     	DigerTersliSayilar[2]="5";
     	DigerTersliSayilar[3]="6";
     	DigerTersliSayilar[4]="8";
     	
     	
     	
     	Scanner sc = new Scanner(System.in);
		System.out.println("Basamak sayisi giriniz :");
		String str = sc.nextLine();
		System.out.println("Aranilan en buyuk tersli sayi " + str + "basamakli olacaktir");
		try{
			lengthNumber = Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("Error reason: "+e);
		}
	int dizi[] = new int [lengthNumber];	
      	if(lengthNumber == 0 || lengthNumber>7){// yani kullanici harf yerine sayi girdi veya kullanici 7 basamakli sayidan yuksek basamak girdi
      		System.out.println("Hata");
      	}
      	else if(lengthNumber == 1){
      		System.out.println("1 basamakli ve aranilan ozellikteki en buyuk tersli sayi 3'tur"); // 6 veya 9
      	}
      	else if(lengthNumber == 2){
      		System.out.println("2 basamakli ve aranilan ozellikteki en buyuk tersli sayi 81'dir"); // 6 veya 9
      	}
      	else{// olasiliklar: 1 2 5 6 8	
      			//5 ic ice for dongusu kullanmadan once
      			for(int a=0;a<DigerTersliSayilar.length;a++){
      				for (int b=0;b<DigerTersliSayilar.length && b != a;b++){
      					for(int c=0;c<DigerTersliSayilar.length && c != a && c != b;c++){
      						for(int d=0;d<DigerTersliSayilar.length && d != a && d != b && d != c;d++){
      							for(int e=0;e<DigerTersliSayilar.length;e++){
      							//begin	
      								tampon1 = DigerTersliSayilar[a]+DigerTersliSayilar[b]+DigerTersliSayilar[c]+DigerTersliSayilar[d]+DigerTersliSayilar[e];
  									tamponStr = FirstNumber + tampon1.substring(0,lengthNumber-2) + LastNumber;
  									tamponInt = Integer.parseInt(tamponStr);
  					
  									tampon2 = DigerTersliSayilar[e]+DigerTersliSayilar[d]+DigerTersliSayilar[c]+DigerTersliSayilar[b]+DigerTersliSayilar[a];
  									tersTamponStr = LastNumber + tampon2.substring(tampon2.length()-(lengthNumber-2),tampon2.length()) + FirstNumber;
  									
  									for(int h = 0 ; h < tersTamponStr.length() ; h++)
  									{
  										dizi[h] = Integer.parseInt(tersTamponStr.substring(h,h+1)) ; 
  									}
  				
  										for (int g = 0; g < tersTamponStr.length(); g++) {
  											if (dizi[g] == 6) {
  												dizi[g] = 9;
  											} else if (dizi[g] == 9) {
  												dizi[g] = 6;
  											}
  										}
  										int ara_toplam = 0 ;
  									int h = 1000 ;
  									int k = 0 ;
  									while(k <= 3 && h >= 1)
  									{
  										ara_toplam = h*dizi[k] ; 
  										tersTamponInt = ara_toplam + tersTamponInt ;
  										ara_toplam =  0 ;
  										k++ ;
  										h = h/10 ;
  										
  									}
					//System.out.println(+tersTamponInt);
  									farkInt = Math.abs(tersTamponInt - tamponInt);
  									farkStr = Integer.toString(farkInt);
  									if(!farkStr.contains("3") &&  !farkStr.contains("4") && !farkStr.contains("7")){
  										BigNumber = tamponInt; 
  									}
      							
      							}
      						}
      					}
      				}
      			}
      			//5 ic ice for dongusu kullandiktan sonra
      			System.out.println(+tamponInt);
      			System.out.println(+tersTamponInt);
      			System.out.println(+farkInt);
      			for(int g = 0 ; g<tersTamponStr.length() ; g++)
					{
      					System.out.print(dizi[g]);
					}
      			System.out.println() ;
      			System.out.println("En buyuk "+ lengthNumber +" tersli sayi : " + BigNumber);
      			
      	
      	}
    }
}
