package final_icin_uygulamalar;

public class sifre_final_2 {
	
	public static void main(String args[])
	{
		int sayi ;
		int i ;
		String alfabe = "abcçdefgðhýijklmnoöprsþtuüvyz" ;
		String sifrelenecek = "fhwfdefrwefv" ;
		char yeni_sifre[] = new char [sifrelenecek.length()] ;
		char yep_yeni[] = new char [2*sifrelenecek.length()] ;
		String kripto = "" ;
		
 		for(i=0 ; i<yeni_sifre.length;i++)
		{
			yeni_sifre[i] = '0' ;
		}
		
	i = 0 ;
		while( i < yeni_sifre.length)
	{
			sayi = (int)(Math.random()*29) + 0 ;
			
			if(yeni_sifre[i] == '0')
			{
				yeni_sifre[i] = alfabe.charAt(sayi) ; 
				i++ ;
			}
			
		}
		
		for(i=0 ;i< yeni_sifre.length ;i++)
			System.out.print(yeni_sifre[i]);
		System.out.println();
		System.out.print(sifrelenecek);
		
		int j = 0 ;
		int k = 0 ;
		i = 0 ;
		while(i<yep_yeni.length)
		{
			while( (j<yeni_sifre.length) && (k <sifrelenecek.length()))
			{
				if(i%2 == 0 )
					{
				yep_yeni[i] = sifrelenecek.charAt(k) ;
				k++ ;
				i++ ;
					}
				
				if (i%2 != 0)
				{
					yep_yeni[i] = yeni_sifre[j] ;
					j++ ;
					i++ ;
				}
			}
		}
	
		System.out.println();
	for(i=0 ; i<yep_yeni.length ; i++)
	{
		System.out.print(yep_yeni[i]);
	}
	int t = yep_yeni.length ;
	int n = yep_yeni.length/4  ;
 	if(  n*4 < t )
 		n = n + 1 ;
	
	
	int bk = n*2 ; 
	int g = n ;
	int tk = n ;
	int h = 1  ;
	System.out.print(n);
	System.out.print(bk);
	int v = 0 ;
	while(v != 4  )
	{
		
		kripto = kripto + String.valueOf(yep_yeni[bk]) ;
		bk++ ;
		n-- ;
		
		
		
		if(n == 0 && (h == 1))
		{	v = 1 ;
			h = h + 1 ;
			n = tk ;
			bk = 0 ;
		}
		if (n== 0 && h == 2 )
		{
			h = h +1 ;
			
			bk = tk*3 ;
			n = t - bk  ;
			v = v + 1 ;
			
		}
		if(n == 0 && h == 3)
		{
			h = h + 1 ;
			n = tk ;
			bk = tk ;
			v = v + 1 ;
		}
		if(n == 0 && h == 4)
			v = v+1 ;
	}
	
		System.out.println();
		System.out.print(kripto);
	
	}

}
