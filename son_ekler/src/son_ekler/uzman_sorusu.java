package son_ekler;


public class uzman_sorusu {


	static boolean rakamlarterslimi(int rakamlar[]) {

	boolean gk = true;

	int i;

	int j;

	for (i = 0; i < rakamlar.length; i++) {

	for (j = 0; j < rakamlar.length; j++) {

	if (rakamlar[i] == rakamlar[j] && (i != j))

	gk = false;

	if (rakamlar[j] == 4 || rakamlar[i] == 4 || rakamlar[i] == 7

|| rakamlar[j] == 7 || rakamlar[i] == 3

|| rakamlar[j] == 3)

	gk = false;


}


}

	return gk;

}


	public static void main(String args[]) {

	int max = 1;

	int i1;

	for (i1 = 1000; i1 < 10000; i1++) {

	int rakamlar[] = { i1 / 1000, (i1 / 100) % 10, (i1 % 100) / 10,

i1 % 10 };

	int sayi_2;

	int rakamlar_2[] = { i1 % 10, (i1 % 100) / 10, (i1 / 100) % 10,

i1 / 1000 };

	for (int g = 0; g < 4; g++) {

	if (rakamlar_2[g] == 6) {

rakamlar_2[g] = 9;

	} else if (rakamlar_2[g] == 9) {

rakamlar_2[g] = 6;

}

}



	int a = rakamlar_2[0];

	int b = rakamlar_2[1];

	int c = rakamlar_2[2];

	int d = rakamlar_2[3];



sayi_2 = a * 1000 + b * 100 + c * 10 + d * 1;

	int sayi_3 = i1 - sayi_2;



	int h[] = { sayi_3 / 1000, (sayi_3 / 100) % 10,

(sayi_3 % 100) / 10, sayi_3 % 10 };


	if (rakamlarterslimi(rakamlar) == true

	&& (rakamlarterslimi(h) == true) && sayi_3 > 0) {

max = 1000;

	if (i1 > max)

max = i1;



}


}

	System.out.println(max);

}


}
