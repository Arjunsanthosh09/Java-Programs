// 5.	Create an abstract class called Figure which contains three data members ( length, breadth and height). 
// Include an abstract method to find the area . Figure class also contains concrete methods to read 
// the data members and to display them. Derive two classes Rectangle and Triangle from Figure and 
// override area() to find the area of a rectangle and triangle

import java.io.DataInputStream;

abstract  class Figure{
    public double length, breadth,height;
    public void read(double l,double h, double b){
        length=l;
        height=h;
        breadth=b;
    }
    public abstract void area();
}

class Triangle extends Figure{
    public void area(){
        double res=0.50*breadth*height;
        System.out.println("Area of the Triangle is "+res);
    }
}
class Rectangle extends Figure{
    public void area(){
        double res=length*breadth;
        System.out.println("Area of the Rectangle  is "+res);
    }
}

public class areaabstract{
    @SuppressWarnings("deprecation")
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        double L=0,b=0,h=0;
        try {
            System.out.println("Enter the length :");
            L=Double.parseDouble(in.readLine());
            System.out.println("Enter the breadth :");
            b=Double.parseDouble(in.readLine());
            System.out.println("Enter the Height :");
            h = Double.parseDouble(in.readLine());
        } catch (Exception e) {
        }
        Triangle tri=new Triangle();
        tri.read(L, h, b);
        tri.area();
        Rectangle rect=new Rectangle();
        rect.read(L, h, b);
        rect.area();
    }
}