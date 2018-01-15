package son_ekler;

import java.util.Scanner ; 

public class roma {
   
	public class ALICAN_3_ROMA {

		  public static String donustur ( int m ) 
		  {
		  
		 String a = "I" ;
		 String b = "V" ;
		 String c = "X" ;
		 String d = "L" ;
		  String e = "C" ;
		 String f = "D" ;
		 String g = "M" ;
		 int k ;
		 int i ;

		 String s = "\0" ; 

		while ( m != 0 && m<4000)
		{
		 while ( m >= 1000 )
		  {
		  m = m - 1000 ;
		  s = s + g ;
		 }
		 while( m < 1000 && m >= 500 )
		 {
		  m = m - 500 ;
		  s = s + f ;
		 }
		 while ( m < 500 && m >= 100 )
		 {
		  m = m - 100 ;
		  s = s + e ;
		  }
		 while ( m < 100 && m >= 50)
		 {
		  m = m - 50 ;
		  s = s + d ;
		 }
		 while ( m < 50 && m >= 10 )
		 {
		  m = m - 10 ;
		  s = s + c ;
		 }
		 while ( m < 10 && m >= 5 )
		  {
		  m = m -5 ;
		  s = s + b ;
		 }
		 while ( m < 5 && m >= 1 )
		 {
		  m = m -1 ;
		  s = s + a ;
		 }
		}
		return s ;
		  }

		}

	
    public static void main(String[] args) {
     
     // TODO, add your application code
     Scanner bilgi = new Scanner (System.in) ;
      int a = bilgi.nextInt() ;
     String k = "\0" ;
 
      System.out.println("Okunan sayi=" +ALICAN_3_ROMA.donustur(a));
     
     
    }
}
  
