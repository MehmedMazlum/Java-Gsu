
import java.util.Scanner ; 

public class main_main {
   
    public static void main(String[] args) {
     
     // TODO, add your application code
     Scanner bilgi = new Scanner (System.in) ;
      System.out.println("bir string giriniz");
      String a = bilgi.next();
      romen_sayiya_cevirme k=new romen_sayiya_cevirme();
     
      k.islem( a);
     bilgi.close();
     
    }
}