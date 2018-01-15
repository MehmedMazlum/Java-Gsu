package quizzler_1;
// uc sayinin sayinin ebobu 
import java.util.Scanner ;

public class ebob_1 {

	public static void main(String args[])
	{
		int n ;
		int k ;
		int l ;
		int d = 0  ;
		int c = 0 ;
		int s = 0 ;
		Scanner bilgi = new Scanner (System.in) ;
		System.out.println("bir sayi giriniz lutfen");
		n = bilgi.nextInt();
		System.out.println("bir baska sayi giriniz") ;
		k = bilgi.nextInt();
		System.out.println("bambaska bir sayi daha giriniz");
		l = bilgi.nextInt();
		
		while(n!=0 && k!=0 ) 
			  {
			     c = k;
			     k = n%k;
			     n = c;
			     
			  }
		while(n!=0 && l!= 0 )
		{
			d = l ;
			l = n%l ;
			n = d ;
		}
	while(d!=0 && c !=0 )
	{
		s = d ;
		d = c%d ;
		c = s ;
	}
		
		
		System.out.println("ebobumuz    "+s);
bilgi.close();
	}
	
}
