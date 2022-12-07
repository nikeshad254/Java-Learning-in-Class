package graphicals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class inputNames extends JFrame {

	private JPanel contentPane;
	private JTextField txtFname;
	private JLabel lbWelcome;
	private JTextField txtLName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputNames frame = new inputNames();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inputNames() {
		setTitle("mainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbFirstName = new JLabel("First Name");
		lbFirstName.setBounds(8, 8, 186, 11);
		contentPane.add(lbFirstName);
		
		txtFname = new JTextField();
		txtFname.setBounds(8, 23, 86, 17);
		contentPane.add(txtFname);
		txtFname.setColumns(10);
		
		lbWelcome = new JLabel("");
		lbWelcome.setBounds(8, 90, 166, 11);
		contentPane.add(lbWelcome);
		
		JButton btnOK = new JButton("OK");
		btnOK.setBackground(new Color(0, 255, 0));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//left to code
				String fname = txtFname.getText();
				String lname = txtLName.getText();
				lbWelcome.setText("Welcome "+ fname +" "+ lname);
			}
		});
		btnOK.setBounds(8, 166, 79, 19);
		contentPane.add(btnOK);
		
		JLabel lbLastname = new JLabel("Last Name");
		lbLastname.setBounds(8, 48, 166, 11);
		contentPane.add(lbLastname);
		
		txtLName = new JTextField();
		txtLName.setBounds(8, 67, 86, 17);
		contentPane.add(txtLName);
		txtLName.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFname.setText("");
				txtLName.setText("");
				lbWelcome.setText("");
			}
		});
		btnReset.setBounds(95, 166, 79, 19);
		contentPane.add(btnReset);
	}
}
