package final_icin_uygulamalar;

import java.util.*;

public class nejat_son {
        
    /**
     * Creates a new instance of <code>tersli_sayilar</code>.
     */
    public nejat_son() {
    }
    
    /**
     * @param args the command line arguments
     */
    
	static boolean rakamlarfarklimi(int rakamlar[])
	{
		for(int i=0;i<7;i++)
			for(int j =0 ; j<7 ;j++)
				if((rakamlar[i] == rakamlar[j]) && (i!=j))
				{
					return false ;
				}
		return true ;
	}
	
    public static void main(String[] args) {
      
     	int farkInt=0;
     	int rakam_tersi = 0 ;
     	int rakam = 0 ;
     	String farkStr="";
     	int max = 5000000;
     	Integer[] DigerTersliSayilar = new Integer[7];
     	DigerTersliSayilar[0]=0;
     	DigerTersliSayilar[1]=1;
     	DigerTersliSayilar[2]=2;
     	DigerTersliSayilar[3]=5;
     	DigerTersliSayilar[4]=6;
     	DigerTersliSayilar[5]=8;
     	DigerTersliSayilar[6]=9;

     
      			for(int a=0;a<DigerTersliSayilar.length;a++){
      				for (int b=0;b<DigerTersliSayilar.length ;b++){
      					for(int c=0;c<DigerTersliSayilar.length ;c++){
      						for(int d=0;d<DigerTersliSayilar.length ;d++){
      							for(int e=0;e<DigerTersliSayilar.length;e++){
      								for(int f=0;f<DigerTersliSayilar.length;f++){
      									for(int g=0;g<DigerTersliSayilar.length;g++){
      							
      							
      								int rakamlar[] = {DigerTersliSayilar[a],DigerTersliSayilar[b],DigerTersliSayilar[c],DigerTersliSayilar[d],DigerTersliSayilar[e],DigerTersliSayilar[f],DigerTersliSayilar[g]} ;
      								
      								if(rakamlarfarklimi(rakamlar) == true )
      								{
      									rakam = 1000000*rakamlar[0]+100000*rakamlar[1]+10000*rakamlar[2]+1000*rakamlar[3]+100*rakamlar[4]+10*rakamlar[5]+rakamlar[6];
      								
      									for(int i=0 ; i < rakamlar.length ; i++ )
      									{
      										if(rakamlar[i] == 9)
      											rakamlar[i] = 6 ;
      										else	if(rakamlar[i] == 6)
      											rakamlar[i]= 9 ;
      										
      										
      									}
      									 rakam_tersi = 1000000*rakamlar[6]+100000*rakamlar[5]+10000*rakamlar[4]+1000*rakamlar[3]+100*rakamlar[2]+10*rakamlar[1]+rakamlar[0];
      							
      								}
      								
      							
  									
									
  									farkInt = Math.abs(rakam - rakam_tersi);
  									
  									farkStr = Integer.toString(farkInt);
  									if(!farkStr.contains("3") &&  !farkStr.contains("4") && !farkStr.contains("7")){
  										{
  											if (farkInt > max)
  												max = rakam  ;
  											
  										}
  									}
      							
      							}
      						}
      					}
      				}
      			}
      		}
      	}
      		
      			
      			System.out.println(max);
      			
      			
      	}
    }