/*Write a Java program that creates a class named 'Employee' having the following 
members: Name, Age, Phone number, Address, and Salary. It also has a method named 
'printSalary( )' which prints the salary of the Employee. Two classes 'Officer' and 
'Manager' inherit the 'Employee' class. The 'Officer' and 'Manager' classes have 
data members 'specialization' and 'department' respectively. Now, assign name, age, 
phone number, address, and salary to an officer and a manager by making an object of 
both of these classes and print the same.*/

import java.io.DataInputStream;


class Employee {
    String name;
    int age;
    String phone;
    String address;
    double salary;

    public Employee(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    public Officer(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
}

public class EmployeeDemo {
    public static void main(String ar[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.print("Enter Officer Name: ");
            String officerName = in.readLine();
            System.out.print("Enter Officer Age: ");
            int officerAge = Integer.parseInt(in.readLine());
            System.out.print("Enter Officer Phone: ");
            String officerPhone = in.readLine();
            System.out.print("Enter Officer Address: ");
            String officerAddress = in.readLine();
            System.out.print("Enter Officer Salary: ");
            double officerSalary = Double.parseDouble(in.readLine());
            System.out.print("Enter Officer Specialization: ");
            String officerSpecialization = in.readLine();


            Officer officer = new Officer(officerName, officerAge, officerPhone, officerAddress, officerSalary,
                    officerSpecialization);

            System.out.print("Enter Manager Name: ");
            String managerName = in.readLine();
            System.out.print("Enter Manager Age: ");
            int managerAge = Integer.parseInt(in.readLine());
            System.out.print("Enter Manager Phone: ");
            String managerPhone = in.readLine();
            System.out.print("Enter Manager Address: ");
            String managerAddress = in.readLine();
            System.out.print("Enter Manager Salary: ");
            double managerSalary = Double.parseDouble(in.readLine());
            System.out.print("Enter Manager Department: ");
            String managerDepartment = in.readLine();

            Manager manager = new Manager(managerName, managerAge, managerPhone, managerAddress, managerSalary,
                    managerDepartment);

            System.out.println("\nOfficer Details:");
            System.out.println("Name: " + officer.name);
            System.out.println("Age: " + officer.age);
            System.out.println("Phone: " + officer.phone);
            System.out.println("Address: " + officer.address);
            officer.printSalary();
            System.out.println("Specialization: " + officer.specialization);

            System.out.println("\nManager Details:");
            System.out.println("Name: " + manager.name);
            System.out.println("Age: " + manager.age);
            System.out.println("Phone: " + manager.phone);
            System.out.println("Address: " + manager.address);
            manager.printSalary();
            System.out.println("Department: " + manager.department);
        } catch (Exception e) {
          
        }

    }
}
