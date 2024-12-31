/*Write a swing program to accept a value in a textbox then find the perimeter of a circle 
and display the result in the second textbox.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class perimeterapplet extends JApplet implements ActionListener {
    JTextField radius,perimeter;
    JButton b1;
    JLabel ra,pe;
    public void init(){
        setLayout(new FlowLayout());
        radius=new JTextField(10);
        perimeter=new JTextField(10);
        b1=new JButton("Perimeter");
        ra=new JLabel("enter the Radius:");
        pe=new JLabel("Perimeter of the circle :");
        add(ra);
        add(radius);
        add(b1);
        add(pe);
        add(perimeter);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double n1,peri;
        
        if (e.getSource()==b1) {
            n1=Double.parseDouble(radius.getText());
            peri=2*3.14*n1;
            perimeter.setText(String.valueOf(peri));
        }
    }
}
//<applet code="perimeterapplet.class" width=700 height=700></applet>
