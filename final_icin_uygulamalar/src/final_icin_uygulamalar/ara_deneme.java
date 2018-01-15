package final_icin_uygulamalar;

public class ara_deneme {
	public static void main(String args[])
	{
		int dizi[] = {1,9,8,7} ;
		int tersTamponInt = 0 ;
		int ara_toplam = 0 ;
	int h = 1000 ;
	int k = 0 ;
	while((k <= 3) && (h >= 1))
	{
		ara_toplam = h*dizi[k] ; 
		tersTamponInt = ara_toplam + tersTamponInt ;
		ara_toplam =  0 ;
		k++ ;
		h = h/10 ;
			
	}
	System.out.print(tersTamponInt);
	}

}
