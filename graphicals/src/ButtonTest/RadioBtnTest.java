package ButtonTest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioBtnTest {
	
	JFrame f;
	public RadioBtnTest() {
		f = new JFrame();
		f.setSize(400, 500);
		
		JLabel l = new JLabel("Select Gender");
		l.setBounds(100, 30, 200, 30);
		f.add(l);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(100, 50, 200, 30);
		f.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(100, 80, 200, 30);
		f.add(female);
		
		JButton btn = new JButton("click");
		btn.setBounds(100, 110, 80, 40);
		f.add(btn);
		
		
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new RadioBtnTest();
		
	}

}
