package final_icin_uygulamalar;

public class vize_2_uclerin {
	
	static boolean rakamlar_ardisik_mi(int rakamlar[])
	{
		for(int i=0 ; i<4 ;i++)
		{
			if(Math.abs(rakamlar[i]-rakamlar[i+1]) == 1 )
			{
				return false ;
			}
	
			
		}
		return true ;
	}
	
	static boolean rakamlarfarklimi(int rakamlar[])
	{
		for(int i=0;i<5;i++)
			for(int j =0 ; j<5 ;j++)
				if((rakamlar[i] == rakamlar[j]) && (i!=j))
				{
					return false ;
				}
		return true ;
	}
	public static void main(String args[])
	{
		int g = 0 ;
		int tampon = 0  ;
		int tampon_ters = 0  ;
		int ideal_tampon = 0 ;
		int min = 50000 ;
			for(int a =1; a<=5;a++)
				for(int b =1; b<=5  ;b++)
					for(int c =1; c<=5  ;c++)
						for(int d =1; d<=5  ;d++)
							for(int e =1; e<=5 ;e++)
							{
								int rakamlar[] = {a,b,c,d,e} ;
								if(rakamlar_ardisik_mi(rakamlar) == true && rakamlarfarklimi(rakamlar)== true )
								{
									tampon = rakamlar[0]*10000 +rakamlar[1]*1000 + rakamlar[2]*100 + rakamlar[3]*10 + rakamlar[4]*1 ;
									tampon_ters = rakamlar[4]*10000 +rakamlar[3]*1000 + rakamlar[2]*100 + rakamlar[1]*10 + rakamlar[0]*1;
					
								 g = tampon-tampon_ters ;
								
								if(Math.abs(g) < Math.abs(min) )
								{
									min = g ;
									ideal_tampon = tampon ;
								}
								
								}
							}

			System.out.println(min);
			System.out.println(ideal_tampon);
	}
}

