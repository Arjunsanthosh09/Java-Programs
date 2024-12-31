/*Write a Java Program to calculate the Result. The result should consist of name, seatno, 
date, center number, and marks of the semester three exam. Create a User-Defined 
Exception class MarksOutOfBoundsException, If Entered marks of any subject are 
greater than 100 or less than 0, then the program should create a user-defined Exception 
of type MarksOutOfBoundsException and must have a provision to handle it. */


import java.io.DataInputStream;

class MarksOutOfBoundsException extends Exception{
    public MarksOutOfBoundsException(String message){
        System.out.println(message);
    }
}
public class markexception {
   static DataInputStream in=new DataInputStream(System.in);
   @SuppressWarnings("deprecation")
public static void main(String[] args) {
        String name;
        int seatNo;
        String date;
        int centerNo;
        float m[]=new float[3];
        try{
            System.out.println("enter the name:");
            name=in.readLine();
            System.out.println("enter the Seat number:");
            seatNo=Integer.parseInt(in.readLine());
            System.out.println("enter the Date(in DD/MM/YYYY):");
            date=in.readLine();
            System.out.println("enter the center number:");
            centerNo=Integer.parseInt(in.readLine());
            for(int i=0;i<3;i++){
                System.out.println("enter the mark of subject "+i+1+" : ");
                m[i]=Float.parseFloat(in.readLine());
                if (m[i]<0 || m[i]>100) {
                    throw new MarksOutOfBoundsException("The marks should be greater than zero and less than 100...");
                }
                return;
            }

            System.out.println("Name :"+name);
            System.out.println("Seat number :"+seatNo);
            System.out.println("Date :"+date);
            System.out.println("Center number :"+centerNo);
            for(int i=0;i<3;i++){
                System.out.println("mark of subject "+i+1+" : "+m[i]);
            }




        }catch(Exception e){

        }
   } 
}
