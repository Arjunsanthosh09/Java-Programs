// 9.	Write a Java Program to create a class Factorial for computing factorial of number
//  using a user defined package fact.

import java.io.DataInputStream;

import Factorial.packagefactorial;

public class newfactorial {
    public static void main(String ar[]) {
            DataInputStream in=new DataInputStream(System.in);
            try{
                int num;
                System.out.println("enter the number :");
                num=Integer.parseInt(in.readLine());
                packagefactorial obj=new packagefactorial();
                obj.fac(num);
            }catch(Exception e){}
           
    }
    
}
