// 7.	Write a java program to find the details of the students eligible 
// to enroll for the examination (Students, Department combinedly give the eligibility 
// criteria for the enrollement class) using interfaces.
    
import java.io.DataInputStream;

interface Student {
    void getValue(int no, String name, String classname);
}

interface Department {
    void getAttendance(double att);
}

interface Exam extends Student, Department {
    void calculateAttendance();

    boolean Eligible();
}

class AttendanceOfStudent implements Exam {
     int studentId;
    String studentName;
    String className;
        double attendance;

    public void getValue(int no, String name, String classname) {
        this.studentId = no;
        this.studentName = name;
        this.className = classname;
    }

    public void getAttendance(double att) {
        this.attendance = att;
    }

    public void calculateAttendance() {
        System.out.println("Attendance is : " + attendance + "%");
    }

    public boolean Eligible() {

        if (attendance >= 75) {
            return true;

        } else {
            return false;
        }
    }

    public void displayDetails() {
        System.out.println("\n---- Student Details ----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Class: " + className);
    }
}

public class StudentEligibility {
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        try {
            System.out.println("Enter the number of students: ");
        int numStudents = Integer.parseInt(in.readLine());

        AttendanceOfStudent students[] = new AttendanceOfStudent[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("Student ID: ");
            int id = Integer.parseInt(in.readLine());

            System.out.print("Student Name: ");
            String name = in.readLine();

            System.out.print("Class Name: ");
            String classname = in.readLine();

            System.out.print("Attendance (%): ");
            double attendance = Double.parseDouble(in.readLine());
            students[i] = new AttendanceOfStudent();
            students[i].getValue(id, name, classname);
            students[i].getAttendance(attendance);
        }

        System.out.println("\n--- Eligibility Results ---");

        for (AttendanceOfStudent student : students) {
            student.displayDetails();
            student.calculateAttendance();
            if (student.Eligible()) {
                System.out.println("Status: Eligible for Exam");
            } else {
                System.out.println("Status: Not Eligible for Exam");
            }
            System.out.println("--------------------------");
        }
            
        } catch (Exception e) {
        }
        

    }
}
