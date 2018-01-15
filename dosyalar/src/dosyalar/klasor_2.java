package dosyalar;


import java.io.* ;


public class klasor_2 {
    
    public static void main(String[] args) {
     
   try {
    
    File a = new File("C:\\Intel\\Logs\\zaza");
    if(!a.exists() && a.isDirectory() )
     {
     String[] b = a.list() ;
     for(int i = 0 ; i<b.length;i++)
      System.out.println(b[i]);
     
    } 
     else
     {
      System.out.println("Böyle bir klasör yok !");
      }
   }
   catch(Exception e )
   {
    System.out.println("Beklenmedik bir problem olustu");
   }
    }
}
