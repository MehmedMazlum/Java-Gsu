package konsol_uygulamalari_vize_1;

/* stackoverflow daki paypal probleminin çözümü */

public class saat_yonunde 
{


    public static void main(String args[])
    {
    int n,z,g=0,tk=6,ts=6,h=0,yon=0;
    int i ;
    int pp ;
    int j = 0 ;
    String a = "PAYPALÝSTHEFASTERSAFERWAYTOSENDMONEY" ;
               
                n = a.length();
            pp = (int)Math.sqrt(n);    
         char dizi[][] = new char [7][7] ;       
                      			
                			j=0;
                			z=0;
                			
                			for(i=0;i<a.length();i++){
                			dizi[j][z]=a.charAt(i);
                			g++;
                			if((g==tk)&&(h==0)){
                			
                				ts--;
                				
                				h=1;
                				g=0;
                				
                				yon=(yon+1)%4;
                				
                			}
                			if((g==ts)&&h==1){
                				
                				tk--;
                				
                				h=0;
                				g=0;
                				
                				yon=(yon+1)%4;
                				
                			}
                			switch(yon){
                				case 0: z++;  break;
                				case 1: j++;  break;
                				case 2: z--;  break;
                				case 3: j--;  break;
                			}
                	}
             for(i=0;i<pp;i++){
             	for(j=0;j<pp;j++)
             		System.out.print(dizi[i][j]);
             	System.out.println();
             }   
                
        }

}
	
	
	
	
