// Write a program to create a package to find the factorial of a number .
// Import this package to find out nPr(n!/(n-r)!)

// import the other file from the factorialnew folder

import java.io.DataInputStream;
import factorialnew.fact;
public class nprcalculate {
    static DataInputStream in=new DataInputStream(System.in);
   
    public static void main(String[] args) {
        int n,r;
        try {
            System.out.println("Enter the value fo the n:");
            n=Integer.parseInt(in.readLine());
            System.out.println("Enter the value fo the r:");
            r=Integer.parseInt(in.readLine());
            fact obj2=new fact();
            int nfact=obj2.factorial(n);
            int nrfact=obj2.factorial(n-r);
            double res=nfact/nrfact;

            System.out.println("Npr :"+res);
        } catch (Exception e) {
        }
        
    }
}
