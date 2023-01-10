import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class SimpleCalculator{
	private JButton[] buttons;
	private TextField inp1;
	private int num1 = 0;
	private int num2 = 0;
	private char optr = '+';
	private double result = 0;
	private boolean hasOpt = false;
	
	private String[] inpLbls = {
			"7", "8", "9",
            "4", "5", "6",
            "1", "2", "3",
            "0", "+", "-",
            "*", "/", "="};
	
	public void Calculate() {
		if(!hasOpt) {
			return;
		}
		if(optr == '+') {
			result = num1 + num2;
		}else if(optr == '-') {
			result = num1 - num2;
		}else if(optr == '*') {
			result = num1 * num2;
		}else if(optr == '/') {
			result = num1 / num2;
		}
		inp1.setText(num1 + " "+ optr + " "+ num2+ " = "+ result);
	}
	
	public SimpleCalculator() {
		JFrame jf = new JFrame();
		jf.setSize(400, 500);
		
		inp1 = new TextField();
		inp1.setBounds(10, 20, 350, 50);
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		inp1.setFont(font1);
		jf.add(inp1);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 3));
		panel.setBounds(10, 50, 350, 300);
		
		buttons = new JButton[inpLbls.length];
		
		for(int i=0; i<inpLbls.length; i++) {
			buttons[i] = new JButton(inpLbls[i]);
			panel.add(buttons[i]);
			buttons[i].addActionListener(new CalculatorAction());
		}
		
		
		jf.add(panel);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	 private class CalculatorAction implements ActionListener {
		 public void actionPerformed(ActionEvent e) {
			 
	         String command = e.getActionCommand();
	         //	System.out.println(command.charAt(0));
	         if(command.charAt(0) >= '0' && command.charAt(0) <= '9' && !hasOpt){
	        	 num1 = Integer.parseInt(command);
	        	 inp1.setText(num1 + " ");
	        	 
	         }else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' && hasOpt) {
				num2 = Integer.parseInt(command);
				inp1.setText(num1 + " "+ optr + " "+ num2);
			}
			else if(command.charAt(0) == '='){
				try {
					Calculate();
					
				} catch (Exception e1) {

					inp1.setText(num1 + " "+ optr + " "+ num2+ " = INVALID");
					
				} finally {
					num2 = 0;
					hasOpt = false;
				}
			}
			else {
				optr = command.charAt(0);
				hasOpt = true;
				inp1.setText(num1 + " "+ optr + " ");
			}
 
		 }
	 }
	

	public static void main(String[] args) {
			SimpleCalculator sc = new SimpleCalculator();

	}
}