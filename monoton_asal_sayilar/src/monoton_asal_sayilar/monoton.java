
package monoton_asal_sayilar;
/* 2013 vizesi monoton asal sayilar */
import java.util.Scanner ;

public class monoton {

	public static void main(String args[])
	{
		int i = 0  ;
		int t = 0 ;
		int g = 1 ;
		int[] a = new int[5];
		int j = 0 ;
		int k ;
		int h = 0 ;
		Scanner bilgi = new Scanner(System.in) ;
		
	i = bilgi.nextInt() ;
	
 			a[0] = i/10000 ;
			a[1] = (i/1000)%10 ;
			a[2] = (i/100)%10 ;
			a[3] = (i%100)/10 ;
			a[4] = i%10 ;
	k = 0 ;	
for(j=0 ; j<4 ; j++ )
{	
if( (a[j+1]-a[j] == 0) || (a[j+1]-a[j] == 1) || (a[j+1]- a[j] == -1) )	 
	{
		k = k + 1 ;

		if (a[0] == a[j+1] )
		{
			g = g + 1 ;
		}
		else	if (a[0] != a[j+1])
		{
			t = t + 1 ; 
		}
	}

 else
		k = 0 ;

}
j = 0 ;
for ( j = 2 ; j<Math.sqrt(i);j++ )
{
	if (i%j == 0 )
		h = h + 1 ;
	else 
		h = 0 ;
}
if ( k == 4 && (g == 4 || t == 4 ) && (h == 0) )
{
	System.out.println("dogrudur");
}
else
	System.out.println("bir yanlisin var");
bilgi.close();
}


	}
	
	
	

