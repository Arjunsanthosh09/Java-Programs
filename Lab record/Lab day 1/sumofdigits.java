/*write a swing program to accept a integer in a textbox and fins the sum of the digits and
display it in another textbox
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sumofdigits extends JApplet implements ActionListener {
    JTextField n1,res;
    JButton b1;
    JLabel num1,result;

    public void init(){
        setLayout(new FlowLayout());
        n1=new  JTextField(20);
        res=new  JTextField(20);
        b1=new JButton("Find");
        num1= new JLabel("Enter the number 1:");
        result=new JLabel("Sum of digits :");
        add(num1);
        add(n1);
        add(b1);
        add(result);
        add(res);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        
            int num;
            int sum=0;
            int temp;
            num=Integer.parseInt(n1.getText());
            while (num!=0) {
                temp=num%10;
                sum+=temp;
                num=num/10;

            }
        res.setText(String.valueOf(sum));
        
    }
}

//<applet code="sumofdigits" width=700 height=700></applet>
