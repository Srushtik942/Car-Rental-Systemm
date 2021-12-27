import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.text.*;
import java.util.Scanner;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener, KeyListener {



    double smallPizzaPrice = 6.50, mediumPizzaPrice = 8.50,
            largePizzaPrice = 12.50, elargePizzaPrice = 16.00;
    double vegtop1 = 0.35, vegtop2 = 0.53, vegtop3 = 0.51, vegtop4 = 0.52,
            vegtop5 = 0.25, vegtop6 = 0.25, vegtop7 = 0.25, vegtop8 = 0.25,
            vegtop9 = 0.25;
    double dritop1 = 1, dritop2 = 1, dritop3 = 1, dritop4 = 1,
            dritop5 = 1, dritop6 = 1, dritop7 = 1, dritop8 = 1,
            dritop9 = 1;
    double meattop1 = 0.50, meattop2 = 0.50, meattop3 = 0.50, meattop4 = 0.50,
            meattop5 = 0.50, meattop6 = 0.50, meattop7 = 0.50, meattop8 = 0.50,
            meattop9 = 0.50;
    double lalala;
    JFrame frame;
    JLabel lab1, lab2, lab3, lab4, lab5, vegtopLabel, meattopLabel, lab6, lab7, DrinkLabel;
    Button button, button2;
    JTextField text1, text2, text3, text4;
    ButtonGroup group;
    JRadioButton small, medium, large, elarge;
    JCheckBox chk1, chk2, chk3, chk4, chk5, chk6, chk7, chk8, chk9, chk10,
            chk11, chk12, chk13, chk14, chk15, chk16, chk17, chk18, chk19, chk20
            , chk21, chk22, chk23, chk24, chk25, chk26, chk27;

    public Transactions() {
        getContentPane().setLayout(null);
        frame = new JFrame("Car Rental Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Create a content pane with a GridLayout */
        setBackground(Color.black);
        JLabel labl= new JLabel("CAR RENTAL SYSTEM");
        labl.setFont(new Font("Arial", Font.BOLD, 34));
        labl.setBounds(40,10,600,30);
        add(labl);
        lab1 = new JLabel("Name: ");
        lab2 = new JLabel("Address: ");
        lab3 = new JLabel("Contact No: ");
        lab4 = new JLabel("Quantity: ");
        lab5 = new JLabel("Number of Wheels for Car:");
        lab5.setForeground(new Color(0, 0, 205));
        lab5.setFont(new Font("Arial", Font.BOLD, 14));

        vegtopLabel = new JLabel("Select car Model : ");
        vegtopLabel.setForeground(new Color(0, 0, 205));
        vegtopLabel.setFont(new Font("Arial", Font.BOLD, 14));

        DrinkLabel = new JLabel("Select  ");
        DrinkLabel.setForeground(new Color(0, 0, 205));
        DrinkLabel.setFont(new Font("Arial", Font.BOLD, 14));

        meattopLabel = new JLabel("Select  ");
        meattopLabel.setForeground(new Color(0, 0, 205));
        meattopLabel.setFont(new Font("Arial", Font.BOLD, 14));

        lab6 = new JLabel("Total rent(with tax): ");
        lab6.setForeground(new Color(200, 0, 0));
        lab6.setFont(new Font("Arial", Font.BOLD, 14));

        lab7 = new JLabel("$0.00");
        lab7.setForeground(new Color(235, 0, 0));

        text1 = new JTextField(20);
        text1.setText("User");
        text2 = new JTextField(20);
        text2.setText("Pune");
        text3 = new JTextField(20);
        text3.setText("1234123412");
        text4 = new JTextField(20);
        text4.setText("0");

        small = new JRadioButton("4 Wheeler", true);
        medium = new JRadioButton("6 Wheeler", false);
//        large = new JRadioButton("8 Wheeler", false);
//        elarge = new JRadioButton("10 Wheeler", false);
        group = new ButtonGroup();
        group.add(small);
        group.add(medium);
        group.add(large);
        group.add(elarge);

        chk1 = new JCheckBox("Swift", false);
        chk2 = new JCheckBox("Creta", false);
        chk3 = new JCheckBox("Ignis", false);
        chk4 = new JCheckBox("Santro", false);
        chk5 = new JCheckBox("Indica", false);
        chk6 = new JCheckBox("Scorpio", false);
        chk7 = new JCheckBox("Baleno", false);
        chk8 = new JCheckBox("Brezza", false);
        chk9 = new JCheckBox("Fiat", false);

        chk10 = new JCheckBox("Alto", false);
        chk11 = new JCheckBox("WagonR", false);
        chk12 = new JCheckBox("Chevrolet Beat", false);
        chk13 = new JCheckBox("Sumo", false);
        chk14 = new JCheckBox("Bolero", false);
        chk15 = new JCheckBox("Xylo", false);
        chk16 = new JCheckBox("Kwid", false);
        chk17 = new JCheckBox("Ertiga", false);
        chk18 = new JCheckBox("XUV 800", false);

        chk19 = new JCheckBox("i10", false);
        chk20 = new JCheckBox("i20", false);
        chk21 = new JCheckBox("Redigo", false);
        chk22 = new JCheckBox("Max", false);
        chk23 = new JCheckBox("Cruiser", false);
        chk24 = new JCheckBox("Indigo", false);
        chk25 = new JCheckBox("Nano", false);
        chk26 = new JCheckBox("Dzire", false);
        chk27 = new JCheckBox("Innova", false);
        button2 = new Button("Receipt");
        button = new Button("Pay");
        small.addActionListener(this);
        medium.addActionListener(this);
//        large.addActionListener(this);
//        elarge.addActionListener(this);

        chk1.addActionListener(this);
        chk2.addActionListener(this);
        chk3.addActionListener(this);
        chk4.addActionListener(this);
        chk5.addActionListener(this);
        chk6.addActionListener(this);
        chk7.addActionListener(this);
        chk8.addActionListener(this);
        chk9.addActionListener(this);

        chk10.addActionListener(this);
        chk11.addActionListener(this);
        chk12.addActionListener(this);
        chk13.addActionListener(this);
        chk14.addActionListener(this);
        chk15.addActionListener(this);
        chk16.addActionListener(this);
        chk17.addActionListener(this);
        chk18.addActionListener(this);

        chk19.addActionListener(this);
        chk20.addActionListener(this);
        chk21.addActionListener(this);
        chk22.addActionListener(this);
        chk23.addActionListener(this);
        chk24.addActionListener(this);
        chk25.addActionListener(this);
        chk26.addActionListener(this);
        chk27.addActionListener(this);

        text4.addKeyListener(this);
        button.addActionListener(this);
        button2.addActionListener(this);
        lab1.setBounds(50, 50, 200, 20);
        lab2.setBounds(50, 80, 200, 20);
        lab3.setBounds(50, 110, 200, 20);
        lab4.setBounds(50, 140, 200, 20);

        text1.setBounds(200, 50, 200, 20);
        text2.setBounds(200, 80, 200, 20);
        text3.setBounds(200, 110, 200, 20);
        text4.setBounds(200, 140, 200, 20);

        lab5.setBounds(50, 170, 500, 20);
        small.setBounds(300, 170, 100, 20);
        medium.setBounds(400, 170, 100, 20);
//        large.setBounds(500, 170, 100, 20);
//        elarge.setBounds(600, 170, 100, 20);

        vegtopLabel.setBounds(50, 200, 300, 20);
        chk1.setBounds(50, 230, 300, 20);
        chk2.setBounds(50, 260, 300, 20);
        chk3.setBounds(50, 290, 300, 20);
        chk4.setBounds(50, 320, 300, 20);
        chk5.setBounds(50, 350, 300, 20);
        chk6.setBounds(50, 380, 300, 20);
        chk7.setBounds(50, 410, 300, 20);
        chk8.setBounds(50, 440, 300, 20);
        chk9.setBounds(50, 470, 300, 20);
        //sets positioning
        meattopLabel.setBounds(500, 200, 300, 20);
        chk10.setBounds(500, 230, 300, 20);
        chk11.setBounds(500, 260, 300, 20);
        chk12.setBounds(500, 290, 300, 20);
        chk13.setBounds(500, 320, 300, 20);
        chk14.setBounds(500, 350, 300, 20);
        chk15.setBounds(500, 380, 300, 20);
        chk16.setBounds(500, 410, 300, 20);
        chk17.setBounds(500, 440, 300, 20);
        chk18.setBounds(500, 470, 300, 20);
        lab6.setBounds(50, 550, 500, 40);
        lab7.setBounds(200, 550, 500, 40);
        //
        DrinkLabel.setBounds(800, 200, 300, 20);
        chk19.setBounds(800, 230, 300, 20);
        chk20.setBounds(800, 260, 300, 20);
        chk21.setBounds(800, 290, 300, 20);
        chk22.setBounds(800, 320, 300, 20);
        chk23.setBounds(800, 350, 300, 20);
        chk24.setBounds(800, 380, 300, 20);
        chk25.setBounds(800, 410, 300, 20);
        chk26.setBounds(800, 440, 300, 20);
        chk27.setBounds(800, 470, 300, 20);
        //sets positioning for Drink labels
        button.setBounds(50, 600, 100, 20);
        button2.setBounds(300, 600, 100, 20);
        add(lab1);
        add(lab2);
        add(lab3);
        add(lab4);
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(lab5);
        add(small);
        add(medium);
//        add(large);
//        add(elarge);
        add(vegtopLabel);
        add(chk1);
        add(chk2);
        add(chk3);
        add(chk4);
        add(chk5);
        add(chk6);
        add(chk7);
        add(chk8);
        add(chk9);
        add(meattopLabel);
        add(chk10);
        add(chk11);
        add(chk12);
        add(chk13);
        add(chk14);
        add(chk15);
        add(chk16);
        add(chk17);
        add(chk18);
        add(lab6);
        add(lab7);
        add(DrinkLabel);
        add(chk19);
        add(chk20);
        add(chk21);
        add(chk22);
        add(chk23);
        add(chk24);
        add(chk25);
        add(chk26);
        add(chk27);
        add(button);
        add(button2);
        text4.selectAll();
        setVisible(true);
        setSize(1000, 700);










    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {

        try {
            Integer.parseInt(text4.getText());
        } catch (NumberFormatException fe) {
            text4.setText("0");
        }

        refreshPrice();
    }

    public void actionPerformed(ActionEvent e) {
        if (small.isSelected()) {
            JOptionPane.showMessageDialog(this, "You Choose 4 Wheeler.");
        }
        if (medium.isSelected()) {
            JOptionPane.showMessageDialog(this, "You Choose 6 Wheeler.");
        }
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this,  "Thank you,\nFor Renting Car From Us, "+text1.getText()+"\n Money Paid"+lab7.getText()
                            ,
                    "Money Paid Successfully", JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource() == button2 ) {

                JOptionPane.showMessageDialog(this, "You Rented Car  " + "\nName:"+text1.getText() + "\nAddress" + text2.getText() +"\nContact "+ text3.getText()+"\nTotal Cost "+lab7.getText()
                        ,
                        "**Receipt**", JOptionPane.INFORMATION_MESSAGE);
            }
            refreshPrice();


    }

    private void refreshPrice() {
        double price = 0;
        int pizzaAmount = Integer.parseInt(text4.getText());

        NumberFormat numberForm = NumberFormat.getNumberInstance();
        DecimalFormat moneyForm = (DecimalFormat) numberForm;
        moneyForm.applyPattern("0.00");

        if (small.isSelected()) {
            price += smallPizzaPrice * pizzaAmount;
        }
        else if (medium.isSelected()) {
            price += mediumPizzaPrice * pizzaAmount;
        }
        else if (large.isSelected()) {
            price += largePizzaPrice * pizzaAmount;
        }
        else if (elarge.isSelected()) {
            price += elargePizzaPrice * pizzaAmount;
        }
        else if (chk1.isSelected()) {
            price += vegtop1 * pizzaAmount;
        }
        else if (chk2.isSelected()) {
            price += vegtop2 * pizzaAmount;
        }
        else if (chk3.isSelected()) {
            price += vegtop3 * pizzaAmount;
        }
        else if (chk4.isSelected()) {
            price += vegtop4 * pizzaAmount;
        }
        else if (chk5.isSelected()) {
            price += vegtop5 * pizzaAmount;
        }
        else if (chk6.isSelected()) {
            price += vegtop6 * pizzaAmount;
        }
        else if (chk7.isSelected()) {
            price += vegtop7 * pizzaAmount;
        }
        else if (chk8.isSelected()) {
            price += vegtop8 * pizzaAmount;
        }
        else if (chk9.isSelected()) {
            price += vegtop9 * pizzaAmount;
        }

        if (chk10.isSelected()) {
            price += meattop1 * pizzaAmount;
        }
        if (chk11.isSelected()) {
            price += meattop2 * pizzaAmount;
        }
        if (chk12.isSelected()) {
            price += meattop3 * pizzaAmount;
        }
        if (chk13.isSelected()) {
            price += meattop4 * pizzaAmount;
        }
        if (chk14.isSelected()) {
            price += meattop5 * pizzaAmount;
        }
        if (chk15.isSelected()) {
            price += meattop6 * pizzaAmount;
        }
        if (chk16.isSelected()) {
            price += meattop7 * pizzaAmount;
        }
        if (chk17.isSelected()) {
            price += meattop8 * pizzaAmount;
        }
        if (chk18.isSelected()) {
            price += meattop9 * pizzaAmount;
        }
        if (chk19.isSelected()) {
            price += dritop1 * pizzaAmount;
        }
        if (chk20.isSelected()) {
            price += dritop2 * pizzaAmount;
        }
        if (chk21.isSelected()) {
            price += dritop3 * pizzaAmount;
        }
        if (chk22.isSelected()) {
            price += dritop4 * pizzaAmount;
        }
        if (chk23.isSelected()) {
            price += dritop5 * pizzaAmount;
        }
        if (chk24.isSelected()) {
            price += dritop6 * pizzaAmount;
        }
        if (chk25.isSelected()) {
            price += dritop7 * pizzaAmount;
        }
        if (chk26.isSelected()) {
            price += dritop8 * pizzaAmount;
        }
        if (chk27.isSelected()) {
            price += dritop9 * pizzaAmount;
        }
        double value = price * 0.0775;
        double totalPrice = value + price;

        lab7.setText("$" + moneyForm.format(totalPrice));

    }

    public static void main(String... args) {
        Transactions order = new Transactions();
        Scanner kbinput = new Scanner(System.in);


    }}
