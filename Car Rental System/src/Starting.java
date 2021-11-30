import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Starting extends JFrame {
    JButton b1, b2, b3, b4, b5;
    JLabel j1;
    JFrame l1;

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

        public static void main (String[]args){
            new Starting().setVisible(true);
        }
    }

