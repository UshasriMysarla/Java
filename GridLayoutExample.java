import java.awt.*;
import java.awt.event.*;
public class GridLayoutExample {

	public GridLayoutExample() {
		// TODO Auto-generated constructor stub
		Frame f = new Frame("GridLayout Frame");
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		Button b6 = new Button("6");
		Button b7 = new Button("7");
		Button b8 = new Button("8");
		Button b9 = new Button("9");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.setLayout(new GridLayout(3,3));
		f.setSize(300,300);
		f.setVisible(true);
	
	f.addWindowListener(new WindowAdapter() {
		
		public void windowClosing(WindowEvent we) {
		System.exit(0);
		}
		});
	}
public static void main(String args[]) {
	GridLayoutExample bl = new GridLayoutExample();
}
	}


