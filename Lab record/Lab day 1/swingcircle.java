// 18.Write a swing program to accept a value in a textbox then find the area of a circle and display 
// the result in the second textbox? (hint : A = πr2 ) 


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class swingcircle extends JApplet implements ActionListener {
    JLabel text1,result;
    JTextField T1,T2;
    JButton b1;
    double r,res;
    public void init(){
        Container con=getContentPane();
        con.setLayout(new FlowLayout());
        text1=new JLabel("Enter the Radius of the circle:");
        result=new JLabel("Area of the circle:");
        T1=new JTextField(10);
        T2=new JTextField(10);
        b1=new JButton("Find");
        con.add(text1);
        con.add(T1);
        con.add(b1);
        con.add(result);
        con.add(T2);
        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        r=Double.parseDouble(T1.getText());
        res=3.14*(r*r);
        T2.setText(String.valueOf(res));
    }
    
}
//<applet code="swingcircle" width=600 height=600></applet>