// 31.Create a mysql table employee(empno varchar(10) primary key, ename varchar(10),department varchar(10))
//  and insert five records. Write a java program to display the employee’s records in the order 
//  of department name.

import java.sql.*;

class EmployeeRecords {
    public static void main(String ar[]) {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String dsn = "jdbc:odbc:connection"; 
            Connection con = DriverManager.getConnection(dsn);
            Statement stmt = con.createStatement();
            String query = "SELECT empno, ename, department FROM employee ORDER BY department";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("Employee Number: " + rs.getString("empno"));
                System.out.println("Employee Name: " + rs.getString("ename"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("---------------------------");
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
