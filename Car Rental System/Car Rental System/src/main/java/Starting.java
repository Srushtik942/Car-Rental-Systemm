import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.toedter.calendar.JDateChooser;

public class Starting extends JFrame {
    JButton b1, b2, b3, b4, b5;
    JLabel j1;
    JFrame l1;
    JMenuBar mb;
    JMenu Create,View,Update,delete;
    JMenuItem cut,copy,paste,selectAll;
    JTextArea t1,t2,t3,t4,t5;
    JDateChooser dateChooser;


    Starting() {

        getContentPane().setLayout(null);
        JLabel l11 = new JLabel(new ImageIcon("C:\\Users\\Sai\\eclipse-workspace\\Car Rental System\\src\\hand-car-keys-transportation-driving-260nw-101145013.jpg"));
        l11.setBounds(30, 20, 530, 210);
        getContentPane().add(l11);
        j1 = new JLabel("Car Rental System");
        j1.setBounds(100, 230, 2000, 100);
        j1.setFont(new Font("Dialog", Font.BOLD, 44));
        getContentPane().add(j1);

        b1 = new JButton("Registration");
        b1.setBounds(160, 350, 200, 50);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        getContentPane().add(b1);

        b2 = new JButton("Car Selection");
        b2.setBounds(160, 420, 200, 50);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        getContentPane().add(b2);

        b3 = new JButton("Rent");
        b3.setBounds(160, 490, 200, 50);
        b3.setFont(new Font("Raleway", Font.BOLD, 14));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        getContentPane().add(b3);

        b4 = new JButton("Return");
        b4.setBounds(160, 560, 200, 50);
        b4.setFont(new Font("Raleway", Font.BOLD, 14));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);

        getContentPane().add(b4);
        getContentPane().setBackground(new Color(230, 230, 250));
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        selectAll=new JMenuItem("selectAll");
//        cut.addActionListener(this);
//        copy.addActionListener(this);
//        paste.addActionListener(this);
//        selectAll.addActionListener(this);
        mb=new JMenuBar();
        Create=new JMenu("Create");
        View=new JMenu("View");
        Update=new JMenu("Update");
        delete=new JMenu("Delete");

        mb.add(Create);
        mb.add(View);
        mb.add(Update);
        mb.add(delete);
//        ta=new JTextArea();
//        ta.setBounds(5,5,360,320);
        add(mb);
        setJMenuBar(mb);
        setLayout(null);
        setSize(400,400);
        Create.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                Customer cust=new Customer();
                cust.setVisible(true);

            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        View.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                Viewentry viewe=new Viewentry();
                viewe.setVisible(true);

            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        delete.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                RemoveSelectedRowTest rsrt=new RemoveSelectedRowTest();
                rsrt.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });
        Update.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                RemoveSelectedRowTest rst=new RemoveSelectedRowTest();
                rst.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                JOptionPane.showMessageDialog(b1, "Opening Registration form for new customers..!", "", JOptionPane.PLAIN_MESSAGE);
                Customer cust=new Customer();
                cust.setVisible(true);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                JOptionPane.showMessageDialog(b1, "Fetching the Cars data..!", "", JOptionPane.PLAIN_MESSAGE);
                Register cr=new Register();
                cr.setVisible(true);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                JOptionPane.showMessageDialog(b1, "Getting you to Rental Screen..!", "", JOptionPane.PLAIN_MESSAGE);
                Rental rental=new Rental();
                rental.setVisible(true);
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                JOptionPane.showMessageDialog(b1, "Loading Car Return Screen..!", "", JOptionPane.PLAIN_MESSAGE);
                Return rt= new Return();
                rt.setVisible(true);

            }
        });
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == Create){
            new Customer();
        }
        if(ae.getSource() == View){
            new Register();
        }
        if(ae.getSource() == Update){
            new Rental();
        }
        if(ae.getSource() == delete){
            new Return();
        }

        MongoClient mongo = new MongoClient("localhost", 27017);
        DB db = mongo.getDB("CarRental");
        DBCollection table = db.getCollection("signup1");

        try {
            if (ae.getSource() == b1) {
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



    private Calendar Update() {
        return null;
    }

    public static void main (String[]args){
            new Starting().setVisible(true);
        }
    }

