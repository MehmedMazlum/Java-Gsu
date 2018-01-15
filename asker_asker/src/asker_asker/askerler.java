package asker_asker;

import java.util.Scanner ;

public class askerler {

	public static void main(String args[] )
	{
		int i ;
		int c ;
		int p = 1 ;
		Scanner bilgi = new Scanner (System.in);
		System.out.println("bir sayi giriniz");
		System.out.println();
		int a = bilgi.nextInt()   ;
		
		int k  = 1 ;
		int n = k -1  ;
		int[] dizi = new int[a];
		for (i= 0 ; i<dizi.length ; i++)
		{
			dizi[i] = i  ;
			System.out.print(" "+dizi[i]);
			
		}
		System.out.println();
		while ( p != a-1  )
		{
		p++ ;
		System.out.println("kilic "+n+" inci askerde");	
		System.out.println(k+"inci asker oldu");
		
		dizi[k] = 0 ;
		
		System.out.println();
	
		for( c = 0 ; c < a  ; c++ )
	         System.out.print(" "+dizi[c]);
		System.out.println();
		
		
		k = (k+2)%a ;
		n = (n +2)%a ;
		
		if (dizi[k] == 0 )
		{
			k++ ;
		}
		
		
		}


	bilgi.close();	
	}
	
}
