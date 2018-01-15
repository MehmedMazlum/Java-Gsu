package konsol_uygulamalari_vize_1;

import java.util.Scanner ;

public class super_asal {
	
	  public static void main(String args[])
	    {
		 Scanner bilgi = new Scanner(System.in);
		 int i ;
		int N = bilgi.nextInt() ;
		int a ;
		boolean kontrol = true ;
		  
for ( a = (int)Math.pow(10, N-1) ; a < (int)Math.pow(10, N) ; a++ )
{	
	kontrol = true ;
	int k = a ;
	while ( k != 0 && kontrol == true  )
		  {
			for(i=2 ; i<=Math.sqrt(k); i++)
{
			  if (k%i ==  0)
				 kontrol = false ;
			
}
			if ( kontrol == true )
				k = k/ 10 ;
 
	
		
			}
	if ( kontrol == true )
System.out.print(" "+a); 
	
}

bilgi.close();		  
	    }

}
