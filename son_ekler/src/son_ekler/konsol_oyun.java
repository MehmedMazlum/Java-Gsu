package son_ekler;

import java.util.Scanner ;

public class konsol_oyun {
    
    public static void main(String[] args) {
     
     Scanner bilgi = new Scanner (System.in) ;
     int sayi = bilgi.nextInt() ;
      int oyun_sayisi = (int)(Math.random()*86) + 12 ;
     
     int b ;
     int c ;
     int count = 0 ;
     b = sayi/10 ;
     c = sayi%10 ;
    int d = oyun_sayisi/10 ;
    int e = oyun_sayisi%10 ;
      while ( d == e  )
     {
      
      System.out.println("Rakamlari ayni olan sayi giremezsiniz") ;
      oyun_sayisi = (int)(Math.random()*86) + 12 ;
     }
     
     System.out.println("aas"+oyun_sayisi); 
      
    while ( count != 2 )  
    {
     if ( b == c )
     { System.out.println("Rakamlari ayni olan sayi giremezsiniz. Yeniden sayi giriniz") ;
      sayi = bilgi.nextInt() ; 
     
     }
      else
     {
      if ( oyun_sayisi == sayi )
      { count = 2 ;
       System.out.println("+2");
       break ;
      }
      else if ( (b == e) && (c == d ) )
      { count = -2 ;
        System.out.println("-2");
       
      }
      else if ( (b == e) || (c == d) )
      { count = -1 ;
       System.out.println("-1");
       
      }
      else if (( b == d) || (c == e) )
       { count = 1 ;
       System.out.println("+1");
       
      }
      else if ( b!= d && b!=e && c!=d && c!=e)
      {
      
       count = 0 ;
       System.out.println("0");
        
      }
     break ;
     } 
    }    
     }         
   
}
