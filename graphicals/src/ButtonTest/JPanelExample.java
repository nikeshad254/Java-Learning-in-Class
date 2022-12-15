package ButtonTest;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelExample{

	public JPanelExample() {
		JFrame f = new JFrame("Jpanel Example");
		f.setSize(400, 400);
		
		JPanel jp = new JPanel();
		jp.setBounds(50, 50, 300, 250);
		jp.setBackground(Color.gray);
		
		JButton btn1 = new JButton("Reset");
		btn1.setBounds(10, 80, 50, 50);
		btn1.setBackground(Color.pink);
		jp.add(btn1);
		
		JButton btn2 = new JButton("Submit");
		btn2.setBounds(10, 80, 50, 50);
		btn2.setBackground(Color.green);
		jp.add(btn2);
		
		f.add(jp);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JPanelExample();
	}

}
