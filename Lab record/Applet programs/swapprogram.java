// Demonstrate action event handling, by using an interface having two text boxes  and to swap values.

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class swapprogram extends Applet implements ActionListener{
    Label n1,n2;
    Button b1;
    TextField t1,t2;
    public void init(){
        n1=new Label("Enter the first number :");
        n2=new Label("Enter the Second number :");
        b1=new Button("Swap");
        t1=new TextField(20);
        t2=new TextField(20);
        add(n1);
        add(t1);
        add(n2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            int num1,num2,temp;
            num1=Integer.parseInt(t1.getText());
            num2=Integer.parseInt(t2.getText());
            temp=num1;
            num1=num2;
            num2=temp;
            t1.setText(String.valueOf(num1));
            t2.setText(String.valueOf(num2));

        }
    }
}
//<applet code="swapprogram.java" width=600 height=600></applet>
