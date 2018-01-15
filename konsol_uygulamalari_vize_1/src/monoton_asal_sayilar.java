package konsol_uygulamalari_vize_1;


/* kendi yaptýðým beþ basamaklý monton asal sayilari kontrol eden program */

import java.util.Scanner ;

public class monoton_asal_sayilar {
	
	public static void main(String args[])
	{
		Scanner bilgi = new Scanner(System.in) ;
		int i ;
		int t = 0  ;
		int v = 0 ;
		boolean y = false ;
		int z = 0 ;
		int u = 1 ;
		int k = bilgi.nextInt();	
		int a = k/10000 ;
		int b = (k/1000)%10 ;
		int c = (k/100)%10 ;
		int d = (k%100)/10 ;
		int e = k%10 ;
		int dizi[] = {a,b,c,d,e}  ;
	
		for (v=1 ; v<dizi.length ; v++)
		{
	if ((dizi[v]- dizi[v-1] == 1) || (dizi[v]-dizi[v-1] == 0) ||( dizi[v]-dizi[v-1] == -1))
			{
					y = true ;
			}
	else
		y = false ;
	if (dizi[v] != dizi[v-1])
	{
		z ++ ;
	}
 if (dizi[v] == dizi[v-1]){
		u++ ;
	}
		}
		
		for(i=2 ; i<Math.sqrt(k); i++)
		{
			if (k%i == 0)
			{
				t = -1 ;
				break ;
				
			}
		}	

		for(i=0 ; i<dizi.length; i++)
	System.out.print(" "+dizi[i]);	
	System.out.println();
	System.out.print(z);
	System.out.println();
	System.out.println(u);
	System.out.println(y);
	
	if ( t != -1 && y == true && z <=2 && u>=3 )
			{
			System.out.print("monoton asaldir");
			
			}

	else
			System.out.println("monoton asal degildir");

	
	
bilgi.close();
	}

}
