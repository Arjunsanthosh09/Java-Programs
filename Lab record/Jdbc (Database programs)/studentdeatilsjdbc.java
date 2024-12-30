

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class studentdeatilsjdbc extends JApplet implements ActionListener {
    JTextField name, age, address, course, phonenumber;
    JButton submit;
    JLabel namLabel, agLabel, addressLabel, coursLabel, phonLabel;

    public void init() {
        setLayout(null);

        // Initializing text fields
        name = new JTextField(20);
        age = new JTextField(20);
        address = new JTextField(20);
        course = new JTextField(20);
        phonenumber = new JTextField(20);

        // Initializing button and labels
        submit = new JButton("Submit");

        namLabel = new JLabel("Enter your name:");
        agLabel = new JLabel("Enter your Age:");
        addressLabel = new JLabel("Enter your Address:");
        coursLabel = new JLabel("Enter your course:");
        phonLabel = new JLabel("Enter your Phone number:");

        // Setting bounds
        namLabel.setBounds(50, 30, 150, 25);
        name.setBounds(200, 30, 150, 25);

        agLabel.setBounds(50, 70, 150, 25);
        age.setBounds(200, 70, 150, 25);

        addressLabel.setBounds(50, 110, 150, 25);
        address.setBounds(200, 110, 150, 25);

        coursLabel.setBounds(50, 150, 150, 25);
        course.setBounds(200, 150, 150, 25);

        phonLabel.setBounds(50, 190, 150, 25);
        phonenumber.setBounds(200, 190, 150, 25);

        submit.setBounds(150, 240, 100, 30);

        // Adding components
        add(namLabel);
        add(name);
        add(agLabel);
        add(age);
        add(addressLabel);
        add(address);
        add(coursLabel);
        add(course);
        add(phonLabel);
        add(phonenumber);
        add(submit);

        // Adding action listener
        submit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String studentName = name.getText();
        String studentAge = age.getText();
        String studentAddress = address.getText();
        String studentCourse = course.getText();
        String studentPhone = phonenumber.getText();

        try {
            if (studentName.isEmpty() || studentAge.isEmpty() || studentAddress.isEmpty() || studentCourse.isEmpty() || studentPhone.isEmpty()) {
                System.out.println("All fields are required!");
                return;
            }

            int ageValue = Integer.parseInt(studentAge);
            long phoneValue = Long.parseLong(studentPhone);

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:connection");
            Statement stmt = con.createStatement();
            String insertQuery = "INSERT INTO students (name, age, address, course, phone) VALUES ('" + studentName + "', " + ageValue + ", '" + studentAddress + "', '"  + studentCourse + "', " + phoneValue + ")";
            stmt.executeUpdate(insertQuery);
            String selectQuery = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Address: " + rs.getString("address"));
                System.out.println("Course: " + rs.getString("course"));
                System.out.println("Phone: " + rs.getLong("phone"));
            }
            con.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

//<applet code="studentdeatilsjdbc" width=700 height=700></applet>