package sifre_saldiri;
/* https://github.com/arinik9/Java_gsu*/
/* persembe gunu yapilan  "bugun saat ikide saldiriyoruz" stringini sifreleyen program */
public class saldiri {

	public static void main(String args[])
	{
		int i ;
		int k ;
		int g = 0 ;
		int j , z ;
		int t ;
		String sifre = "bugunsaatikidesaldiriyoruz" ;
		int n ;
		n = (int)Math.sqrt(sifre.length()) ;
		char b[][] = new char[n][n+1] ;
		char dizi[] = new char [sifre.length()] ;
		int tk = n ;
		j = 0 ;
		z = 0 ;
		for(i=0 ; i<sifre.length(); i++)
		{
			b[j][z] = sifre.charAt(i) ;
			j++ ;
			g++ ;
			
			if (g == tk)
		{
			g = 0 ;
			z = z+1 ;
			j = 0 ;
		}
			
		}
		
	     for(i=0;i<n;i++){
          	for(j=0;j<n+1;j++)
          		System.out.print(b[i][j]);
          	System.out.println();
	 }
k = 0 ;
i = 0 ;
j = 0 ;
t = 0 ;
	     while (i<n && j<n+1){
	       		dizi[k] = b[i][j] ;
	          	k++ ;	
	       		j++ ;
	       		t++ ;
	       		if (t == n+1)
	          {
	        	j = 0 ;
	        	i = i +1 ;
	          	t = 1 ;
	          	}
	     }
	System.out.print(""+n);
	System.out.println();
	
	for(i=0 ; i<sifre.length();i++)
	{
		System.out.print(dizi[i]);
	}
	}
	
}
