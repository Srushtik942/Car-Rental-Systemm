import com.toedter.calendar.JDateChooser;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

public class Customer extends JFrame implements ActionListener
{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5,r6;
    JButton b;
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

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r6);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

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

        b.addActionListener(this);

        getContentPane().setBackground(new Color(230, 230, 250));


        setSize(830,780);
        setLocation(400,20);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {

//        String formno = first;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
//        if(r1.isSelected())
//        {
//            gender = "Male";
//        }
//        else if(r2.isSelected())
//        {
//            gender = "Female";
//        }
//        else if(r6.isSelected())
//        {
//            gender = "I Prefer not to say";
//        }
//
//        String email = t3.getText();
//        String marital = "";
//        if(r3.isSelected())
//        {
//            marital = "Married";
//        }
//        else if(r4.isSelected())
//        {
//            marital = "Unmarried";
//        }
//        else if(r5.isSelected())
//        {
//            marital = "Other";
//        }

//        String address = t4.getText();
//        String city = t5.getText();
//        String pincode = t6.getText();
//        String state = t7.getText();

        try
        {
            MongoClient mongo = new MongoClient("localhost", 27017);
            MongoCredential credential;
            credential = MongoCredential.createCredential("sampleUser", "myDb",
                    "password".toCharArray());
            System.out.println("Connected to the database successfully");

            //Accessing the database
            MongoDatabase database = mongo.getDatabase("CarRental");

            //Creating a collection
            //database.createCollection("signup");
            System.out.println("Collection created successfully");
            /**** Get database ****/
            // if database doesn't exists, MongoDB will create it for you
            DB db = mongo.getDB("CarRental");

            /**** Get collection / table from 'testdb' ****/
            // if collection doesn't exists, MongoDB will create it for you
            DBCollection table = db.getCollection("signup");

//            if(gender.equals("") || marital.equals("") || dob.equals("") || t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("") || t7.getText().equals("")  )
//            {
//                JOptionPane.showMessageDialog(null, "Fill all the required fields");
//            }
//            else
//            {
//                Conn c1 = new Conn();
//                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
//                c1.s.executeUpdate(q1);
//
//                new Signup2(first).setVisible(true);
//                setVisible(false);
//            }

        }
        catch(Exception e)
        {
            System.out.println("Error Occurred.\n"+e);
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        new Customer().setVisible(true);
    }
}

