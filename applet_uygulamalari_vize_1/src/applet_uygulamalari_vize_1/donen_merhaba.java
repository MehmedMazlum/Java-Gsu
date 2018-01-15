package applet_uygulamalari_vize_1;

import java.awt.* ;
import java.applet.Applet ;

/* kendi donen merhaba m */
public class donen_merhaba extends Applet   {

	String m ="M" ;
	String e ="E" ;
	String r ="R" ;
	String h ="H" ;
	String a ="A" ;
	String b ="B" ;
	String c ="A" ;

	int x = 150 ;
	int y = 150 ;
	int q = 150 ;
	int t = 160 ;
	int u = 170  ;
	int v = 180 ;
	int o = 190 ;
	int z = 200  ;
	int g = 210 ;
	int kk = 150 ;
	int yy = 150 ;
	int ky = 150 ;
	int yk = 150 ;
	int gy = 150 ;
	
	
	public void init()
	{
		setSize(500,300) ;
	}
	
	public void paint(Graphics p)
	{
		//Font tt = new Font("Times New Roman", Font.PLAIN,10);
		//p.setFont(tt);
		p.fillRect(150, 150, 100, 50);
		
		p.drawString(m , x, y);
		p.drawString(e,t , q);
		p.drawString(r,u , kk);
		p.drawString(h,v , yy);
		p.drawString(a,o , ky);
		p.drawString(b,z , yk);
		p.drawString(c,g , gy);
		
		if (x <= 250 && y == 150 )
		x = x + 10 ;
		if (x == 250 && y >= 150)
		y = y + 10 ;
		if (x >= 150 && y == 210 )
		x = x - 10 ;
		if ( x == 140 && y >= 150 )
		y = y - 10 ;
		
		if (t <= 250 && q == 150 )
		t = t + 10 ;
		if (t == 250 && q >= 150)
		q = q + 10 ;
		if (t >= 150 && q == 210 )
		t = t - 10 ;
		if ( t == 140 && q >= 150 )
		q = q - 10 ;
		
		if (u <= 250 && kk == 150 )
		u = u + 10 ;
		if (u == 250 && kk >= 150)
		kk = kk + 10 ;
		if (u >= 150 && kk == 210 )
		u = u - 10 ;
		if ( u == 140 && kk >= 150 )
		kk = kk - 10 ;
		
		if (v <= 250 && yy == 150 )
		v = v + 10 ;
		if (v == 250 && yy >= 150)
		yy = yy + 10 ;
		if (v >= 150 && yy == 210 )
		v = v - 10 ;
		if ( v == 140 && yy >= 150 )
		yy = yy - 10 ;
		
		if (o <= 250 && ky == 150 )
		o = o + 10 ;
		if (o == 250 && ky >= 150)
		ky = ky + 10 ;
		if (o >= 150 && ky == 210 )
		o = o - 10 ;
		if ( o == 140 && ky >= 150 )
		ky = ky - 10 ;
		
		if (z <= 250 && yk == 150 )
		z = z + 10 ;
		if (z == 250 && yk >= 150)
		yk = yk + 10 ;
		if (z >= 150 && yk == 210 )
		z = z - 10 ;
		if ( z == 140 && yk >= 150 )
		yk = yk - 10 ;
		
		if (g <= 250 && gy == 150 )
		g = g + 10 ;
		if (g == 250 && gy >= 150)
		gy = gy + 10 ;
		if (g >= 150 && gy == 210 )
		g = g - 10 ;
		if ( g == 140 && gy >= 150 )
		gy = gy - 10 ;
		
		
		
		try
		  {
		   Thread.sleep(1000) ;
		  }
		  catch (Exception  e) {} 
		
		repaint() ;
		}
	

}
