package final_icin_uygulamalar;

import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class soru_engin_2 extends Applet{
	double angle,basx,basy,sonx,sony,centerx,centery,radius,radian,speed;
	boolean inside,control;
	Label lbl;
	
	public void init(){
	    angle=Math.PI/6;
	    centerx=100;
	    centery=100;
	    radius=40;
		    inside=false;
		    control=false;
	    sonx=0;
	    sony=0;
	    
	    basx=sonx+100*Math.cos(angle);
	    basy=sony+100*Math.sin(angle);
	    
	    speed=10;	    
	}
	
	public void check(int region){
		double x,y;
		control=false;
		if(region==1 || region==4){
			for(x=sonx;x<=basx;x++){
				y=sony+(x-sonx)*Math.tan(angle);
				
				if(((centerx+radius-x)*(centerx+radius-x)+(centery+radius-y)*(centery+radius-y))<radius*radius){
					control=true;
				}					
			}
		}else if(region==2 || region==3){
			for(x=sonx;x>=basx;x--){
				y=sony+(x-sonx)*Math.tan(angle);
				
				if(((centerx+radius-x)*(centerx+radius-x)+(centery+radius-y)*(centery+radius-y))<radius*radius){
					control=true;
				}
			}
		}
		if(control==true) inside=true;
		else inside=false;
	}
	
	public void paint(Graphics p){
		p.drawOval((int)centerx,(int)centery,2*(int)radius,2*(int)radius);
		p.drawLine((int)basx,(int)basy,(int)sonx,(int)sony);
		
		if(Math.cos(angle)>0 && Math.sin(angle)>0) check(1);
		else if(Math.cos(angle)<0 && Math.sin(angle)>0) check(2);
		else if(Math.cos(angle)<0 && Math.sin(angle)<0) check(3);
		else if(Math.cos(angle)>0 && Math.sin(angle)<0) check(4);
		
		if(basx>=500){
			angle=Math.PI-angle;
				sonx=basx;
				sony=basy;
			basx=sonx+100*Math.cos(angle);
			basy=sony+100*Math.sin(angle);
		}else if(basx<=0){
			angle=Math.PI-angle;
				sonx=basx;
				sony=basy;
			basx=sonx+100*Math.cos(angle);
			basy=sony+100*Math.sin(angle);	
		}else if(basy>=300){
			angle=-angle;
				sonx=basx;
				sony=basy;
			basx=sonx+100*Math.cos(angle);
			basy=sony+100*Math.sin(angle);			
				
		}else if(basy<=0){
			angle=-angle;
				sonx=basx;
				sony=basy;				
			basx=sonx+100*Math.cos(angle);
			basy=sony+100*Math.sin(angle);	
		}
		
		if(inside==true) {
			speed=20;
			setBackground(Color.yellow);
		}
		else {
			setBackground(Color.white);
			speed=50;
		}
		
		basx+=speed*Math.cos(angle);
		basy+=speed*Math.sin(angle);
		sonx+=speed*Math.cos(angle);
		sony+=speed*Math.sin(angle);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		repaint();
	}
		
}