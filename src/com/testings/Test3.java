package com.testings;
import java.awt.*;
import java.applet.*;
@SuppressWarnings("serial")
public class Test3 extends Applet {
	public void paint(Graphics g) {
		this.setSize(new Dimension(2000, 1000));
		setBackground(Color.RED);
		Font font = new Font("Dialog", Font.BOLD, 111);
		g.setFont(font);
		g.setColor(Color.YELLOW);
		String message = " SAMPIYON GALATASARAY!!!";
		g.drawString(message, 125, 525);
	}
}