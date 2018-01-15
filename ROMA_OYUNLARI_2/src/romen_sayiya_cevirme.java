

 class romen_sayiya_cevirme {
	 	public void  islem (String s)
	 	{
			 int i =  0; ;
		  	 int tt =  0 ;
		  	 int sayi = 0 ; 
			 String a = "I" ;
			 String b = "V" ;
			 String c = "X" ;
			 String d = "L" ;
			 String e = "C" ;
			 String f = "D" ;
			 String g = "M" ;
			 
			
			 int dizi[] = new int[s.length()] ;
			
			 while(i < s.length())
			 {
				if (s.substring(i, i+1).equals(a)  )
			{
					dizi[i] = 1;
				 	
			}
				if (s.substring(i, i+1).equals(b)  )
				{
					dizi[i] = 5 ;
				}
				
				if (s.substring(i, i+1).equals(c)  )
				{
					dizi[i] = 10 ;
				}
				
				if (s.substring(i, i+1).equals(d)  )
				{
					dizi[i] = 50 ;
				}
				if (s.substring(i, i+1).equals(e)  )
				{
					dizi[i] = 100 ;
				}
				if (s.substring(i, i+1).equals(f)  )
				{
					dizi[i] = 500 ;
				}
				if (s.substring(i, i+1).equals(g)  )
				{
					dizi[i] = 1000 ;
				}
				
				
		i++ ;
		  
			 }
			  
			 
		 for(i=1 ; i<dizi.length ; i++)
			 {

			 if ( (dizi[i-1] == 1 && dizi[i] == 100) || (dizi[i-1] == 1 && dizi[i] == 1000) 
					|| (dizi[i-1] == 10 && dizi[i] == 1000) || (dizi[i-1] == 10 && dizi[i] == 1000)  )
			 {
				 
				 tt = 2 ;
			 }
			 else 
				 {
				 
				 if(dizi[i-1] < dizi[i])
			 {
				 tt = 1 ;
				 dizi[i] = dizi[i]-dizi[i-1];
				 dizi[i-1 ] =  0 ;
				
			 }
				 }	 
			 }
			 
		if (tt == 1 )
		{
		 for(i=0 ; i<dizi.length ; i++)
		 {
			 System.out.print(" "+dizi[i]);
			 sayi = sayi + dizi[i] ;
		 }
		 System.out.println();
		 System.out.print(sayi) ;	
		}
		 if ( tt == 0 )
		 {
			 for(i=0 ; i<dizi.length ; i++)
			 {
				 System.out.print(" "+dizi[i]);
				 sayi = sayi + dizi[i] ;
			 }
		 System.out.println();
		 System.out.print(sayi) ;	
		 }
		 
		if ( tt == 2 )
			System.out.println("hatali olmadi");
		 
		
		  
		  
	  }
	 	
}
