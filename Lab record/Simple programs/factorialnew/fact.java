// Write a program to create a package to find the factorial of a number .
// Import this package to find out nPr(n!/(n-r)!)

package factorialnew;
public class fact {
    public int factorial(int num){
        int result=1;
        if (num <=1) {
            System.out.println("Enter a number greater than 1");
        }
        else{
            for(int i=1;i<=num;i++){
                result*=i;

            }
            
        }
                return result;
    }
}
