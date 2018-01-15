package dosyalar;

import java.io.* ;


public class loading {
	

	    
	    public static void main(String[] args) {
	try 
	{
	 FileReader a = new FileReader("C:\\WINDOWS\\system32\\drivers\\etc\\hosts");
	  BufferedReader b = new BufferedReader(a);
	 String metin = b.readLine() ;
	 while(metin != null)
	 {
	  System.out.println(metin);
	  metin = b.readLine() ;
	  
	 }
	}
	catch(Exception e)
	{
	 System.out.println("Boyle bir dosya yok !");
	 }
	    }
	}


