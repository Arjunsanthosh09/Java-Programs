// 16. Write a program using swing to accept values in two textboxes then find the largest number 
// and display the result in third text box. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class largestnumberusingswing extends JApplet implements ActionListener {
    JTextField t1,t2,t3;
    JLabel num1,num2,res;
    JButton b1;
    int n1,n2,result;

    public void init() {
        
        Container con=getContentPane();
        con.setLayout(new FlowLayout());
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1=new JButton("Largest number");
        num1=new JLabel("Enter the first number :");
        num2=new JLabel("Enter the second number :");
        res=new JLabel("Result :");
        con.add(num1);
        con.add(t1);
        con.add(num2);
        con.add(t2);
        con.add(b1);
        con.add(res);
        con.add(t3);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        n1=Integer.parseInt(t1.getText());
        n2=Integer.parseInt(t2.getText());
        if(n1 <n2){
            result=n2;
        }else{
            result=n1;
        }
        t3.setText(String.valueOf(result));
    }
   
}

// <applet code="largestnumberusingswing" width=600 height=400></applet>