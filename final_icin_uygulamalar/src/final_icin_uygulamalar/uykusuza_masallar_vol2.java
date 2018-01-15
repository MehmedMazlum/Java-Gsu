package final_icin_uygulamalar;

import java.io.* ;

public class uykusuza_masallar_vol2   {
	
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
		try
		{
			FileReader a = new FileReader(adres);
			BufferedReader b = new BufferedReader(a);
			String metin = b.readLine();
			String s = "" ;
			while(metin != null)
				{
					s = s + metin ;
					metin = b.readLine() ;
				}
				
		
			
			System.out.println(s);	
			//System.out.println(s1);
			b.close();	
			
			int n = s.length() ;
			
		 
			for( i =0 ; i< 23 ; i++ )
			{
				if(asal_sayi(i) == true )
				{
					metin_4 = metin_4 + s.substring(i, i+1);
				}
			}
			System.out.println(metin_4);
		
		for(i=23;i<50 ;i++)
		{
			if(i%2 == 0)
				metin_4 = metin_4+ s.substring(i, i+1);
		}
		System.out.println(metin_4);
		for(i=50;i<n ;i++)
			if(i%2 != 0 )
				metin_4 = metin_4+ s.substring(i, i+1);
		
		System.out.println(metin_4);
		}
		
		catch(IOException e)
		{
			
		}
		
		
		
	}
	
	
}
