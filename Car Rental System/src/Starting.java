import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Starting extends JFrame{
    JButton b1,b2,b3,b4,b5;
    JLabel j1;
    JFrame l1;
    Starting() {

        getContentPane().setLayout(null);
        JLabel l11 = new JLabel(new ImageIcon("C:\\Users\\Sai\\eclipse-workspace\\Car Rental System\\src\\hand-car-keys-transportation-driving-260nw-101145013.jpg"));
        l11.setBounds(30, 20, 530, 210);
        getContentPane().add(l11);
        j1=new JLabel("Car Rental System");
        j1.setBounds(100,230,2000,100);
        j1.setFont(new Font("Dialog", Font.BOLD, 44));
        getContentPane().add(j1);

        b1=new JButton("Registration");
        b1.setBounds(160,350,200,50);
        getContentPane().add(b1);

        b2=new JButton("Customer");
        b2.setBounds(160,420,200,50);
        getContentPane().add(b2);

        b3=new JButton("Customer");
        b3.setBounds(160,490,200,50);
        getContentPane().add(b3);

        b4=new JButton("Customer");
        b4.setBounds(160,560,200,50);
        getContentPane().add(b4);
        getContentPane().setBackground(new Color(230, 230, 250));

    }

    public static void main(String[] args) {
        new Starting().setVisible(true);
    }

}
