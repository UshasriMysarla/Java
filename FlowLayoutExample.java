import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FlowLayoutExample {

	public FlowLayoutExample() {
		// TODO Auto-generated constructor stub
		Frame f = new Frame("FlowLayout Frame");
		Button b1 = new Button("Sunday");
		Button b2 = new Button("Monday");
		Button b3 = new Button("Tuesday");
		Button b4 = new Button("Wednesday");
		Button b5 = new Button("Thrusday");
		Button b6 = new Button("Friday");
		Button b7 = new Button("Saturday");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		f.setSize(300,300);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent we) {
			System.exit(0);
			}
			});
	}
public static void main(String args[]) {
	FlowLayoutExample bl = new FlowLayoutExample();
}
	}


