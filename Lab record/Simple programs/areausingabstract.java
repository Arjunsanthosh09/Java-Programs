// 5.	Create an abstract class called Figure which contains three data members ( length, breadth and height).
//  Include an abstract method to find the area . Figure class also contains concrete methods to read 
//  the data members and to display them. Derive two classes Rectangle and Triangle from Figure and override area() 
//  to find the area of a rectangle and triangle. 

import java.io.DataInputStream;

abstract class Figure {
   int length, breadth, heigth;

   abstract void area();

   public void read(int l, int b, int h) {
      length = l;
      breadth = b;
      heigth = h;
   }

   public void display() {
      System.out.println("Length =" + length);
      System.out.println("Breadth =" + breadth);
      System.out.println("Height =" + heigth);
   }
}

class Rectangle extends Figure {
   public void area() {
      System.out.println("Area of the Rectangle = " + length * breadth);
   }
}

class Triangle extends Figure {
   public void area() {
      double result = 0.50 * breadth * heigth;
      System.out.println("Area of the Triangle = " + result);
   }
}

public class areausingabstract {
   public static void main(String ar[]) {
      DataInputStream in = new DataInputStream(System.in);
      try {
         int l, b, h;
         System.out.println("Enter the length : ");
         l = Integer.parseInt(in.readLine());
         System.out.println("Enter the Breadth : ");
         b = Integer.parseInt(in.readLine());
         System.out.println("Enter the Height : ");
         h = Integer.parseInt(in.readLine());

         Rectangle obj1 = new Rectangle();
         obj1.read(l, b, h);
         obj1.display();
         obj1.area();
         Triangle obj2 = new Triangle();
         obj2.read(l, b, h);
         obj2.area();
      } catch (Exception e) {
      }

   }
}