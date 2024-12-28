// 11.	Write a Java program to implement two threads one for printing prime numbers and 
// the other for printing even numbers simultaneously.

package program;

public class checkprime {
   public  boolean primecheck(int num){
       if(num<=1){
            return false;
       }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if (num% i==0) {
                return false;
            }
        }
        return true;
    }
}
