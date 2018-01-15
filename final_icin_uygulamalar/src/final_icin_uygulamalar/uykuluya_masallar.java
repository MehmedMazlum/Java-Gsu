package final_icin_uygulamalar;

import java.io.* ;

public class uykuluya_masallar {
	
	static boolean asal_sayi(int i) 
	{
		 int k;	
		 boolean flag = true ;
		 if(i < 2)
			 flag = false ;
	
		for(k=2 ; k<i ; k++)
		{
			if(i%k == 0 )
				flag = false ;
		}
		
		return flag ;
	}
	

	
	public static void main(String args[])
		
	{
		String adres = "C:\\Intel\\Logs\\mifreli.txt" ;
		String metin_4 = "" ;
		int i ;
		int sayac = 0 ;
		int sayac_2 = 1  ;
		int t = 1  ;
		int r = 2 ;
		int p = 3;
		try
		{
			FileReader a = new FileReader(adres);
			BufferedReader b = new BufferedReader(a);
			String metin = b.readLine();
			String s = "" ;
		
			while(metin != null)
			
				{
			s = s+ metin ;		
			metin = b.readLine() ;
			sayac++ ;
			
				}
		while(sayac_2 != sayac)
		{
				for( i =0 ; i<s.length()/sayac ;i++)
				{
					if( sayac_2 == 1 && asal_sayi(i) == true)
				
					{
						metin_4 = metin_4 + s.substring(i, i+1);
					}
				}
					sayac_2++ ;
					for( i =s.length()/sayac ; i<2*s.length()/sayac ;i++)
				{
					if(sayac_2 == 2 && i%2 == 0)
					{
						metin_4 = metin_4 + s.substring(i, i+1);
					
					}
				}
					sayac_2++ ;
					for( i = 2*s.length()/sayac ; i<s.length() ;i++)
				{
					if(sayac_2 == 3 &&  i%2 != 0)
					{
						metin_4 = metin_4 + s.substring(i, i+1);
					}
				}
						
					
		}
		
			System.out.println(sayac);	
		System.out.println(s);
		System.out.println(metin_4);

			b.close();	
			
			
		}
		
		catch(IOException e)
		{
			
		}
		
		
		
	}
	
	
}