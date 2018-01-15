
 package applet_uygulamalari_vize_1;

import java.awt.*;
import java.applet.Applet;


 
 
 
 public class donen_merhaba_1 extends Applet {
 
 double teta = 0;
 
 String m = "M", e = "E", r = "R", h = "H", a = "A", b = "B" ;
 
  public void init() {
 setSize(500,300);
  setBackground(Color.ORANGE);
  }
  
  public void paint(Graphics g) {
 
  g.drawString(a, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 
  teta = teta + Math.PI/ 12;
 
  g.drawString(b, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 
  teta = teta + Math.PI/ 12;
 
  g.drawString(a, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 
  teta = teta + Math.PI/ 12;
 
 g.drawString(h, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 
 teta = teta + Math.PI/ 12;
 
 g.drawString(r, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 
 teta = teta + Math.PI/ 12;
 
 g.drawString(e, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 
 teta = teta + Math.PI/ 12;
 
g.drawString(m, 120 + (int)(Math.cos(teta) * 100), 120 + (int)(Math.sin(teta) * 100));
 

 
teta = teta + Math.PI/ 120 - Math.PI/ 2;
 
repaint();
 
try{
 
Thread.sleep(100);
 
}
 
catch(Exception e){
}
  }
 }
