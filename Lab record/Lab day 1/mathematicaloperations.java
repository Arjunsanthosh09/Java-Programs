/*Write a package to perform the mathematical operations - Addition, Subtraction, 
Multiplication, Division, and Modulus. Write a menu-driven program for all these 
operations and import the package for the above-said operations.*/

import operations.operators;
import java.io.DataInputStream;

public class mathematicaloperations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        DataInputStream in=new DataInputStream(System.in);
        int n1,n2;
        try {
            System.out.println("Enter the first number :");
            n1=Integer.parseInt(in.readLine());
            System.out.println("Enter the second number :");
            n2=Integer.parseInt(in.readLine());

            operators obj=new operators();
            obj.add(n1, n2);
            obj.sub(n1, n2);
            obj.div(n1, n2);
            obj.mult(n1, n2);
            obj.reminder(n1, n2);
        } catch (Exception e) {
        }
    }
    
}
