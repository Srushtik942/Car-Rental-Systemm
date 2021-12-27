import javax.management.modelmbean.ModelMBean;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import java.sql.*;
import java.util.Random;

public class Register extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField tf1, tf2, tf5, tf6, tf7;
    JButton btn1, btn2, btn3, btn4,b,btn5;
    JPasswordField p1, p2;
    JFrame f;
    JFrame f1;
    JLabel j1;



    Register() {
        getContentPane().setLayout(null);
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Car Registration form");
        /*  f.getContentPane().setLayout(null);*/
        /* l7 = new JLabel(new ImageIcon(""))*/

       /* f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setPreferredSize(new Dimension(550,300));*/
        getContentPane().setBackground(new Color(230,230,250));
       /* f.pack();
        f.setVisible(true);*/
        l1 = new JLabel("Car Registration");
        l1.setForeground(new Color(84,84,85));
        /* l1.setSize(60,25);*/
        l1.setFont(new Font("Oswald", Font.BOLD, 20));
        l2 = new JLabel("Car Registration no");
        l3 = new JLabel("Seats");


        final JLabel l8=new JLabel();
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setSize(800,900);
        JButton btn5=new JButton("show");
        String seat[]={"4","6"};
        final JComboBox cb1=new JComboBox(seat);



        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="Seats Selected:"
                        +cb1.getItemAt(cb1.getSelectedIndex());
                l8.setText(data);
            }
        });




        /* l4 = new JLabel("Cars name");*/

        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 500);
        JButton btn3=new JButton("Save");
        btn3.setFont(new Font("Raleway", Font.BOLD, 14));
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn3,"Data Saved Successfully","",JOptionPane.PLAIN_MESSAGE);

            }
        });


        String cars[]={"Swift","WagonR","Alto","i10","i20","ignis","creta","Chevrolet Beat","Redigo","Sumo","Bolero","Max","Indica","Indigo","Cruiser","Santro"};
        final JComboBox cb = new JComboBox(cars);

        add(cb);
        add(label);
        add(btn3);
      /* setLayout(null);
       setSize(400,500);
       setVisible(true);*/
       /* btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Car Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });*/

        l4 = new JLabel("Model");
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
        b = new JButton("Next");
        b.setBounds(210,250 , 90, 20);
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn3,"Taking you to Rental Screen!!!","",JOptionPane.PLAIN_MESSAGE);
                Rental rental=new Rental();
                rental.setVisible(true);

            }
        });

//        b.setFont(new Font("Raleway", Font.BOLD, 14));
      /*  b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);*/
        /*b.addActionListener((ActionListener) this);*/

        tf1=new JTextField();
        /* tf2=new JTextField();*/
        tf1.setBounds(200,70,200,30);
        /* tf2.setBounds(300,110,200,30);*/
       /* btn1.addActionListener(this);
        btn2.addActionListener(this);*/
        l1.setBounds(140, 30, 400, 25);
        l2.setBounds(80, 70, 200, 20);
        l3.setBounds(80, 120, 200, 30);
        l4.setBounds(80, 180, 200, 20);
        cb1.setBounds(200,125,90,20);
        cb.setBounds(200,180,90,20);
        btn3.setBounds(90,250,90,20);

        add(l1);
        add(l2);
        add(tf1);
        add(cb1);
        add(l3);
        /* add(tf2);*/
        add(l4);
        add(btn1);
        add(btn2);
        add(b);

        add(l8);
        add(btn5);

    }

    public static void main(String[] args) {
        new Register().setVisible(true);
        /* JFrame f=new JFrame();*/
    }

}