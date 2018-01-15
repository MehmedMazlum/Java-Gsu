package object_oriented_1;

import java.awt.*; 
import java.applet.*;  
import java.awt.event.*; 

public class applet_5 extends Applet implements MouseListener 
{ 

int xpos; 
int ypos; 
int rect1xco,rect1yco,rect1width,rect1height; 
boolean mouseEntered; 
boolean rect1Clicked; 

 public void init()  
 {  
  rect1xco = 20; 
  rect1yco = 20; 
  rect1width = 100; 
  rect1height = 50; 

  addMouseListener(this); 
 } 

 public void paint(Graphics g)  
 { 
g.setColor(Color.green); 
g.fillRect(rect1xco,rect1yco,rect1width,rect1height); 
g.setColor(Color.red); 
g.drawString("("+xpos+","+ypos+")",xpos,ypos); 

  if (rect1Clicked) 
	  g.drawString("You clicked in the Rectangle",20,120); 
  else 
	  g.drawString("You clicked outside of the rectangle",20,120); 

  if (mouseEntered) 
	  g.drawString("Mouse is in the applet area",20,160); 
  else 
	  g.drawString("Mouse is outside the Applet area",20,160); 
 } 

 public void mouseClicked (MouseEvent me) { 

  xpos = me.getX(); 
  ypos = me.getY(); 
 
  if (xpos > rect1xco && xpos < rect1xco+rect1width && ypos >rect1yco &&  
    ypos < rect1yco+rect1height)  rect1Clicked = true; 

  else  
   rect1Clicked = false; 

  repaint(); 

 } 
 
 public void mousePressed (MouseEvent me) {} 

 public void mouseReleased (MouseEvent me) {}  

 public void mouseEntered (MouseEvent me) { 
 
  mouseEntered = true; 
  repaint(); 
 } 

 public void mouseExited (MouseEvent me) {  
  mouseEntered = false; 
  repaint(); 
 }  

} 
