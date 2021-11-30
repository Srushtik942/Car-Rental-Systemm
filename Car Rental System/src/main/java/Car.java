import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Car extends JFrame {

    Car() {
        getContentPane().setLayout(null);
        JFrame f;
        f = new JFrame("Cars name");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        String languages[] = {"Swift", "WagonR", "Beat", "Alto", "i10", "i20"};
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(50, 100, 90, 20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(350, 350);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Car Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });

        String languages1[] = {"Swift", "WagonR", "Beat", "Alto", "i10", "i20"};
        final JComboBox cb1 = new JComboBox(languages);
        cb.setBounds(50, 100, 90, 20);
        f.add(cb1);
        f.setLayout(null);
        f.setSize(350, 350);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Car Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });

        //setUndecorated(true);

    }

    public static void main(String[] args) {
        new Car().setVisible(true);

    }
}
