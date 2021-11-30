import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Rental extends JFrame implements ActionListener{

    JLabel car_id,cust_id,date,due,available,cust_name,l1;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton ok, cancel ,btn5;
    JDateChooser dateChooser, d1;

    Rental(){
        setTitle("Car Rental Form");

        l1 = new JLabel("Car Rental Form");
        getContentPane().setBackground(new Color(230,230,250));
        /* l1.setForeground(new Color(84,84,85));*/
        l1.setFont(new Font("Oswald", Font.BOLD, 30));

        car_id = new JLabel(" Car ID");
        cust_id = new JLabel(" Customer ID");
        date = new JLabel("Date");
        due = new JLabel("Due Date");

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

        d1 = new JDateChooser();
        d1.setForeground(new Color(105, 105, 105));
        d1.setBounds(300, 290, 400, 29);
        add(d1);


        setLayout(null);

        l1.setBounds(340, 50, 400, 25);
        add(l1);

        car_id.setBounds(100,140,100,30);
        add(car_id);

        t1.setBounds(300,140,400,30);
        add(t1);

        cust_id.setBounds(95,190,200,30);
        add(cust_id);

        t2.setBounds(300,190,400,30);
        add(t2);

        date.setBounds(100,240,200,30);
        add(date);

        dateChooser.setBounds(300, 240, 400, 30);

        due.setBounds(100,290,200,30);
        add(due);

       /* t3.setBounds(300,340,400,30);
        add(t3);*/

        /*t4.setBounds(300,340,400,30);
        add(t4);*/

        /*t5.setBounds(300,290,400,30);
        add(t5);*/

        ok.setBounds(350,400,80,30);
        ok.setFont(new Font("Raleway", Font.BOLD, 14));
        ok.setBackground(Color.BLACK);
        ok.setForeground(Color.WHITE);

        add(ok);

        cancel.setBounds(470,400,80,30);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);

        add(cancel);

        ok.addActionListener(this);
        cancel.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String car_id = t1.getText();
        String cust_id = t2.getText();
        //String date =
      //  String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        //String due = t3.getText();
        //String fine = t4.getText();


        try {

            if (car_id.equals("") && cust_id.equals("") && date.equals("") && due.equals("") && t1.getText().equals("") && t2.getText().equals("") && t3.getText().equals("") && t4.getText().equals("") && t5.getText().equals("")) {
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
        new Rental().setVisible(true);
    }
}
