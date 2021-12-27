import javax.swing.*;
public class Viewentry {
    JFrame f;
    Viewentry(){
        f=new JFrame();
        String data[][]={{"Amit","12341234","Dec 10, 2001","Pune","8669991437"},
                {"Manish","98899812","May 9,2003","Mumbai","9888988844"},{"Amisha","64738264","Aug 5, 1999","Banglore","8766598765"},
                {"Sushant","75849374","Sep 5, 2003","Delhi","9574839983"},
                {"Meet", "78457781","Sep 14, 1995", "Pune", "9876543210"},
                {"Nihal", "83120822","Oct 5, 2005", "Mumbai", "7458691203"},
                {"Rohit", "54434477","Feb 4, 1996", "Delhi", "1234561234"},
                {"Tejas", "34760651","Aug 25, 2004", "Banglore", "9098754321"},
                {"Vedant", "16111640","Aug 20, 1999", "Hyderabad", "527873772"},
                {"Akshay","573638474","Jul 4, 1998","Amritsar","7896754789"}};
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