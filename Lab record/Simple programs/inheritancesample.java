// Write a program to demonstrate inheritance.

import java.io.DataInputStream;
class vehicle{
    int vehicleyear;
    String regiplace;
    public void read(){
        DataInputStream in=new DataInputStream(System.in);
        try{
            System.out.println("Enter the Vehicle registration place: ");
            regiplace=in.readLine();
            System.out.println("Enter the Vehicle year :");
            vehicleyear=Integer.parseInt(in.readLine());
        }catch(Exception e){} 
    }
}
class car extends vehicle{
     DataInputStream in=new DataInputStream(System.in);
    String carname;
    String color;
    public void read(){
            try {
                
                System.out.println("Enter the car name :");
                carname=in.readLine(); 
                System.out.println("Enter the car color :");
                color=in.readLine(); 
                super.read();
            } catch (Exception e) {
            }
        }
        public void display(){
            System.out.println("Car Name :"+carname);
            System.out.println("Car color :"+color);
            System.out.println("Vehicle registration place :"+regiplace);
            System.out.println("Vehicle year :"+vehicleyear);
        }
    }
    public class inheritancesample {
        public static void main(String ar[]) {
            car obj1=new car();
            obj1.read();
            obj1.display();    
    }
}
