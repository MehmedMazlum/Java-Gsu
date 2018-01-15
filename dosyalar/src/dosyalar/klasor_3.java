package dosyalar;


import java.io.* ;


public class klasor_3 {
  //dosya yoksa yarat ve bilgi ver //  
    public static void main(String[] args) {
     
   try {
    
    File a = new File("C:\\Intel\\Logs\\zaza.txt");
     if(!a.exists())
    {
     a.createNewFile() ;
     System.out.println("Dosya adý="+a.getName());
     System.out.println("Path ="+a.getAbsolutePath());
     System.out.println("Bu bir klasör mü ="+a.isDirectory());
      System.out.println("Bu bir dosya mi ="+a.isFile());
     System.out.println("En son güncelleme ="+a.lastModified());
     System.out.println("Dosyanin büyüklüðü= "+a.length());
      System.out.println("Bu dosya gizli mi ="+a.isHidden());
     System.out.println("Bu dosya okunabilir mi  ="+a.canRead());
     System.out.println("Bu dosya yazilabilir mi ="+a.canWrite());
      System.out.println("Bu bir dosya mi ="+a.isFile());
     
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
