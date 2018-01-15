package final_icin_uygulamalar;


import java.util.*;

public class tersli_sayilar {
        
    /**
     * Creates a new instance of <code>tersli_sayilar</code>.
     */
    public tersli_sayilar() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     	int lengthNumber=0;//baslangic degeri atiyoruz y'ye
     	int FirstNumber=9;
     	int LastNumber=1;
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
  									tersTamponInt = Integer.parseInt(tersTamponStr);
									
  									farkInt = Math.abs(tersTamponInt - tamponInt);
  									farkStr = Integer.toString(farkInt);
  									if(!farkStr.contains("3") &&  !farkStr.contains("4") && !farkStr.contains("7")){
  										BigNumber = tamponInt; 
  									}
      							//end	
      							}
      						}
      					}
      				}
      			}
      			//5 ic ice for dongusu kullandiktan sonra
      			System.out.println("En buyuk "+ lengthNumber +" tersli sayi : " + BigNumber);
      			System.out.println(tamponStr);
      			System.out.println(tersTamponStr);
      	}
    }
}