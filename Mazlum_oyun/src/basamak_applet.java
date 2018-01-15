
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class basamak_applet extends Applet implements ActionListener 
{
	 int min=1023,max=9876,n,m,sonuc=0,q=0,w=0,t=0,r=0,j=0,k=0,l=0,o=0,d=0,z=0,y=0,i=0,aa=0;
	 int range= (max-min)+1 ;
	 int c[]=new int[4];
	 int f[]=new int[4];
	 String mesaj;
     String s1 ="Sonuc:";
     String s2 ="Random sayi:";
	Button a;
	TextField b;

	public void init() 
	{
		setBackground(Color.green);
		a=new Button ("OK");
		b=new TextField(20);
		add(b);
		b.setText("Sayinizi giriniz");       
		a.addActionListener(this);
        add(a);
	}

	public void paint(Graphics g) 
	{
		if((z==-1)||(aa==-1))
		{
			g.drawString("Rakamlari farkli 1023 ile 9876 arasinda bir sayi giriniz !",30,280);
		}
		else
		{	
        
		g.drawString(""+s1+""+sonuc,200,150);
		g.drawString(""+s2+" "+n,480,150);
		}
			
	}
	 public void actionPerformed(ActionEvent e)
	 {
	 	
	 	String s=e.getActionCommand();
	 	  if(s.equals("OK"))
          {
	 		  
			  do
			  {
			   n=(int)(Math.random() * range) + min;
			   q=n/1000;
			   w=(n/100)%10;
			   r=(n/10)%10;
			   t=n%10;
			   c[3]=q;c[2]=w;c[1]=r;c[0]=t;
			   
			  }
			   while(!((q!=w)&&(q!=r)&&(q!=t)&&(w!=r)&&(w!=t)&&(r!=t)));
			  
			  try{
			      
				    
				       mesaj=b.getText();
				       d=Integer.valueOf(mesaj);
			   		   j=d/1000;
					   k=(d/100)%10;
					   l=(d/10)%10;
					   o=d%10;
					   f[3]=j;f[2]=k;f[1]=l;f[0]=o;
				     
				     
				    if((!((j!=k)&&(j!=l)&&(j!=o)&&(k!=l)&&(k!=o)&&(l!=o)))||(d<1023)||(d>9876))
				    {
				    	aa=-1;
				    }
				    
				     
				     for(i=0;i<4;i++)
				     {
				    	 if(c[i]==f[i])
				    	 {
				    		 sonuc+=1;
				    	 }
				    	 else
				    	 {
				    		 y=i;
				    		 for(y=i+1;y<4;y++)
				    		 {
				    			 if(c[y]==f[i])
				    			 {
				    				 sonuc-=1;
				    			 }
				    			 else
				    			 {
				    				 sonuc+=0;
				    			 }
				    		 }
				    		 for(y=i-1;y>=0;y--)
				    		 {
				    			 if(c[y]==f[i])
				    			 {
				    				 sonuc-=1;
				    			 }
				    			 else
				    			 {
				    				 sonuc+=0;
				    			 }
				    		 }
				    	 }
				     }
				     
				     
				     
				  }
		      catch(Exception h)
		         {
		    	  z=-1;
		         }
	           repaint();
	 	  }
	 }
}