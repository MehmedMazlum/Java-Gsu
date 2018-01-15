package dosyalar;

import java.io.* ;


public class klasor_4 {
    
    public static void main(String[] args) {
     
   try {
    
    //File a = new File("yeni");
    File a = new File("C:\\Documents and Settings\\Administrator\\Desktop\\yeni");
     if(!a.exists())
    {
     a.mkdir() ;
     System.out.println("Yaratilan klasorun ismi ="+a.getName());
    }
    else
     System.out.println("Bu klasor zaten var !");
   }
    catch(Exception e )
   {
    System.out.println("Beklenmedik bir problem olustu");
   }
    }
}
