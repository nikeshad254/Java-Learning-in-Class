package ButtonTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxTest implements ActionListener{
	JLabel l;
	JComboBox cb;
	
	public ComboBoxTest() {
		JFrame f = new JFrame("combo box example");
		
		String[] sports = {"Football", "VolleyBall", "Golf", "Hockey"};
		
		cb = new JComboBox(sports);
		cb.setBounds(50, 60, 90, 20);
		f.add(cb);
		
		JButton btn = new JButton("Click");
		btn.setBounds(50, 90, 90, 20);
		f.add(btn);
		
		btn.addActionListener(this);
		
		l = new JLabel();
		l.setBounds(50, 150, 200, 20);
		f.add(l);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxTest();

	}
	
	public void actionPerformed(ActionEvent e) {
		l.setText("clicked value is:  "+ cb.getItemAt(cb.getSelectedIndex()));
	}

}
