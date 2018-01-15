package son_ekler;

import java.awt.*;

import java.applet.*;

public class egim extends Applet {

	int x1 = 20, y1 = 20;

	Double r1 = new Double(361 * Math.random());

	Integer teta = new Integer(r1.intValue());

	int x2 = 0, y2 = 0;

	public void init() {

	}

	public void paint(Graphics g) {

		int x2 = (int) (x1 + 10 + 10 * Math.cos((2 * 3.14159 * teta) / 360));

		int y2 = (int) (y1 + 10 + 10 * Math.sin((2 * 3.14159 * teta) / 360));

		g.drawLine(0, 20, 200, 170);

		g.drawLine(200, 170, 500, 170);

		g.drawOval(x1, y1, 20, 20);

		g.drawLine(x1 + 10, y1 + 10, x2, y2);

		if (x1 <= 191) {

			teta += 30;

			x1 += 4;
			y1 += 3;

			x2 += 4;

			y2 += 3;

		}

		else {

			y1 = 150;

			x1 += 3;

			teta += 18;

		}

		if (x1 == 480) {

			x1 = 20;

			y1 = 20;

		}

		try {

			Thread.sleep(100);
		}

		catch (Exception e) {
		}

		repaint();

	}
}