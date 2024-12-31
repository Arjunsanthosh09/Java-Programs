// 35.Write a program using swings to accept values in two textboxes and display the
//  results of mathematical operations in third text box. Use four buttons add,subtract,multiply and divide.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("unused")
public class mathematicaloperationsapplet extends JApplet implements ActionListener{
    JTextField t1,t2,result;
    JLabel n1,n2,res;
    JButton addition,sub,mult,div;
    public void init(){
        setLayout(null);
        t1=new JTextField(10);
        t2=new JTextField(10);
        result=new JTextField(10);
        result.setEditable(false);
        n1=new JLabel("Enter the first number :");
        n2=new JLabel("Enter the second number :");
        res=new JLabel("Result : ");
        addition=new JButton("Add");
        sub=new JButton("Sub");
        mult=new JButton("Mult");
        div=new JButton("Div");
        n1.setBounds(50, 50, 150, 30);
        add(n1);
        t1.setBounds(200, 50, 150, 30);
        add(t1);
        n2.setBounds(50, 100, 150, 30);
        add(n2);
        t2.setBounds(205, 100, 150, 30);
        add(t2);
        addition.setBounds(50, 160, 60, 30);
        add(addition);
        sub.setBounds(120, 160, 60, 30);
        add(sub);
        mult.setBounds(190, 160, 60, 30);
        add(mult);
        div.setBounds(260, 160, 60, 30);
        add(div);
        res.setBounds(100, 250, 150, 30);
        add(res);
        result.setBounds(150, 250, 150, 30);
        add(result);
        addition.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);


    }
    public void actionPerformed(ActionEvent e){
        int n1,n2;
        n1=Integer.parseInt(t1.getText());
        n2=Integer.parseInt(t2.getText());
        double res1;
        if (e.getSource()==addition) {
            res1=n1+n2;
            result.setText(String.valueOf(res1));  
        }
        else if (e.getSource()==sub) {
            res1=n1-n2;
            result.setText(String.valueOf(res1)); 
        }
        else if (e.getSource()==mult) {
            res1=n1*n2;
            result.setText(String.valueOf(res1)); 
        }
        else if (e.getSource()==div) {
            res1=n1/n2;
            result.setText(String.valueOf(res1)); 
        }

    }
}
//<applet code="mathematicaloperations" width=800 height=800></applet>

