// 2.	Write a java program to perform the arithmetic operations using the concept of method overloading.
//     a) Get two integers as input and return float value as output.
//     b) Get two float value as input and return integer value as output.


import java.io.DataInputStream;

public class methodoverloadingintandfloat {

    int n1, n2, res2;
    float res1;

    public void add(int n1, int n2) {
        res1 = n1 + n2;
        System.out.println(n1 + "+" + n2 + "=" + res1);
    }

    public void add(float m3, float m4) {
        int m1 = (int) m3;
        int m2 = (int) m4;
        res2 = m1 + m2;
        System.out.println(m1 + "+" + m2 + "=" + res2);
    }

    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter integer number 1: ");
            int n1 = Integer.parseInt(in.readLine());
            System.out.println("Enter integer number 2: ");
            int n2 = Integer.parseInt(in.readLine());
            System.out.println("Enter float number 1: ");
            float m1 = Float.parseFloat(in.readLine());
            System.out.println("Enter float number 2: ");
            float m2 =Float.parseFloat(in.readLine());  
            methodoverloadingintandfloat obj = new methodoverloadingintandfloat();
            System.out.println("Results are :");
            obj.add(n1, n2);  
            obj.add(m1, m2); 
        }catch(Exception e){}
        
 
    }
}
