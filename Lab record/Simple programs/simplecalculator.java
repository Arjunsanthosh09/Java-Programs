// 34.Write a java program to implement a simple Calculator

import java.io.DataInputStream;
public class simplecalculator {
    static DataInputStream in=new DataInputStream(System.in);
    static int n1,n2;
    public void read(){
        try {
            System.out.println("enter the first number :");
            n1=Integer.parseInt(in.readLine());
            System.out.println("Enter the second number :");
            n2=Integer.parseInt(in.readLine());
        } catch (Exception e) {
        }
    }
    public static void main(String ar[]) {
        int choice;
        simplecalculator obj=new simplecalculator();
        try {
            while (true) {
                System.out.println("Options :");
                System.out.println("1.Enter Number");
                System.out.println("2. Add");
                System.out.println("3.Substract");
                System.out.println("4.Division");
                System.out.println("5.Multiplication");
                System.out.println("6.Reminder");
                System.out.println("7.Exiting");
                System.out.println("Enter your choice:");
                choice=Integer.parseInt(in.readLine());

                switch (choice) {
                    case 1:
                        obj.read();
                        break;
                    case 2:
                        int add=n1+n2;
                        System.out.println("Addition of "+n1+"+"+n2+"= "+add);
                        break;
                    case 3:
                        int sub=n1-n2;
                        System.out.println("Substraction of "+n1+"-"+n2+"= "+sub);
                        break;
                    case 4:
                        int div=n1/n2;
                        System.out.println("Division of "+n1+"/"+n2+"= "+div);
                        break;
                    case 5:
                        int mult=n1*n2;
                        System.out.println("Multipliaction of "+n1+"*"+n2+"= "+mult);
                        break;
                    case 6:
                        double remin=n1%n2;
                        System.out.println("Addition of "+n1+"%"+n2+"= "+remin);
                        break;
                    case 7:
                        System.out.println("Exiting....");
                        return;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
