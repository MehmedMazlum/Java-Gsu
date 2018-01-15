package applet_uygulamalari_vize_1;



import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class vize_2 extends Applet implements MouseListener,MouseMotionListener {
  
	int x[]=new int[30000];
	int y[]=new int[30000];
	int k=0;
	Point a,b;


	public void init() {
addMouseListener(this);
addMouseMotionListener(this);


	}

  


public void mouseMoved(MouseEvent e){
}


public void mousePressed(MouseEvent e){
}
public void mouseDragged(MouseEvent e){
	b=e.getPoint();
	Graphics p=getGraphics();
	p.setColor(Color.red);
	if(a!=null) 
		p.drawLine(a.x,a.y,b.x,b.y);
	
	x[k]=b.x;
	y[k]=b.y;
	k++;
	a=b; 
}
public void mouseReleased(MouseEvent e){
	Graphics p=getGraphics();
	p.setColor(Color.black);
	for(int i=0;i<k-1;i++)
		p.drawLine(x[i],y[i],x[i+1],y[i+1]);
		k=0;
		a=null; 
}
public void mouseClicked(MouseEvent e){
}
public void mouseEntered(MouseEvent e){
}
public void mouseExited(MouseEvent e){
}




}
