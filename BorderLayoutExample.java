import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class BorderLayoutExample {

BorderLayoutExample() {
		// TODO Auto-generated constructor stub
				JFrame f = new JFrame("BorderLayout Frame");
				JButton b1 = new JButton("NORTH");
				JButton b2 = new JButton("SOUTH");
				JButton b3 = new JButton("EAST");
				JButton b4 = new JButton("WEST");
				JButton b5 = new JButton("CENTER");
				f.setLayout(new BorderLayout(10,10));
				f.add(b1,BorderLayout.NORTH);
				f.add(b2,BorderLayout.SOUTH);
				f.add(b3,BorderLayout.EAST);
				f.add(b4,BorderLayout.WEST);
				f.add(b5,BorderLayout.CENTER);
				f.setSize(300,300);
				f.setVisible(true);
				f.addWindowListener(new WindowAdapter() {
					
					public void windowClosing(WindowEvent we) {
					System.exit(0);
					}
					});
			}
	public static void main(String args[]) {
		BorderLayoutExample bl = new BorderLayoutExample();
	}
		}