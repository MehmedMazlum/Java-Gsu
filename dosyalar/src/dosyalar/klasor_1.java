package dosyalar;
// içerik deðiþtirme  SAVE//
import java.io.* ;

public class klasor_1 {
    
    public static void main(String[] args) {
     
   try {
    
    FileOutputStream a = new FileOutputStream("C:\\Intel\\Logs\\sasa.txt");
    PrintWriter b = new PrintWriter(a) ;
    String yazi = "ibne" ;
    b.println(yazi);
    b.close();
    
   }
       catch(Exception e )
   {
    System.out.println("Böyle bir dosya yok !");
    }
    }
}