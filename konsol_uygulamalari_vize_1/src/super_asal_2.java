package konsol_uygulamalari_vize_1;



	import java.util.Scanner;
	 
	 
	public class super_asal_2
	{
	    public static void main(String args[])
	    {
	        Scanner bilgi = new Scanner(System.in);
	        int basamakSayisi = bilgi.nextInt();
	        boolean control = true ;
	        int enKucukSayi,enBuyukSayi ;
	        enKucukSayi = (int)Math.pow(10,basamakSayisi-1);
	        enBuyukSayi = (int)Math.pow(10, basamakSayisi);
	        int i ;
	        int j;
	        for(i=enKucukSayi ; i<enBuyukSayi ;i++)
	        {
	            control =true ;
	            int k = i;
	            while(k!=0 && control ==true)
	            {
	                for(j=2;j<k ;j++)
	                {
	                    if(k%j ==0)
	                    {
	                        control =false ;
	                    }
	                }
	                if(control ==true )
	                    k=k / 10;
	            }
	            if(control == true)
	            {
	                System.out.println(i);
	            }
	        }
	    }
	}



