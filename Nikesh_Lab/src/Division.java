import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Division extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public Division() {
        setTitle("Integer Division Calculator");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel num1Label = new JLabel("Num1: ");
        add(num1Label);
        num1Field = new JTextField(10);
        add(num1Field);

        JLabel num2Label = new JLabel("Num2: ");
        add(num2Label);
        num2Field = new JTextField(10);
        add(num2Field);

        divideButton = new JButton("Divide");
        add(divideButton);

        JLabel resultLabel = new JLabel("Result: ");
        add(resultLabel);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    int result = num1 / num2;
                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid integers for Num1 and Num2.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Division();
    }
}
