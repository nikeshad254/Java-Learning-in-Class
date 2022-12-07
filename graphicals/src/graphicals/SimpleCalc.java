package graphicals;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class SimpleCalc extends JFrame {

	private JPanel mainFrame;
	private JTextField numOne;
	private JTextField numTwo;
	private JLabel lblSign;
	private JLabel lblAns;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalc frame = new SimpleCalc();
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
	public SimpleCalc() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainFrame = new JPanel();
		mainFrame.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainFrame);
		mainFrame.setLayout(null);
		
		numOne = new JTextField();
		numOne.setFont(new Font("Tahoma", Font.BOLD, 14));
		numOne.setBounds(8, 8, 30, 30);
		mainFrame.add(numOne);
		numOne.setColumns(10);
		
		numTwo = new JTextField();
		numTwo.setFont(new Font("Tahoma", Font.BOLD, 14));
		numTwo.setColumns(10);
		numTwo.setBounds(82, 8, 30, 30);
		mainFrame.add(numTwo);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number1 = Integer.parseInt(numOne.getText());
				int Number2 = Integer.parseInt(numTwo.getText());
				int ans = Number1 + Number2;
				lblAns.setText("=   "+ans);
				lblSign.setText("+");
			}
		});
		
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnPlus.setBounds(8, 64, 40, 40);
		mainFrame.add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number1 = Integer.parseInt(numOne.getText());
				int Number2 = Integer.parseInt(numTwo.getText());
				int ans = Number1 - Number2;
				lblAns.setText("=   "+ans);
				lblSign.setText("-");
			}
		});
		btnMinus.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMinus.setBounds(72, 64, 40, 40);
		mainFrame.add(btnMinus);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number1 = Integer.parseInt(numOne.getText());
				int Number2 = Integer.parseInt(numTwo.getText());
				int ans = Number1 * Number2;
				lblAns.setText("=   "+ans);
				lblSign.setText("X");
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnMultiply.setBounds(136, 64, 40, 40);
		mainFrame.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Number1 = Integer.parseInt(numOne.getText());
				int Number2 = Integer.parseInt(numTwo.getText());
				int ans = Number1 / Number2;
				lblAns.setText("=   "+ans);
				lblSign.setText("/");
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDivide.setBounds(202, 64, 40, 40);
		mainFrame.add(btnDivide);
		
		lblSign = new JLabel("");
		lblSign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSign.setBounds(56, 7, 28, 30);
		mainFrame.add(lblSign);
		
		lblAns = new JLabel("=  noOperation");
		lblAns.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAns.setBounds(136, 8, 106, 30);
		mainFrame.add(lblAns);
	}
}
