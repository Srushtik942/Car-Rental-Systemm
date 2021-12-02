import javax.swing.*;
public class Viewentry {
    JFrame f;
    Viewentry(){
        f=new JFrame();
        String data[][]={ {"Amit","12341234","Dec 10, 2001","Pune","8669991437"},
                {"Manish","98899812","May 9, 2003","Mumbai","9888988844"},
                {"Pradnya","465566588","July 12, 2001","Bangalore","9887123445"}
                };
        String column[]={"Customer Name","ID Card Number","DOB","Address","Mobile Number"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Viewentry();
    }

    public void setVisible(boolean b) {
    }
}