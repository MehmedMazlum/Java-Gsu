package konsol_uygulamalari_vize_1;

public class merhaba_sifre {

	  public static void main(String args[])
	    {
	int i ;
	int j ;
	int k ;
	int t ;
	String name = "MERHABA" ;
	String kod ="bugünsaatikidesaldýrýyoruz" ;
	int c[] = new int [7] ;   //name.charAt(A); // c='a'
	t = kod.length() ;
	char d[][] = new char [t][t] ;

 	/*for(i=0 ; i<name.length();i++)
	{
	c[i] = (int)(name.charAt(i)) ;
	
    //System.out.print(" "+c[i]);
	
	}
	*/
 
	i = 10 ;
 	j = 0 ;
 	for(k=0;k<kod.length();k++){
		d[i][j]=kod.charAt(k);
		
		
		j++ ;
 	
 	if ( j == 7)
 	{
 	
 	i++ ;
 	j = 0  ;
 	}

    
     } 
    for(i=0;i<t;i++){
     	for(j=0;j<t;j++)
     		System.out.print(" "+d[i][j]);
     	System.out.println();
    }

	
	 
}
	   
}
	
