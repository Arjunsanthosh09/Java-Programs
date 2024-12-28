// Write a program to display roll number,marks of 2 subjects,sports weightage mark and total 
// score of a student using interfaces

import java.io.DataInputStream;

interface Innercalculatemark {
    public void read();
    public float calculate();
    public void display();
    
}
public class calculatemark implements Innercalculatemark{
    int rollno;
    float mark1,mark2,sportmark;
    DataInputStream in=new DataInputStream(System.in);
    public void read() {
        try{
            System.out.println("enter the student Roll no:");
            rollno=Integer.parseInt(in.readLine());
            System.out.println("Enter the Mark 1 (out of 100) :");
            mark1=Float.parseFloat(in.readLine());
            System.out.println("Enter the Mark 2 (out of 100) :");
            mark2=Float.parseFloat(in.readLine());
            System.out.println("Enter the Mark of Sport weightage mark (out of 100) :");
            sportmark=Float.parseFloat(in.readLine());
        }catch(Exception e){}  
    }
    public float calculate() {
        float total = mark1 + mark2;
        if (total < 200) {
            float diff = 200 - total;
            total += Math.min(diff, sportmark);
        } else {
            total += sportmark; 
        }
        
        return total;   
    }
    public void display() {

        System.out.println("Roll No: "+rollno);
        System.out.println("Mark 1: "+mark1);
        System.out.println("Mark 2 :"+mark2);
        System.out.println("Sport weightage Mark :"+sportmark);
        System.out.println("Total mark  :"+calculate());
    }

    public static void main(String ar[]) {
        calculatemark obj=new calculatemark();
        obj.read();
        obj.display();
    }
    
}
