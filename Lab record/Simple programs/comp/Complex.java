// 8.	Write a Java program to create a class Complex for reading and displaying a complex number
//  under a user defined package comp.

package comp;

public class Complex {
    float real, imaginary;
    public Complex(float r, float im) {
        real = r;
        imaginary = im;
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}
