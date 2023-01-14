import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username: ");
        add(usernameLabel);
        usernameField = new JTextField(10);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        add(passwordLabel);
        passwordField = new JPasswordField(10);
        add(passwordField);

        loginButton = new JButton("Login");
        add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login successful!", "Info", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
