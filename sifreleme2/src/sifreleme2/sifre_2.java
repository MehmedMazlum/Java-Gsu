package sifreleme2;



//import java.util.Scanner ;

		public class sifre_2 {
		public static void main(String args[])
		{
			String m = "bugünbuluþ" ;
			int u, i, k = 0, sayi, j ;
			int hak ;
			
			u = m.length() ;
			hak = (int)(u/10) ;
			String alfabe = "abcçdefgðhýijklmnoöprsþtuüvyz" ;
			char[] s_alfabe = new char[29] ; /* yeni alfabe */
			
			char[] mesaj_1 = new char[u + hak] ; 
			
			for (i= 0 ; i<29 ;i++)
			s_alfabe[i] = '0' ;
			
			i = 0 ;
			
			while(i<29)
			{
				sayi =  (int)(Math.random()*29) + 0 ;
				//sayi = rand.nextInt(29) ;
				if(s_alfabe[sayi] == '0')  /* þifreli alfabe oluþturulur */
					{		s_alfabe[sayi] = alfabe.charAt(i);
							i++ ;
					}
				}
		
		for (i = 0; i< m.length() ; i++)
		{	for(j = 0 ; j<29 ; j++)
				{	if (m.charAt(i) == alfabe.charAt(j))
				{
					mesaj_1[k] = s_alfabe[j] ;  /* þifreli alfabe üzerinden þifreli mesaj yazilir */
					k ++ ;
					//if ((((int)(Math.random()*101) + 0)%10 == 0 ) && (hak > 0))
					//{
					//	mesaj_1[k] = alfabe.charAt((int)(Math.random()*29) + 0 ) ;
				//	}
				}
		}
	}
	System.out.print(""+mesaj_1[i]) ;
	for (i =0 ; i<u ; i++)
			System.out.print(""+mesaj_1[i]) ;
	}
	
	
	}	   