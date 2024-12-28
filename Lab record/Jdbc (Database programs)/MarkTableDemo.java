// 32.Create a mysql table mark(regno int primary key, sname varchar(10),mark int) 
// and insert five records. Write a Java program to read and display the content of mark table.


import java.sql.*;

public class MarkTableDemo {
    public static void main(String ar[]) {
        try {
            // Load the ODBC driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String dsn = "jdbc:odbc:Connect"; 
            Connection con = DriverManager.getConnection(dsn); 
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM mark";
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("RegNo\tName\tMark");
            
            while (rs.next()) {
                System.out.println(
                    rs.getInt("regno") + "\t" +
                    rs.getString("sname") + "\t" +
                    rs.getInt("mark")
                );
            }
            rs.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
