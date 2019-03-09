package pck;

import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class Apple extends JApplet {

	/**
	 * Create the applet.
	 */
	public Apple() {
		
		JLabel lblNewLabel = new JLabel("Hello world");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);

	}

}
