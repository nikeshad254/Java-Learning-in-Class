import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginSimple {
	
	public static Boolean checkPass(char[] inPass) {
		boolean isCorrect = true;
		char[] correctPass = {'1', '2', '3'};
		
		if(inPass.length != correctPass.length) {
			isCorrect = false;
		}
		else {
			isCorrect = Arrays.equals(inPass, correctPass);
		}
		return isCorrect;
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		JLabel lbMail = new JLabel("UserName:");
		lbMail.setBounds(30, 30, 100, 20);
		
		JTextField tMail = new JTextField();
		tMail.setBounds(30, 50, 200, 20);
		
		JLabel lbPass = new JLabel("Enter your Pasword");
		lbPass.setBounds(30, 70, 100, 20);
		
		JPasswordField tPass = new JPasswordField();
		tPass.setBounds(30, 90, 200, 20);
		
		JButton btn = new JButton("submit");
		btn.setBounds(30, 130, 100, 20);
		
		JLabel lLoged = new JLabel();
		lLoged.setBounds(30, 160, 500, 20);
		
		
		frame.add(lbMail);
		frame.add(tMail);
		frame.add(lbPass);
		frame.add(tPass);
		frame.add(btn);
		frame.add(lLoged);
		
		btn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				char[] pass = tPass.getPassword();
				String mail = tMail.getText();
				if(mail.equals("me") && checkPass(pass)){
					
					JFrame lframe = new JFrame();
					lframe.setSize(400, 400);
					
					JLabel lbLogIn = new JLabel("welcome to dashboard");
					lbLogIn.setBounds(30, 30, 300, 20);
					
					
					lframe.add(lbLogIn);
					
					frame.dispose();
					lframe.setLayout(null);
					lframe.setVisible(true);
					
				}else {
					lLoged.setText("invalid ID and Password");
					
					
				}
			}
	});
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
