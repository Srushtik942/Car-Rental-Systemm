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
                {"Manish","98899812","May 9,2003","Mumbai","9888988844"},{"Amisha","64738264","Aug 5","Banglore","8766598765"},
                {"Sushant","75849374","Sep 5","Delhi","9574839983"},
                {"Meet", "78457781","Sep 14, 1995", "Pune", "9876543210"},
                {"Nihal", "83120822","Oct 5, 2005", "Mumbai", "7458691203"},
                {"Rohit", "54434477","Feb 4, 1996", "Delhi", "1234561234"},
                {"Tejas", "34760651","Aug 25, 2004", "Banglore", "9098754321"},
                {"Vedant", "16111640","Aug 20, 1999", "Hyderabad", "527873772"},
                {"Akshay","573638474","Jul 4, 1998","Amritsar","7896754789"}};
        columnNames = new String[] {"Customer Name","ID Card Number","DOB","Address","Mobile Number"};
        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        button = new JButton("Remove");
        button.setFont(new Font("Raleway", Font.BOLD, 14));
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);

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