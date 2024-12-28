// 11.	Write a Java program to implement two threads one for printing prime numbers and
//  the other for printing even numbers simultaneously.

import program.checkprime;
import java.io.DataInputStream;

public class primenumber {
    public static void main(String ar[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            boolean allDigitsPrime = true;
            System.out.println("Enter the number:");
            int n = Integer.parseInt(in.readLine());
            checkprime obj = new checkprime();
            if (obj.primecheck(n)) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }

            int temp = n;
            while (temp > 0) {
                int digit = temp % 10; 
                if (!obj.primecheck(digit)) { 
                    allDigitsPrime = false;
                    break;
                }
                temp = temp / 10; 
            }

            if (allDigitsPrime) {
                System.out.println("All digits are prime.");
            } else {
                System.out.println("Not all digits are prime.");
            }
        } catch (Exception e) {
        }
    }
}
