// 26.Write a Java GUI program to implement simple interest calculator(I=P*N*R)

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleintrestcalculator extends JApplet implements ActionListener {
    double p, r, t, res;
    JTextField principalamount, interestrate, timeperiod, simpleIntest;
    JLabel result, pa, ir, tp;
    JButton b1;

    public void init() {
        setLayout(null);
        principalamount = new JTextField(10);
        interestrate = new JTextField(10);
        timeperiod = new JTextField(10);
        pa = new JLabel("Principal amount:");
        ir = new JLabel("Interest rate:");
        tp = new JLabel("Time period:");
        result = new JLabel("Simple Interest:");
        b1 = new JButton("Calculate Interest");
        simpleIntest = new JTextField();
        pa.setBounds(50, 50, 150, 30);
        principalamount.setBounds(200, 50, 150, 30);

        ir.setBounds(50, 100, 150, 30);
        interestrate.setBounds(200, 100, 150, 30);

        tp.setBounds(50, 150, 150, 30);
        timeperiod.setBounds(200, 150, 150, 30);

        b1.setBounds(50, 200, 150, 30);

        result.setBounds(50, 250, 150, 30);
        simpleIntest.setBounds(200, 250, 150, 30);

        add(pa);
        add(principalamount);
        add(ir);
        add(interestrate);
        add(tp);
        add(timeperiod);
        add(b1);
        add(result);
        add(simpleIntest);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        p = Integer.parseInt(principalamount.getText());
        r = Integer.parseInt(interestrate.getText());
        t = Integer.parseInt(timeperiod.getText());

        res = (p * r * t) / 100;
        simpleIntest.setText(String.valueOf(res)); 
    }
}

//<applet code="simpleintrestcalculator" width=700 height=700></applet>