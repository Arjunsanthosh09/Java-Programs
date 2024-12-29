// Create a GUI that accepts details for a student registration for a seminar.

import javax.swing.*;
import java.awt.event.*;
public class studentseminarreg extends JApplet implements ActionListener{
    JTextField name,address,phone,email,clgname,course,resname,resclg,resemail,resresgister,resscou;
    JLabel details;
    JButton Submit;
    JLabel namLabel,addlLabel,phnLabel,emLabel,cLabel,coLabel,resclgname,resemailname,resrname,resco;
    String na,add,em,clg,co,ress,ph;
    
    public void init(){
        setLayout(null);
        name=new JTextField(20);
        address=new JTextField(20);
        phone=new JTextField(11);
        email=new JTextField(20);
        clgname=new JTextField(20);
        course=new JTextField(20);
        resclg=new JTextField(20);
        resemail=new JTextField(20);
        resname=new JTextField(20);
        resscou=new JTextField(20);
        resresgister=new JTextField(20);
        resclg.setEditable(false);
        resemail.setEditable(false);
        resname.setEditable(false);
        resscou.setEditable(false);
        resresgister.setEditable(false);
        Submit=new JButton("Submit");
        details=new JLabel("Details of the student !");
        namLabel= new JLabel("Enter your name : ");
        addlLabel=new JLabel("Enter your address: ");
        phnLabel=new JLabel("Enter your phone number :");
        emLabel=new JLabel("Enter your email :");
        cLabel=new JLabel("enter your class / course :");
        coLabel=new JLabel("Enter your college name :");
        resclgname=new JLabel("Student College Name :");
        resemailname=new JLabel("student Email :");
        resrname=new JLabel("Student Name :");
        resco=new JLabel("Student class/course :");

        namLabel.setBounds(50, 50, 180, 20);
        add(namLabel);
        name.setBounds(220, 50, 120, 20);
        add(name);

        addlLabel.setBounds(50, 90, 180, 20);
        add(addlLabel);
        address.setBounds(220, 90, 120, 20);
        add(address);

        phnLabel.setBounds(50, 130, 180, 20);
        add(phnLabel);
        phone.setBounds(220, 130, 120, 20);
        add(phone);

        emLabel.setBounds(50, 170, 180, 20);
        add(emLabel);
        email.setBounds(220, 170, 120, 20);
        add(email);

        cLabel.setBounds(50, 210, 180, 20);
        add(cLabel);
        clgname.setBounds(220, 210, 120, 20);
        add(clgname);

        coLabel.setBounds(50, 250, 180, 20);
        add(coLabel);
        course.setBounds(220, 250, 120, 20);
        add(course);

        Submit.setBounds(150, 330, 120, 20);
        add(Submit);
        Submit.addActionListener(this);

        //results
        details.setBounds(150, 380, 180, 20);
        add(details);

        resrname.setBounds(50, 450, 180, 20);
        add(resrname);
        resname.setBounds(220, 450, 120, 20);
        add(resname);

        resemailname.setBounds(50, 490, 180, 20);
        add(resemailname);
        resemail.setBounds(220, 490, 120, 20);
        add(resemail);

        resclgname.setBounds(50, 530, 180, 20);
        add(resclgname);
        resclg.setBounds(220, 530, 120, 20);
        add(resclg);

        resco.setBounds(50, 570, 180, 20);
        add(resco);
        resscou.setBounds(220, 570, 120, 20);
        add(resscou);

        resresgister.setBounds(150, 630, 180, 20);
        add(resresgister);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==Submit) {
            na=name.getText();
            add=address.getText();
            em=email.getText();
            clg=clgname.getText();
            co=course.getText();
            ph=phone.getText();
            ress="Successfully registered";
            resname.setText(na);
            resclg.setText(clg);
            resemail.setText(em);
            resscou.setText(co);
            resresgister.setText(ress);
        } 
    }
}

//<applet code="studentseminarreg" width=600 height=600></applet>

