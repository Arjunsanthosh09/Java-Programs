// 1.	Write a Java program to find the area of a triangle and rectangle using method overloading.

import java.io.DataInputStream;
public class methodoverloading {
    public void area(float width,float height){
        float result=width*height;
        System.out.println("Area of the rectangle ="+result);
    }
    public void area(float Const,float base,float height){
        float res=(base*height)/Const;
        System.out.println("Area of the Triangle = "+res);
        
    }
    public static void main(String ar[]) {
        DataInputStream data=new DataInputStream(System.in);
        try{
            System.out.println("Enter the Width of the rectangle :");
            float w=Float.parseFloat(data.readLine());
            System.out.println("Enter the height of the rectangle :");
            float h=Float.parseFloat(data.readLine());
            System.out.println("Enter the base length of the triangle :");
            float b=Float.parseFloat(data.readLine());
            System.out.println("Enter the base height of the triangle :");
            float height=Float.parseFloat(data.readLine());
            float Const=2;
            methodoverloading obj=new methodoverloading();
            obj.area(w, h);
            obj.area(Const, b, height);
        }catch(Exception e){}

    }
}
