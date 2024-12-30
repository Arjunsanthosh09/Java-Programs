import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class menudrivenjdbcgui extends Applet implements ActionListener {
    TextField name, age, address, course, phone, studentId;
    Button insert, delete, display;
    Label nameLabel, ageLabel, addressLabel, courseLabel, phoneLabel, studentIdLabel;
    TextArea displayArea;

    Connection con;
    Statement stmt;

    public void init() {
        setLayout(new FlowLayout());
        studentIdLabel = new Label("Student ID:");
        studentId = new TextField(20);
        nameLabel = new Label("Name:");
        name = new TextField(20);
        ageLabel = new Label("Age:");
        age = new TextField(20);
        addressLabel = new Label("Address:");
        address = new TextField(20);
        courseLabel = new Label("Course:");
        course = new TextField(20);
        phoneLabel = new Label("Phone:");
        phone = new TextField(20);

        insert = new Button("Insert");
        delete = new Button("Delete");
        display = new Button("Display");

        displayArea = new TextArea(10, 50);
        add(studentIdLabel);
        add(studentId);
        add(nameLabel);
        add(name);
        add(ageLabel);
        add(age);
        add(addressLabel);
        add(address);
        add(courseLabel);
        add(course);
        add(phoneLabel);
        add(phone);
        add(insert);
        add(delete);
        add(display);
        add(displayArea);
        insert.addActionListener(this);
        delete.addActionListener(this);
        display.addActionListener(this);
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:connection");
            stmt = con.createStatement();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == insert) {
                String studentName = name.getText();
                int ageValue = Integer.parseInt(age.getText());
                String studentAddress = address.getText();
                String studentCourse = course.getText();
                long phoneValue = Long.parseLong(phone.getText());

                String insertQuery = "INSERT INTO students (name, age, address, course, phone) VALUES ('" +
                        studentName + "', " + ageValue + ", '" + studentAddress + "', '" + studentCourse + "', " + phoneValue + ")";
                stmt.executeUpdate(insertQuery);
                displayArea.setText("Student inserted successfully!");

            } else if (e.getSource() == delete) {
                int idValue = Integer.parseInt(studentId.getText());
                String deleteQuery = "DELETE FROM students WHERE id = " + idValue;
                int rowsAffected = stmt.executeUpdate(deleteQuery);

                if (rowsAffected > 0) {
                    displayArea.setText("Student deleted successfully!");
                } else {
                    displayArea.setText("Student not found.");
                }

            } else if (e.getSource() == display) {
                String selectQuery = "SELECT * FROM students";
                ResultSet rs = stmt.executeQuery(selectQuery);

                displayArea.setText("ID\tName\tAge\tAddress\tCourse\tPhone\n");
                displayArea.append("------------------------------------------------------\n");
                while (rs.next()) {
                    displayArea.append(
                            rs.getInt("id") + "\t" +
                            rs.getString("name") + "\t" +
                            rs.getInt("age") + "\t" +
                            rs.getString("address") + "\t" +
                            rs.getString("course") + "\t" +
                            rs.getLong("phone") + "\n"
                    );
                }
            }
        } catch (Exception ex) {
           System.out.println(ex);
        }
    }
    
}
