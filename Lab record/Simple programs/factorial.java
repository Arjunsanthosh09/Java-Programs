// 3.	Write a Java Program to print factorial of a given number. If the number is negative then throw a user defined exception.
import java.io.DataInputStream;
import java.io.IOException;

public class factorial {

    public void Fact(int num){
        int factnum=1;
        if(num < 0)
        {
            throw new  IllegalArgumentException("Negative values cannot be taken");
        }
        for(int i=1;i<=num;i++){
            factnum*=i;
        }
        System.out.println("Factorial of "+num+" is "+factnum);
    }
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        int n1;
        try {
            System.out.println("Enter the nuber to find the factorial : ");
            try {
                n1=Integer.parseInt(in.readLine());
                factorial obj1=new factorial();
                obj1.Fact(n1);
            } catch (IOException e) {
            }    
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
