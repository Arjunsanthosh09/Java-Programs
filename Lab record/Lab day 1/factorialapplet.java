/*Write a swing program to accept an integer in a textbox then find the factorial of that 
number and display the result in the second textbox.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class factorialapplet extends JApplet implements ActionListener {
    JTextField n1,res;
    JLabel num1,factorial;
    JButton b1;
    public void init(){
        setLayout(new FlowLayout());
        n1=new JTextField(10);
        res=new JTextField(10);
        b1=new JButton("Factorial");
        num1=new JLabel("Enter the number");
        factorial=new JLabel("Factorial is :");

        add(num1);
        add(n1);
        add(b1);
        add(factorial);
        add(res);
        res.setEditable(false);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int num,fact=1;
        if (e.getSource()==b1) {
            num=Integer.parseInt(n1.getText());
            if (num<=1) {
                res.setText("Enter a value greater than 1...");
            }
            else{
                for(int i=1;i<=num;i++) {
                    fact*=i;
                }    
                res.setText(String.valueOf(fact));
            }
            
        }
    }
}

//<applet code="factorialapplet" width=700 height=700></applet>
