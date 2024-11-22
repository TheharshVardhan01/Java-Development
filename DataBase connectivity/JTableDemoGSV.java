import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class JTableDemoGSV {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Static JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);  // Center the frame

        // Create columnn names
        String[] columnNames = {"ID", "Name", "Age"};

        // Create data for the table
        Object[][] data = {
            {1, "imposter", 65},
            {2, "lost", 1325},
            {3, "ayush", 20}
        };

        // Create the table model and JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int row, int column) {
                return false;  // Make all cells non-editable
            }
        };

        table.setRowHeight(25);  // Set row height
        table.getTableHeader().setReorderingAllowed(false);  // Prevent column reordering

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
