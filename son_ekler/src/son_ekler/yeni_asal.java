package son_ekler;


public class yeni_asal {


	public static void main(String []args)

{

	System.out.println(isSuperPrime(4));

}




	public static int isSuperPrime(double h)

{

	if (isPrime(h)< 10)

	return isPrime(h);

	else if (isPrime(h)> 10)

	return isSuperPrime(h/10); 

	else

	return 0 ;

}


	public static int isPrime(double n)

{



	int k = 0 ;

	int j = (int)Math.pow(10.0,n);

	while ( j<Math.pow(10.0, n+1) )

{

	for(int i=2;i<Math.sqrt((double)j);i++) {

	if(j%i==0)

k = 0 ;

}

k = j ;

j++ ;

}

	return k ;

}

}
