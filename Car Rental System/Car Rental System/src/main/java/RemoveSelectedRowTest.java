import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveSelectedRowTest extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private Object[][] data;
    private String[] columnNames;
    private JButton button;
    public RemoveSelectedRowTest() {
        setTitle("RemoveSelectedRow Test");
        data = new Object[][] {{"Amit","12341234","Dec 10, 2001","Pune","8669991437"},
                {"Manish","98899812","May 9,2003","Mumbai","9888988844"}};
        columnNames = new String[] {"Customer Name","ID Card Number","DOB","Address","Mobile Number"};
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        button = new JButton("Remove");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // check for selected row first
                if(table.getSelectedRow() != -1) {
                    // remove selected row from the model
                    model.removeRow(table.getSelectedRow());
                    JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
                }
            }
        });
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args[]) {
        new RemoveSelectedRowTest();
    }
}