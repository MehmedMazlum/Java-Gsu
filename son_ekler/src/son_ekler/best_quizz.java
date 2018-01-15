
package son_ekler;

public class best_quizz {
//https://github.com/arinik9/Java_gsu
	public static void main(String[] args) {

		int a;

		int b;

		int c;

		int w = 0;

		int t = 0;

		int u = 0;

		int x = 1;

		int d;

		int e;

		int f;

		int g;

		int h;

		int j;

		int k;

		int l;

		int m;

		int s = 0;

		int y = 0;

		int z = 0;

		for (a = 100; a < 999; a++)

		{

			for (b = 100; b < 999; b++)

			{

				for (c = 100; c < 999; c++)

				{

					d = a / 100;

					e = a % 10;

					f = (a % 100) / 10;

					g = b / 100;

					h = b % 10;

					j = (b % 100) / 10;

					k = c / 100;

					l = c % 10;

					m = (c % 100) / 10;

					s = 0;

					y = 0;

					z = 0;

					if ((d != e) && (d != f) && (d != g) && (d != h)
							&& (d != j) && (d != k) && (d != l) && (d != m)
							&& (e != f)

							&& (e != g) && (e != h) && (e != j) && (e != k)
							&& (e != l) && (e != l) && (e != m) && (f != g)
							&& (f != h)

							&& (f != j) && (f != k) && (f != l) && (f != m)
							&& (g != h) && (g != j) && (g != k) && (g != l)
							&& (g != m) &&

							(h != j) && (h != k) && (h != l) && (h != m)
							&& (j != k) && (j != l) && (j != m) && (k != l)
							&& (k != m) && (l != m))

					{

						if ((d != 0) && (e != 0) && (f != 0) && (g != 0)
								&& (h != 0) && (j != 0) && (k != 0) && (l != 0)
								&& (m != 0))

						{

							// System.out.println(a+" "+b+" "+c);

							w = a;

							t = b;

							u = c;

							while (w != 0 && t != 0)

							{

								y = t;

								t = w % t;

								w = y;

							}

							while (w != 0 && u != 0)

							{

								z = u;

								u = w % u;

								w = z;

							}

							while (z != 0 && y != 0)

							{

								s = z;

								z = y % z;

								y = s;

							}

							if (s > x)

							{

								x = s;

							}

						}

					}

				}

			}

		}

		System.out.println(x);

	}

}
