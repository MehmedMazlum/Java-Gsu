package quizzler_1;



public class quizz_3 {

   public static void main(String[] args) {
    int s1=0;
    int s2=0;
    int s3=0;
    
   int a ;
   int b ;
   int c ;
   int d;
   int e ;
   int f ;
   int g ;
   int h ;
   int j ;
   int k ;
   int l ;
   int m ;
   int s ;
   int y;
   int z;
   int max=1 ;
    for (a=100 ;a< 999 ;a++){
     for (b=100 ; b<999 ; b++){
       for (c=100 ; c<999 ;c++ )
        {
     
    d = a/100 ;
    e = a%10 ;
    f = (a%100)/10 ;
    g = b/100 ;
    h = b%10 ;
    j = (b%100)/10 ;
    k = c/100 ;
    l = c%10 ;
    m = (c%100)/10 ;
    s= 0 ;
    y = 0 ;
    z = 0 ;
     
      
     
     if ((d!= e) && (d != f) && (d != g) && (d != h) && (d != j) && (d != k) && (d != l) && (d != m)&&(e !=f)
      && (e != g) && (e != h) && (e != j) && (e != k) && (e != l) && (e != l) && (e != m)&& (f !=g) &&(f!=h)
        && (f!= j) && (f!= k) && (f != l) && (f != m) && (g!=h) && (g!=j) &&(g!=k) &&(g!=l) &&(g!= m) &&
        (h!=j) &&(h!=k) &&(h!=l) &&(h!=m) &&(j!=k ) &&(j!=l) &&(j!=m) &&(k!=l ) &&(k!=m) &&(l!=m))
      {
      if ((d!=0) && (e != 0) && (f!=0) && (g!= 0) && (h != 0) && (j != 0) && (k!= 0) && (l!=0) && (m!=0) )
      { 
      	//System.out.println(a+" "+b+" "+c); 
      	s1=a;
      	s2=b;
      	s3=c;	 
      	
    	 while(s1!=0 && s2!=0 ) 
  			  {
  			     y = s2;
  			     s2 = s1%s2;
  			     s1 = y;
  			     
  			  }

  		while(s1!=0 && s3!= 0 )
  		{
  			z = s3 ;
  			s3 = s1%s3 ;
  			s1 = z ;
  		}

  		while(z!=0 && y !=0 )
  	{
  		s = z ;
  		z = y%z ;
  		y = s ;
  	}
  		
  		
  
  	if (s > max ){
  		 max = s ; 	  
  	}

    }
   
     }

   }
     
   }  
     
    	
   }
    System.out.println(max);
 } 
    
}
