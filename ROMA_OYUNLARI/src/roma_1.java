
class roma_1 {

	  public static String donustur ( int m ) 
	  {
	  
	 String a = "I" ;
	 String b = "V" ;
	 String c = "X" ;
	 String d = "L" ;
	 String e = "C" ;
	 String f = "D" ;
	 String g = "M" ;
	 String s = "\0";

	 int t  ;
	 int r ;
	 int k ;
	 int y ;
	 t = m/10 ;
	 r = m%10 ;
	 k = m /100 ;
	 y = m%100 ;
	 
	while ( m != 0 && m<4000)
	{
	 while ( m >= 1000 )
	  {
	  m = m - 1000 ;
	  s = s + g ;
	 }
	 while( m < 1000 && m >= 500 )
	 {
		 if ( k == 9)
		 {
			 s = s + "CM" ;
			 m = y ;
		 }
		 else if ( k != 9)
		 {
	m = m - 500 ;
	  s = s + f ; 
		 }
	  
	 }
	 while ( m < 500 && m >= 100 )
	 {
		 if ( k == 4 )
		 {
			s = s + "CD" ;
			m = y ;
		 }
		 else if ( k != 4 )
		 {
	  m = m - 100 ;
	  s = s + e ;
		 }
		 }
	 while ( m < 100 && m >= 50)
	 {
	  if ( t == 9)
	  {
		  s = s + "XC" ;
		  m = r ;
	  }
	  else if ( t!= 9)
	  {
	m = m - 50 ;
	s = s + d ;
	  }
	  }
	 while ( m < 50 && m >= 10 )
	 {
		
	  if ( t == 4  )
	  {
		  s = s + "XL" ;
		  m = r ;
	  }
	  else if ( t != 4)
	  {
	m = m - 10 ;
	s = s + c ;   
	  }
		
	 }
	 while ( m < 10 && m >= 5 )
	  {
	  if ( m == 9)
	  {
		  s = s + "IX" ;
		  m = 0 ;
	  }
	  else if ( m != 9 )
	  {
	m = m - 5 ;
	s = s + b ;
	  }
	  }
	 while ( m < 5 && m >= 1 )
	 {
		 			
		 if ( m == 4 )
		 {
			 
			 s = s + "IV" ;
			 m = 0 ;
		}
	 else  if ( m != 4)
		 {
		m = m - 1 ;
		s = s + a ; 
		 }

	 }
	}
	return s ;
	  }

	}
