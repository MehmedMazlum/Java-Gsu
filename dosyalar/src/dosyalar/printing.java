package dosyalar;

import java.awt.* ;
import java.awt.print.* ;

public class printing implements Printable{

	public int print (Graphics p, PageFormat pf, int sayfa )
	{
		if(sayfa != 0 )
			return NO_SUCH_PAGE ;
		p.drawRect(100,100,200,200);
		p.drawString("merhaba", 150,200);
		return PAGE_EXISTS ;
	}
	
	public static void main(String args[])
	{
	try
	{
		PrinterJob islem = PrinterJob.getPrinterJob() ;
		islem.setPrintable(new printing());
		if(islem.printDialog()) 
			islem.print() ;
	}
	catch (Exception y)
	{
		System.out.println("hata olustu");
	}
		
	}
	
	
}
