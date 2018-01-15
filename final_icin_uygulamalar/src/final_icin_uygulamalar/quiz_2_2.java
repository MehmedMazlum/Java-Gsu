package final_icin_uygulamalar;
/* son quizimiz */

import java.lang.String ;

public class quiz_2_2 {

	public static String boslukat(String metin) {
		String metin2 = "";
		int n = metin.length();
		for (int i = 0; i < n; i++)
			if (!(metin.substring(i, i + 1)).equals(" "))
				metin2 = metin2 + metin.substring(i, i + 1);

		return metin2;
	}

	public static void main(String args[]) {
		int n, k = 0, m, p;
		double r;
		String metin2;
		metin2 = "bugunsaatikidesaldiriyoruz";
		String kripto = "";
		String kripto_2 = "";
		String kripto_3 = "";
		n = metin2.length();
		r = Math.sqrt(n);
		m = (int) r;
		if (m * m != n)
			m++;
		int m2 = m;
		char dizi[][] = new char[m][m];
		char dizi_1[] = new char[m * m];
		while (m > 0) {
			p = k;
			do {
				kripto = kripto + metin2.substring(p, p + 1);
				p = p + m2;
			} while (p < n);
			k++;
			m--;
		}
		System.out.print(kripto);
		System.out.println();
		int g = 0;
		int j = 0;
		int i = 0;

		for (k = 0; k < kripto.length(); k++) {
			dizi[i][j] = kripto.charAt(k);
			j++;
			g++;
			if (g == m2) {
				g = 0;
				i = i + 1;
				j = 0;
			}

		}
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++)
				System.out.print(dizi[i][j]);
			System.out.println();

		}
		i = 0;
		k = 0;
		j = 0;
		int h = 0;
		while (i != 6) {
			dizi_1[k] = dizi[i][j];
			k++;

			switch (h) {
			case 0:
				j++;
				break;
			case 1:
				j--;
				break;
			}

			if (j == 5) {
				i = i + 1;
				h = (h + 1) % 2;
			}

			if (j < 0) {
				j = 0;
				i = i + 1;
				h = (h + 1) % 2;
			}

		}
		for (i = 0; i < dizi_1.length; i++)
			System.out.print(dizi_1[i]);
		System.out.println();
		for (i = 0; i < dizi_1.length; i++) {
			kripto_2 = kripto_2 + dizi_1[i];

		}

		kripto_3 = kripto_2.replaceAll("\\s+","");
		System.out.println(kripto_3);

	}
}