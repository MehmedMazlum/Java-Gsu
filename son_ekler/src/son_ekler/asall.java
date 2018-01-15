package son_ekler;


public class asall {


	public static void main(String []args)

{

	System.out.println(isSuperPrime(7331));

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


	public static boolean isPrime(int n)

{

	for(int i=2;i<n;i++) {

	if(n%i==0)

	return false;

}

	return true;

}

}
