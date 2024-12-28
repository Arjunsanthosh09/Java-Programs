// 6.	Create an interface Shape and a child class Circle.
//  Shape has member function calculateArea() and a constant data member pi(3.14). 
//  Write a java program to compute area

import java.io.DataInputStream;

abstract class Shape {
    final double pi = 3.14;

    abstract public void calculateArea(double r);
}

public class circle extends Shape {
    public void calculateArea(double r) {
        double res = pi * r;
        System.out.println("Area of the triangle is " + res);
    }

    public static void main(String ar[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            double r;
            System.out.println("Enter the radius of the circle:");
            r = Double.parseDouble(in.readLine());
            circle obj = new circle();
            obj.calculateArea(r);
        } catch (Exception e) {

        }

    }
}
