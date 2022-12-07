package ButtonTest;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class RadioBtnTest extends JFrame implements ActionListener{
	
	JFrame f;
	JLabel l;
	JRadioButton male;
	JRadioButton female;
	
	
	public RadioBtnTest() {
		f = new JFrame();
		f.setSize(400, 500);
		
		l = new JLabel("Select Gender");
		l.setBounds(100, 30, 200, 30);
		f.add(l);
		
		male = new JRadioButton("Male");
		male.setBounds(100, 50, 200, 30);
		f.add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(100, 80, 200, 30);
		f.add(female);
		
		ButtonGroup g = new ButtonGroup();
		g.add(male);
		g.add(female);
		
		JButton btn = new JButton("click");
		btn.setBounds(100, 110, 80, 40);
		f.add(btn);
		
		btn.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new RadioBtnTest();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(male.isSelected()) {
			JOptionPane.showMessageDialog(f, "male is selected");
		}
		if(female.isSelected()) {
			JOptionPane.showMessageDialog(f, "female is selected");
		}
	}

}
