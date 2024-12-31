/*Write a Java program that accepts n numbers as input. 
The program should raise a custom exception if any negative number is entered.*/

import java.io.DataInputStream;
public class exceptionencounternegative {
    @SuppressWarnings("deprecation")
    public static void main(String ar[]) {
        int n;
        DataInputStream in=new DataInputStream(System.in);
        try {
            System.out.println("enter the size of the array :");
            n=Integer.parseInt(in.readLine());
            int num[]=new int[n];

            System.out.println("Enter the elements in to the array:");
            for(int i=0;i<n;i++){
                num[i]=Integer.parseInt(in.readLine());
                if (num[i]<0) {
                    throw new NegativeException("A negative number has found....");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NegativeException extends Exception{
    public NegativeException(String message){
        System.out.println(message);
    }
}
