
package final_icin_uygulamalar;

import java.util.Scanner ;

public class  son_quizz {

	public static String boslukat(String metin)
		{
			String metin2 = "" ;
			int n = metin.length() ;
			for(int i = 0 ; i< n ; i++)
					if(!(metin.substring(i, i+1)).equals(" "))
						metin2 = metin2 + metin.substring(i, i+1) ;
						
			return metin2 ;
		}

	
	public static void main(String args[])
	{
		int n, k= 0 , m, p ;
		double r ;
		String metin ;
		String metin2 ;
		Scanner bilgi = new Scanner(System.in);
		metin = bilgi.nextLine() ;
		metin = metin.toLowerCase() ;
		metin2 = boslukat(metin);
		
		String kripto = "" ;
		n = metin2.length() ;
		r = Math.sqrt(n) ;
		m = (int)r ;
		if(m*m != n)
			m++ ;
		int m2 = m ;
		while(m > 0 )
		{
			p = k ;
			do
			{
				kripto = kripto + metin2.substring(p, p+1);
				p = p + m2 ;
			}
			while (p < n );
			k++ ;
			m-- ;
		}
		System.out.print(kripto);
		bilgi.close();
	}
	
	
}