import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exam10 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Password Field Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a panel to hold components
            JPanel panel = new JPanel();

            // Create labels, text fields, and password field
            JLabel usernameLabel = new JLabel("Username:");
            JLabel passwordLabel = new JLabel("Password:");

            JTextField usernameField = new JTextField(20);
            JPasswordField passwordField = new JPasswordField(20);

            // Create a button to display username and password
            JButton loginButton = new JButton("Login");
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText();
                    char[] passwordChars = passwordField.getPassword();
                    String password = new String(passwordChars);

                    // Display username and password (for demonstration purposes)
                    JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + password);

                    // Clear the password field after displaying
                    passwordField.setText("");
                }
            });

            // Add components to the panel
            panel.add(usernameLabel);
            panel.add(usernameField);
            panel.add(passwordLabel);
            panel.add(passwordField);
            panel.add(loginButton);

            // Add the panel to the frame
            frame.add(panel);

            // Set frame properties
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        });
    }
}
