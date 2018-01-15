package final_icin_uygulamalar;

public class ledli_medli {

	public static void main(String args[]) {
		tersli_yap(2019);
	}

	public static boolean is_ters(int sayi) {
		boolean gk = true;
		int i;
		int a[] = new int[4];

		a[0] = sayi / 1000;
		a[1] = (sayi / 100) % 10;
		a[2] = (sayi % 100) / 10;
		a[3] = sayi % 10;
		for (i = 1; i < 4; i++) {
			if (a[i - 1] == a[i]) {
				gk = false;

			}
		}

		if (gk == true) {
			for (i = 0; i < 4; i++) {
				if ((a[i] == 3) || (a[i] == 4) || (a[i] == 7)) {
					gk = false;

				}
			}
		}

		return gk;
	}

	public static void tersli_yap(int sayi_2) {
		int i;
		int sayi_3 = 0  ;
		int a[] = new int[4];
		int c[] = new int[4];
		a[0] = sayi_2/1000 ;
		a[1] = (sayi_2/100)%10 ;
		a[2] = (sayi_2%100)/10 ;
		a[3] =	sayi_2%10 ;	
		int b[] = new int[4];
		if (is_ters(sayi_2) == true) {
			b[0] = sayi_2 % 10;
			b[1] = (sayi_2 % 100) / 10;
			b[2] = (sayi_2 / 100) % 10;
			b[3] = sayi_2 / 1000;

			for (i = 0; i < 4; i++) {
				if (b[i] == 6) {
					b[i] = 9;
				} else if (b[i] == 9) {
					b[i] = 6;
				}
			}
	
			for(i=0;i<4;i++)
			{
				c[i] = a[i]-b[i] ;
				
			}

			
} else
			System.out.println("olmadi");
	}
	
}
