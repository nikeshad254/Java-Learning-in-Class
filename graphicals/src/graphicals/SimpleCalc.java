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
import java.awt.GridLayout;

public class SimpleCalc extends JFrame {

	private JPanel mainFrame;
	private JTextField numOne;
	private JTextField numTwo;
	private JLabel lblSign;
	private JLabel lblAns;
	private JLabel label;
	
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
		mainFrame.setLayout(new GridLayout(0, 4, 0, 0));
		
		lblSign = new JLabel("");
		lblSign.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mainFrame.add(lblSign);
		
		numOne = new JTextField();
		numOne.setText("none");
		numOne.setFont(new Font("Tahoma", Font.BOLD, 14));
		mainFrame.add(numOne);
		numOne.setColumns(20);
		
		lblAns = new JLabel("=  noOperation");
		lblAns.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mainFrame.add(lblAns);
		
		label = new JLabel("");
		mainFrame.add(label);
		
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
		mainFrame.add(btnDivide);
		
		numTwo = new JTextField();
		numTwo.setFont(new Font("Tahoma", Font.BOLD, 14));
		numTwo.setColumns(10);
		mainFrame.add(numTwo);
	}
}
