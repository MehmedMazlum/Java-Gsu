package son_ekler;

import java.awt.*;
import java.applet.Applet;

public class deneme_carsamba extends Applet {

	public void init()

	{

		setBackground(Color.yellow);

	}

	public void paint(Graphics t)

	{

		t.fillArc(475, 230, 150, 100, 60, 270);

		int x[] = { 20, 30, 120, 200, 250, 450 };

		int y[] = { 60, 120, 200, 300, 200, 50 };

		Polygon a = new Polygon(x, y, 6);

		t.drawPolygon(a);

		Cursor b;

		b = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);

		setCursor(b);

	}

}
