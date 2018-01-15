package son_ekler;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.print.*;

public class note_pad implements WindowListener, ActionListener, Printable

{

	GridBagLayout a = new GridBagLayout();

	GridBagConstraints b = new GridBagConstraints();

	Frame frame;

	Panel panel;

	TextArea ta;

	TextField tf;

	Button neww, load, save, print, close;

	public note_pad(String title)

	{

		frame = new Frame(title);

		panel = new Panel();

	}

	public void pencereolustur()

	{

		panel.setLayout(a);

		b.fill = GridBagConstraints.BOTH;

		b.insets = new Insets(3, 3, 3, 3);

		b.gridx = 0;

		b.gridy = 0;

		b.gridwidth = 5;

		b.gridheight = 1;

		ta = new TextArea(15, 35);

		a.setConstraints(ta, b);

		panel.add(ta);

		b.gridx = 0;

		b.gridy = 1;

		b.gridwidth = 5;

		b.gridheight = 1;

		tf = new TextField(35);

		a.setConstraints(tf, b);

		panel.add(tf);

		b.gridx = 0;

		b.gridy = 2;

		b.gridwidth = 1;

		b.gridheight = 1;

		neww = new Button("NEW");

		a.setConstraints(neww, b);

		neww.addActionListener(this);

		panel.add(neww);

		b.gridx = 1;

		b.gridy = 2;

		b.gridwidth = 1;

		b.gridheight = 1;

		load = new Button("LOAD");

		a.setConstraints(load, b);

		load.addActionListener(this);

		panel.add(load);

		b.gridx = 2;

		b.gridy = 2;

		b.gridwidth = 1;

		b.gridheight = 1;

		save = new Button("SAVE");

		a.setConstraints(save, b);

		save.addActionListener(this);

		panel.add(save);

		b.gridx = 3;

		b.gridy = 2;

		b.gridwidth = 1;

		b.gridheight = 1;

		print = new Button("PRINT");

		a.setConstraints(print, b);

		print.addActionListener(this);

		panel.add(print);

		b.gridx = 4;

		b.gridy = 2;

		b.gridwidth = 1;

		b.gridheight = 1;

		close = new Button("CLOSE");

		a.setConstraints(close, b);

		close.addActionListener(this);

		panel.add(close);

		frame.setLocation(500, 350);

		frame.setBackground(Color.blue);

		frame.setSize(500, 500);

		Rectangle r = new Rectangle(500, 500);

		frame.setMaximizedBounds(r);

		frame.add(panel);

		frame.pack();

		frame.addWindowListener(this);

		frame.setVisible(true);

	}

	public static void main(String args[])

	{

		note_pad g = new note_pad("NOTEPAD");

		g.pencereolustur();

	}

	public int print(Graphics g, PageFormat pf, int sf)

	{

		if (sf != 0)
			return NO_SUCH_PAGE;

		return PAGE_EXISTS;

	}

	public void actionPerformed(ActionEvent e)

	{

		try

		{

			if (e.getActionCommand().equals("LOAD"))

			{

				String adres = tf.getText();

				FileReader a = new FileReader(adres);

				BufferedReader b = new BufferedReader(a);

				String text = b.readLine();

				String quoi = "";

				while (text != null)

				{

					quoi = quoi + text;

					text = b.readLine();

				}

				ta.setText(quoi);

			}

			if (e.getActionCommand().equals("PRINT"))

			{

				PrinterJob islem = PrinterJob.getPrinterJob();

				islem.setPrintable(new Printable()

				{

					@Override
					public int print(Graphics g, PageFormat pf, int sf)

					throws PrinterException

					{

						if (sf != 0)
							return Printable.NO_SUCH_PAGE;

						String s = ta.getText();

						g.drawString(s, 100, 100);

						return Printable.PAGE_EXISTS;

					}

				});

				if (islem.printDialog())
					islem.print();

			}

			if (e.getActionCommand().equals("CLOSE"))

			{

				ta.setText(" ");

				tf.setText(" ");

			}

			if (e.getActionCommand().equals("NEW"))

			{

			}

			if (e.getActionCommand().equals("SAVE"))

			{

				String adres = tf.getText();

				FileOutputStream st = new FileOutputStream(adres);

				PrintWriter pw = new PrintWriter(st);

				pw.print(ta.getText());

				pw.close();

			}

		}

		catch (Exception h) {
		}

	}

	public void windowClosing(WindowEvent e)

	{

		System.exit(0);

	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

}