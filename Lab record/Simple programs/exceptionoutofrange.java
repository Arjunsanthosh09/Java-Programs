//  Write a program in java if number is less than 10 and greater than 50 it generate the exception out of range. 
// Else it displays the square of number.

import java.io.DataInputStream;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class exceptionoutofrange {
    public static void main(String ar[]) {
        try {
            DataInputStream in=new DataInputStream(System.in);
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(in.readLine());

            if (num < 10 || num > 50) {
                throw new OutOfRangeException("Number is out of range. It should be between 10 and 50.");
            }

            System.out.println("Square of the number is: " + (num * num));
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}

