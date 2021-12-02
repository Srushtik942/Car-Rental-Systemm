import com.toedter.calendar.JDateChooser;
;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
public class Customer extends JFrame implements ActionListener
{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5,r6;
    JButton b,b2,b3,b4;
    JDateChooser dateChooser;


    static Random ran = new Random();
    //    static long first4 = (ran.nextLong() % 9000L) + 1000L;
//    static String first = "" + Math.abs(first4);
    private JLabel l11_1;

    Customer()
    {

        setTitle("CAR RENTAL SYSTEM CUSTOMER DETAILS FORM");


        getContentPane().setLayout(null);
        JLabel l11 = new JLabel(new ImageIcon("C:\\Users\\Sai\\eclipse-workspace\\ATM Management System\\src\\application1.png"));
        l11.setBounds(40, 20, 110, 110);
        getContentPane().add(l11);

        l1 = new JLabel("");
        l1.setBounds(184, 30, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));

        l2 = new JLabel(" Customer Details");
        l2.setBounds(318, 80, 269, 30);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Customer Name:");
        l3.setBounds(100, 156, 250, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("ID Card Number:");
        l4.setBounds(100, 207, 200, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("DOB :");
        l5.setBounds(100, 260, 200, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Address:");
        l6.setBounds(100, 308, 200, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Mobile Number:");
        l7.setBounds(100, 357, 200, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 20));


        t1 = new JTextField();
        t1.setBounds(330, 160, 400, 30);
        t1.setFont(new Font("Dialog", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setBounds(330, 210, 400, 30);
        t2.setFont(new Font("Dialog", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setBounds(330, 360, 400, 30);
        t3.setFont(new Font("Dialog", Font.BOLD, 14));

//        t4 = new JTextField();
//        t4.setBounds(330, 460, 400, 30);
//        t4.setFont(new Font("Dialog", Font.BOLD, 14));

        t7 = new JTextField();
        t7.setBounds(330, 310, 400, 30);
        t7.setFont(new Font("Dialog", Font.BOLD, 14));

        b = new JButton("Next");
        b.setBounds(650, 427, 80, 30);
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Rental Rental=new Rental();
                Rental.setVisible(true);
            }
        });

//        ButtonGroup groupgender = new ButtonGroup();
//        groupgender.add(r1);
//        groupgender.add(r2);
//        groupgender.add(r6);
//
//        ButtonGroup groupstatus = new ButtonGroup();
//        groupstatus.add(r3);
//        groupstatus.add(r4);
//        groupstatus.add(r5);

        dateChooser = new JDateChooser();
        dateChooser.getCalendarButton().setBackground(new Color(230, 230, 250));
        dateChooser.setBounds(330, 260, 400, 30);
        //dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));

        getContentPane().add(dateChooser);
        getContentPane().add(l1);
        getContentPane().add(l2);
        getContentPane().add(l3);
        getContentPane().add(t1);
        getContentPane().add(l4);
        getContentPane().add(t2);
        getContentPane().add(l5);
        getContentPane().add(l6);
//        getContentPane().add(r1);
//        getContentPane().add(r2);
        getContentPane().add(l7);
        getContentPane().add(t3);
//        getContentPane().add(l8);
//        getContentPane().add(r3);
//        getContentPane().add(r4);
//        getContentPane().add(r5);
//        getContentPane().add(l9);
//        getContentPane().add(t4);
//        getContentPane().add(l10);
//        getContentPane().add(t5);
//        getContentPane().add(l11_1);
//        getContentPane().add(t6);
//        getContentPane().add(l12);
        getContentPane().add(t7);
        getContentPane().add(b);



        getContentPane().setBackground(new Color(230, 230, 250));


        setSize(830,780);
        setLocation(400,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == b){
            new Customer();
        }

        if(ae.getSource() == b2){
            new Register();
        }
        if(ae.getSource() == b3){
            new Rental();
        }
        if(ae.getSource() == b4){
            new Return();
        }


        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("Carrental");
        DBCollection table = db.getCollection("signup1");

        try {
            if (ae.getSource() == b) {
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
                String s4 = t4.getText();
                String s5 = t5.getText();


                BasicDBObject document = new BasicDBObject();
                document.put("Customer Name:",s1);
                document.put("ID Card Number:",s2);
                document.put("DOB",s3);
                document.put("Address",s4);
                document.put("Mobile number:",s5);




                table.insert(document);
                JOptionPane.showMessageDialog(null,"Successfully Inserted Donor","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args)
    {
        new Customer().setVisible(true);
    }
}