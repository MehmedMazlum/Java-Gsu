package konsol_uygulamalari_vize_1;


import java.util.Scanner;
public class sifreli_merhaba {
    public static void main(String[] args) {
       int i=0,j=0,count=1,count2=0;
       String rep,mesaj;
       boolean islemYap=false;
       String alfabe = "ABCÇDEFGÐHIÝÜJKLMNOÖPRSÞTUÜVYZ";
       char [][]kelMat= new char[7][4];
       String sifre = "niýzaeixsdrxutaoükdubasygilr"; 
       Scanner scan = new Scanner(System.in);
       mesaj = "MERHABA";
       int [] key = new int[7];
       for(i=0;i<29;i++){
       	String comp = alfabe.substring(i,i+1);
       	for(j=0;j<7;j++){
       		String keyH = mesaj.substring(j,j+1);
       		if(comp.equals(keyH)){
       			key[j]=count;
       			count++;
       		}
       	}
       }
       for(i=0;i<7;i++){
       	System.out.print(""+key[i]);
       }
       System.out.println("");
       count =1;
       while(count<=7){
       		for(i=0;(!islemYap)&&i<7;i++){
       			if(count == key[i]){
       				count++;
       				j=i;
       				islemYap=true;
       			}
       		}
       		if(islemYap){
       			for(i=0;i<4;i++){
       				kelMat[j][i] = (sifre.substring(count2+i,count2+1+i)).charAt(0);
       				System.out.print(""+kelMat[j][i]);
       			}
       			System.out.println("");
       			count2+=4;
       			islemYap=false;
       		}
       }
       for(i=0;i<4;i++){
       	for(j=0;j<7;j++)
       		System.out.print(""+kelMat[j][i]);
       		System.out.println();
       	
       }
    }
}