package son_ekler;


import java.awt.*;
import java.applet.Applet ;
import java.awt.event.* ;

public class checkbox extends Applet implements ItemListener  {
 
 String mesaj ;
 CheckboxGroup r ;
 Choice secim ;
  
 public void init() {
  setBackground(Color.yellow) ;
  
  r = new CheckboxGroup() ;
  Checkbox r1 = new Checkbox ("Evet",r,true) ;
  Checkbox r2 = new Checkbox ("Hayir", r, false) ;
   
  r1.addItemListener(this) ;
  r2.addItemListener(this) ;
  add(r1) ;
  add(r2) ;
  
  secim = new Choice () ;
  secim.addItem("Akbank");
   secim.addItem("Garanti Bankasi");
     secim.addItem("Vakýf Bank");
     secim.addItem("Ziraat Bankasi");
     
  secim.addItemListener(this) ;
  add(secim) ;
 
 
 }

 public void paint(Graphics g) {
  Font tt = new Font ("Times New Roman", Font.PLAIN, 17) ;
   g.setFont(tt);
  g.drawString(mesaj, 100, 100 );
  
 }
 
 public void itemStateChanged(ItemEvent e )
 {
  mesaj = r.getSelectedCheckbox().getLabel() ;
  if (e.getSource() == secim )
   mesaj =  secim.getSelectedItem() ;
    repaint() ;
 }
 
}
