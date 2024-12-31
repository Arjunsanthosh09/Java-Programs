// Write a swing program to interchange the values of two textboxes. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swap  extends JApplet implements ActionListener{
    JTextField t1,t2;
    JLabel n1,n2;
    JButton b1;

   public void init(){
       setLayout(new FlowLayout());
        t1=new JTextField(10);
        t2=new JTextField(10);
        b1=new JButton("Swap");
        n1=new JLabel("Enter the number 1:");
        n2=new JLabel("Enter the number 2:");

        add(n1);
        add(t1);
        add(n2);
        add(t2);
        add(b1);
        b1.addActionListener(this);

   }
   public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1) {
            int n1,n2;
            n1=Integer.parseInt(t1.getText());
            n2=Integer.parseInt(t2.getText());
            int temp=n1;
            n1=n2;
            n2=temp;
            t1.setText(String.valueOf(n1));
            t2.setText(String.valueOf(n2));

        }
   }
}
//<applet code="swap" width=700 height=700></applet>
