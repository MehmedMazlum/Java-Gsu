package ucak_savar;



import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class ucak_savar_2 extends Applet implements KeyListener{


 Double c=new Double(450*Math.random());
  int silah_x1=c.intValue();
  Double d;
  int teta;
  int silah_cubuk_x=silah_x1+30,silah_cubuk_y=210;
  int bayrak1=0,k2=1;
  int hedef_x=0;
  int flag1=1;


 public void init() {
    
	 do{
  d=new Double(175*Math.random()+2);
  teta=d.intValue();
  }while(teta%5!=0);
  
	 setSize(500,300);
	 addKeyListener(this);
  setBackground(Color.green);
 }


 public void paint(Graphics g) {
 	g.drawRect(hedef_x,10,100,30);
 	if(flag1==1){
 	hedef_x=hedef_x+2;


 	if(hedef_x==500)
 	hedef_x=0;
 	}
if(teta>90&&teta<180){
if(silah_cubuk_x>hedef_x-10 && silah_cubuk_x<hedef_x+10 && silah_cubuk_y>10 && silah_cubuk_y<40){
flag1=0;
}
}


if(teta>0&&teta<90){
if(silah_cubuk_x>hedef_x && silah_cubuk_x<hedef_x+110 && silah_cubuk_y>10 && silah_cubuk_y<40){
flag1=0;
bayrak1=0;
}
}


  g.drawLine(0,280,500,280);
  g.fillRect(silah_x1,250,30,30);
  if(k2==1){
  silah_cubuk_x=silah_x1+15+(int)(40*Math.cos(teta*2*3.1419/360));
  silah_cubuk_y=250-(int)(40*Math.sin(teta*2*3.1419/360));
  g.drawLine(silah_x1+15,250,silah_cubuk_x,silah_cubuk_y);
  }


  g.fillOval(silah_cubuk_x,silah_cubuk_y,10,10);
  if(bayrak1==1){
  if(teta>=90 && teta<=180){
  silah_cubuk_x=silah_cubuk_x+(int)(5*Math.cos(teta*2*3.1419/360));// cos �ift fonk oldugundan araya + koyduk
  silah_cubuk_y=silah_cubuk_y-(int)(5*Math.sin(teta*2*3.1419/360));
  }
  if(teta>=0 && teta<90){
  silah_cubuk_x=silah_cubuk_x+(int)(5*Math.cos(teta*2*3.1419/360));
  silah_cubuk_y=silah_cubuk_y-(int)(5*Math.sin(teta*2*3.1419/360));
  }
  }
if(silah_cubuk_y<0 || (silah_cubuk_x<0 || silah_cubuk_x>500) ){
bayrak1=0;
k2=1;
}


  try{
Thread.sleep(200);
}
catch(Exception e){};


  repaint();
 }


public void keyPressed(KeyEvent e){
 int tus=e.getKeyCode();
 switch(tus)
 {
  case(KeyEvent.VK_UP): bayrak1=1; k2=0;
 
  break;
  case(KeyEvent.VK_LEFT):if(teta<=175) teta=teta+5;

  break;
  case(KeyEvent.VK_RIGHT):if(teta>=5)	teta=teta-5;
  
   break;
  }
  repaint(); 
 }


public void keyTyped(KeyEvent e){
 }


public void keyReleased(KeyEvent e){
 }


}

