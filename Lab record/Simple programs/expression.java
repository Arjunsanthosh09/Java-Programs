
// 4.	Write a Java program to evaluate the expression x/(x-5) where x>5, if the value of x is less
//  than or equal to 5 throw a user defined exception.
import java.io.DataInputStream;

public class expression {
    public void exp(int x){
        if(x >5 ){
            throw new IllegalArgumentException("Number should be less than or equla to 5");
        }
        float result=x/(x-5);
        System.out.println("Result of expresssion x/(x-5) of number "+x+" is" + result);
    }
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        try {
            int num;
            System.out.println("Enter a number : ");
            num=Integer.parseInt(in.readLine());
            expression obj=new expression();
            obj.exp(num);        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}

