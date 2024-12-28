// // 9.	Write a Java Program to create a class Factorial for
//  computing factorial of number using a user defined package fact.

package Factorial;
public class packagefactorial {
    public void fac(int n){
        int facct=1;
        
            for(int i=1;i<=n;i++){   
                facct*=i;    
            }
            System.out.println("Factorial of "+n+" is "+facct);   
    }
}
