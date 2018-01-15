package final_icin_uygulamalar;

import java.util.*;

public class nejatin_ilk_sorusu {
        
    /**
     * Creates a new instance of <code>tersli_sayilar</code>.
     */
    public nejatin_ilk_sorusu() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     	int lengthNumber=0;//baslangic degeri atiyoruz y'ye
     	String tampon1="";
     	String tampon2="";
     	int BigNumber=0;
     	String tamponStr = "" ;
     	//String tersTamponStr="";
     	int tamponInt=0;
     	int tersTamponInt=0;
     	int farkInt=0;
     	String farkStr="";
     	String[] DigerTersliSayilar = new String[7];
     	DigerTersliSayilar[0]="0";
     	DigerTersliSayilar[1]="1";
     	DigerTersliSayilar[2]="2";
     	DigerTersliSayilar[3]="5";
     	DigerTersliSayilar[4]="6";
     	DigerTersliSayilar[5]="8";
     	DigerTersliSayilar[6]="9";
     	
     		
     	Scanner sc = new Scanner(System.in);
		System.out.println("Basamak sayisi giriniz :");
		String str = sc.nextLine();
		System.out.println("Aranilan en buyuk tersli sayi " + str + " basamakli olacaktir");
		try{
			lengthNumber = Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("Error reason: "+e);
		}
		String tersTamponStr[] = new String[lengthNumber] ;
      	if(lengthNumber == 0 || lengthNumber>7){// yani kullanici harf yerine sayi girdi veya kullanici 7 basamakli sayidan yuksek basamak girdi
      		System.out.println("Hata");
      	}
      	else if(lengthNumber == 1){
      		System.out.println("1 basamakli ve aranilan ozellikteki en buyuk tersli sayi 9'tur"); // 6 veya 9
      	}
      	else if(lengthNumber == 2){
      		System.out.println("2 basamakli ve aranilan ozellikteki en buyuk tersli sayi 98'dir"); // 6 veya 9
      	}
      	else if (lengthNumber == 3 ){
      		System.out.println("3 basamakli ve aranilan ozellikteki en buyuk tersli sayi 982'dir");
      	}
      	else{// olasiliklar: 1 2 5 6 8	
      			//5 ic ice for dongusu kullanmadan once
      			for(int a=0;a<DigerTersliSayilar.length;a++){
      				for (int b=0;b<DigerTersliSayilar.length && b != a;b++){
      					for(int c=0;c<DigerTersliSayilar.length && c != a && c != b;c++){
      						for(int d=0;d<DigerTersliSayilar.length && d != a && d != b && d != c;d++){
      							for(int e=0;e<DigerTersliSayilar.length && e != a && e != b && e != c && e != d ;e++){
      								for(int f=0;f<DigerTersliSayilar.length && f != a && f != b && f != c && f != d && f != e ;f++){
      									for(int g=0;g<DigerTersliSayilar.length ;g++){
      								
      								
      								tampon1 = DigerTersliSayilar[a]+DigerTersliSayilar[b]+DigerTersliSayilar[c]+DigerTersliSayilar[d]+DigerTersliSayilar[e]+DigerTersliSayilar[f]+DigerTersliSayilar[g];
  									tamponStr =  tampon1.substring(0,lengthNumber) ;
  									tamponInt = Integer.parseInt(tamponStr);
  									
  									//tampon2 = DigerTersliSayilar[g]+DigerTersliSayilar[f]+DigerTersliSayilar[e]+DigerTersliSayilar[d]+DigerTersliSayilar[c]+DigerTersliSayilar[b]+DigerTersliSayilar[a];
  									int i = 0 ;
  									int k = lengthNumber ;
  									while ( k >= 1 )
  									{
  									
  										 if(tampon1.substring(k-1,k) == "6")
   										{
											tersTamponStr[i] = "9";
										i++ ;
  										k-- ;
										}
  										 else if(tampon1.substring(k-1,k) == "9")
    										{
 											tersTamponStr[i] = "6";
 											i++ ;
 	  										k-- ;
 										}
  										// else 
  										// {
  										//	tersTamponStr[i] =  tampon1.substring(k-1,k) ;
  										//	i++ ;
  	  									//	k-- ;
  										// }
  										 //tersTamponStr[i] =  tampon1.substring(k-1,k) ;
  															
  										
  									}
  									//for(i=0 ; i<tersTamponStr.length ; i++)
  									//{
  									//	if(tersTamponStr[i] == "6")
  										//{
  											//tersTamponStr[i] = "9";
  										
  									//	}
  									//	 if (tersTamponStr[i] == "9")
  										//	tersTamponStr[i] = "6" ;
  									//}
  									//tersTamponStr =  tampon2.substring(0,lengthNumber) ;
  									//int n = 1000 ;
  									//for(i=0 ; i < 4 ; i++ )
  									//{
  										//tersTamponInt = (Integer.parseInt(tersTamponStr[0]))*n*4  ;
  										//n = n / 10 ;
  									//}
  										
      									//tersTamponInt = Integer.parseInt(tersTamponStr);
									
  									farkInt = Math.abs(tamponInt - tersTamponInt);
  									farkStr = Integer.toString(farkInt);
  									for(int y = 0 ; y < farkStr.length() ; y++ )
  									{	if(farkStr.substring(y) != "3" && farkStr.substring(y) != "4" && farkStr.substring(y) != "7" ){
  										BigNumber = tamponInt; 
  									
  									}
  									}
      							}
      						}
      					}
      				}
      			}
      	}
    }
      			//5 ic ice for dongusu kullandiktan sonra

}      	
System.out.println("En buyuk "+ lengthNumber +" tersli sayi : " + BigNumber);
System.out.println(+farkInt);
System.out.println(+tamponInt);
for(int i =0 ; i< lengthNumber ; i++)
System.out.print(tersTamponStr[i]);
System.out.println();
System.out.print(tersTamponInt);
}
}