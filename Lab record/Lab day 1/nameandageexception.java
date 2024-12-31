/*Write a Java program to handle the following scenarios using custom exceptions:

Class Details: Create a program to accept student details, including Name, 
Roll Number, Age, and Course, from the user.
Age Validation: If the age of the student is not between 15 and 21 (inclusive), 
throw a user-defined exception called AgeNotWithInRangeException with an appropriate error message.
Name Validation: If the name contains any characters other than alphabets 
(e.g., numbers or special symbols), throw a user-defined exception called NameNotValidException 
with an appropriate error message. */

import java.io.DataInputStream;

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class AgeNotWithInRangeException extends Exception {
    public AgeNotWithInRangeException(String message) {
        super(message);
    }
}

public class nameandageexception {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        DataInputStream in = new DataInputStream(System.in);
        int rollNo;
        String name;
        int age;
        String course;

        try {
            // Input name
            System.out.println("Enter the Name:");
            name = in.readLine();

            // Input roll number
            System.out.println("Enter the Roll No:");
            rollNo = Integer.parseInt(in.readLine());

            // Input age
            System.out.println("Enter the Age:");
            age = Integer.parseInt(in.readLine());

            // Input course
            System.out.println("Enter the Course:");
            course = in.readLine();

            if (!name.matches("[a-zA-Z]+")) {
                throw new NameNotValidException("Name should not contain any numbers or special characters.");
            }
            if (age < 15 || age > 21) {
                throw new AgeNotWithInRangeException("Age should be greater than 15 and less than 21.");
            }

            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);

        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        } catch (AgeNotWithInRangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
        }
    }
}
