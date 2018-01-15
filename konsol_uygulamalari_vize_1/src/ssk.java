
package konsol_uygulamalari_vize_1;

public class ssk
{


    public static void main(String args[])
    {
     int n,k,z,g=0,tk=1,ts=1,h=0,yon=0;	
    int i ;
    int j = 0 ;
    String a = "bugünhavaçokgüzelolacak" ;
               
                n = a.length();
         char dizi[][] = new char [n][n] ;       
                if(n==2)
                	k=0;
                	else 
                		k=n/2;                			
                			j=k;
                			z=k;
                			dizi[j][z]=a.charAt(0);
                			j = 12  ;
                			
                			for(i=1;i<a.length();i++){
                			dizi[j][z]=a.charAt(i);
                			g++;
                			if((g==tk)&&(h==0)){
                				tk++;
                				h=1;
                				g=0;
                				yon=(yon+1)%4;
                			}
                			if((g==ts)&&h==1){
                				ts++;
                				h=0;
                				g=0;
                				yon=(yon+1)%4;
                			}
                			switch(yon){
                				case 0: j++;  break;
                				case 1: z--;  break;
                				case 2: j--;  break;
                				case 3: z++;  break;
                			}
                	}
             for(i=0;i<n;i++){
             	for(j=0;j<n;j++)
             		System.out.print(dizi[i][j]);
             	System.out.println();
             }   
                
        }




}