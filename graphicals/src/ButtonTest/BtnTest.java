package ButtonTest;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BtnTest {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(400, 500);
		
		JLabel l = new JLabel("Username");
		l.setBounds(100, 50, 200, 40);
		j.add(l);
		
		JTextField t = new JTextField();
		t.setBounds(100, 90, 200, 30);
		j.add(t);
		
		JLabel pl = new JLabel("Password");
		pl.setBounds(100, 120, 200, 40);
		j.add(pl);
		
		JPasswordField jp = new JPasswordField();
		jp.setBounds(100, 150, 200, 40);
		j.add(jp);
		
		JLabel l1 = new JLabel();
		l1.setBounds(100, 250, 200, 40);
		j.add(l1);
		
		JButton b = new JButton("click Me");
		b.setBounds(140, 200, 100, 40);
		j.add(b);
		
		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String username = t.getText();
				String password = jp.getText();
				
				if(username.equals("test") && password.equals("test")) {
					//this.dashboard();
					new DashboardMenu();
					j.dispose();
				}else {
					JOptionPane.showMessageDialog(b,"login failed");
				}
					
				b.setBackground(new Color(0, 255, 0));
				b.setText("clicked");
			}

		});
		
		j.setLayout(null);
		j.setVisible(true);
	}


}
