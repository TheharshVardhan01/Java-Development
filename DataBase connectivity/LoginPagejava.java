package windowbuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPagejava extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, resetButton;
    private JPasswordField passwordField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LoginPagejava frame = new LoginPagejava();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LoginPagejava() {
    	getContentPane().setForeground(new Color(0, 0, 0));
    	getContentPane().setBackground(new Color(255, 255, 255));
        
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

       
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblUsername);
        
        passwordField_1 = new JPasswordField();
        getContentPane().add(passwordField_1);

       
        usernameField = new JTextField();
        usernameField.setForeground(new Color(192, 192, 192));
        getContentPane().add(usernameField);
        usernameField.setColumns(10);

        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblPassword);

     
        passwordField = new JPasswordField();
        passwordField.setColumns(10);
        getContentPane().add(passwordField);

        
        loginButton = new JButton("Login");
        loginButton.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(loginButton);

       
        resetButton = new JButton("Reset");
        resetButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
        resetButton.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(resetButton);

       
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
            }
        });
    }
}
