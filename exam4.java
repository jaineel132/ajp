import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exam4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a menu bar
            JMenuBar menuBar = new JMenuBar();

            // Create a menu
            JMenu fileMenu = new JMenu("File");

            // Create menu items
            JMenuItem openItem = new JMenuItem("Open");
            JMenuItem saveItem = new JMenuItem("Save");
            JMenuItem exitItem = new JMenuItem("Exit");

            // Add menu items to the menu
            fileMenu.add(openItem);
            fileMenu.add(saveItem);
            fileMenu.addSeparator(); // Separator between Save and Exit
            fileMenu.add(exitItem);

            // Add an ActionListener to handle menu item clicks
            openItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Open menu item clicked");
                }
            });

            saveItem.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "Save menu item clicked");
                }
            });

            exitItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            // Add the menu to the menu bar
            menuBar.add(fileMenu);

            // Set the menu bar for the frame
            frame.setJMenuBar(menuBar);

            // Set frame properties
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
