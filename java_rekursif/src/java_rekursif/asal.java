package java_rekursif;



public class asal {
	public static void main(String []args)
	{
	   for(int i = 1000 ; i<10000 ; i++)
	   {
		   if(isSuperPrime(i) == true )
			   System.out.println(i);
	   }
		
	}

	public static boolean isSuperPrime(int h)
	{
	    if ((h<10)&&isPrime(h))
	        return true;
	    else if (isPrime(h))
	        return isSuperPrime(h/10);  
	    else
	        return false;
	}

	//Note this is not an efficient implementation, 
	//but it is correct, was just using it to test
	public static boolean isPrime(int n)
	{
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	             return false;
	    }
	    return true;
	}
}