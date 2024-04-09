import javax.swing.*;

public class exam9 {

    exam9() {
        JFrame frame = new JFrame("Employee Table Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create column names
        String[] colheads = { "Employee ID", "Name", "Position", "Salary" };

        // Create data for the table
        Object[][] data = {
                { 1, "John Doe", "Manager", 50000.0 },
                { 2, "Jane Smith", "Developer", 45000.0 },
                { 3, "Bob Johnson", "Designer", 40000.0 },
                { 4, "Alice Williams", "Tester", 42000.0 },
                { 5, "Charlie Brown", "Analyst", 48000.0 }
        };

        // Create a JTable
        JTable table = new JTable(data, colheads);

        // Create a scroll pane and add the JTable to it
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set frame properties
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new exam9();
    }
}
