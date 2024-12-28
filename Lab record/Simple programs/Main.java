// 8.	Write a Java program to create a class Complex for reading and displaying a 
// complex number under a user defined package comp.

import java.io.DataInputStream;
import comp.Complex;

public class Main {
    public static void main(String ar[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.print("Enter the real part: ");
            float real = Float.parseFloat(in.readLine());
            System.out.print("Enter the imaginary part: ");
            float img = Float.parseFloat(in.readLine());
            Complex obj = new Complex(real, img);
        } catch (Exception e) {
        }

    }
}
