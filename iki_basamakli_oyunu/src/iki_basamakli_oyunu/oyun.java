package iki_basamakli_oyunu;
/* Bu kod 05.03.2014 tarihli iki basamakli oyun kodudur */

import java.util.Scanner ;

public class oyun {

    
    public static void main(String[] args) {
     
     Scanner bilgi = new Scanner (System.in) ;
    
     int oyun_sayisi = (int)(Math.random()*86) + 12 ;
     System.out.println(+oyun_sayisi); 
     int sayi = 0 ; 
     int count = 0 ;
     
     while ( (oyun_sayisi/10) == (oyun_sayisi%10)  )
     	{
      
      System.out.println("Rakamlari ayni olan sayi giremezsiniz") ;
      oyun_sayisi = (int)(Math.random()*86) + 12 ;
     	}
 System.out.println("yeni cekilen :" + oyun_sayisi) ;   
  do {
	  sayi = bilgi.nextInt() ;
	  if( (sayi/10) != (sayi%10) )
	  {
		 if ( oyun_sayisi == sayi )
		 {
			 count = 2 ;
		 System.out.println("+2");
		 }
		 else if ( (sayi/10 == oyun_sayisi%10) && ( sayi%10 == oyun_sayisi/10 ))
		 {
			 count = -2 ;
			 System.out.println("-2");
		 }
		 else if ((sayi/10 == oyun_sayisi%10) || ( sayi%10 == oyun_sayisi/10 ))
		 {
			 count = -1 ;
			 System.out.println("-1");
		 }
		 else if ((sayi/10 == oyun_sayisi/10) || (sayi%10 == oyun_sayisi%10))
		 {
			 count = 1 ;
			 System.out.println("+1");
		 }
		 else if ((sayi/10 != oyun_sayisi/10) && (sayi/10 != oyun_sayisi%10) 
				 && (sayi%10 != oyun_sayisi/10) && (sayi%10 != oyun_sayisi%10))
		 {
			 count = 0 ;
			 System.out.println("0");
			 
		 }
	  }
	  else
		  System.out.println("Rakamlari ayni olan bir sayi giremezsiniz. Yeni bir sayi giriniz") ;
  
    } while( count != 2) ;
    bilgi.close(); 
    }
}
     
     
     
        

