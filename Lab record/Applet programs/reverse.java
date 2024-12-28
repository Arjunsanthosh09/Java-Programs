// 22.Write a swing program to accept an integer in a textbox then reverse that number 
// and display the result in the second textbox?  

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class reverse extends JApplet implements ActionListener {
    JTextField t1, t2;
    JLabel l1, l2;
    int n1;
    JButton b1;

    public void init() {
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        
        l1 = new JLabel("Enter the number :");
        l2 = new JLabel("Reverse of the number :");
        b1 = new JButton("Reverse");
        
        con.add(l1);
        con.add(t1);
        con.add(b1);
        con.add(l2);
        con.add(t2);
        
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            n1 = Integer.parseInt(t1.getText());
            int reverse = 0;
            while (n1 != 0) {
                int temp = n1 % 10;   
                reverse = reverse * 10 + temp; 
                n1 = n1 / 10;     
            }
            t2.setText(String.valueOf(reverse));
        } catch (Exception f) {
        }
    }
}

//<applet code="reverse" width=600 height=600></applet>