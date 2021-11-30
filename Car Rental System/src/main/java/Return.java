import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Return extends JFrame implements ActionListener{

    JLabel car_id,cust_id,date,days,fine,l2;
    JTextField t1,t2,t3,t4,t5;
    JButton ok, cancel;
    JDateChooser dateChooser;

    Return() {
        setTitle("Return Car");
        l2 = new JLabel(" Car Return Details");
        l2.setBounds(300, 80, 2000, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 34));
        car_id = new JLabel("Car ID:");
        add(l2);
        cust_id = new JLabel("Customer ID:");
        date = new JLabel("Date:");
        days = new JLabel("Days:");
        fine = new JLabel("Fine:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        ok = new JButton("ok");
        cancel = new JButton("cancel");

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);

        setLayout(null);

        car_id.setBounds(100, 140, 100, 30);
        add(car_id);

        t1.setBounds(300, 140, 400, 30);
        add(t1);

        cust_id.setBounds(100, 190, 200, 30);
        add(cust_id);

        t2.setBounds(300, 190, 400, 30);
        add(t2);

        date.setBounds(100, 240, 200, 30);
        add(date);

        dateChooser.setBounds(300, 240, 400, 30);

        days.setBounds(100, 290, 200, 30);
        add(days);

        t3.setBounds(300, 340, 400, 30);
        add(t3);

        fine.setBounds(100, 340, 200, 30);
        add(fine);

        t4.setBounds(300, 290, 400, 30);
        add(t4);

        ok.setBounds(320, 420, 80, 30);
        ok.setFont(new Font("Raleway", Font.BOLD, 14));
        ok.setBackground(Color.BLACK);
        ok.setForeground(Color.WHITE);
        add(ok);

        cancel.setBounds(480, 420, 80, 30);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);

        ok.addActionListener(this);

        cancel.addActionListener(this);
                //new ActionListener() {
//
//           public void actionPerformed(ActionEvent e) {
////                JOptionPane.showMessageDialog(cancel, "Operation cancelling!", "Thank You.", JOptionPane.PLAIN_MESSAGE);
////                System.exit(0);
//            }
//        });

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String car_id = t1.getText();
        String cust_id = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String days = t3.getText();
        String fine = t4.getText();
        try {

            if (car_id.equals("") && cust_id.equals("") && dob.equals("") && days.equals("") && fine.equals("") && t1.getText().equals("") && t2.getText().equals("") && t3.getText().equals("") && t4.getText().equals("") && t5.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else{
                //new Return(first).setVisible(true);
                setVisible(false);
            }


        } catch (HeadlessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Return().setVisible(true);
    }
}