/*Create an interface Department containing attributes deptName and deptHead. It has an 
abstract method showData() for printing the attributes. Create a class Hostel containing 
hostelname, hostellocation and noofrooms and also have methods readData() and 
printData() for reading and printing the details. Then write another class named Student 
extending the Hostel class and implementing the Department interface. This class 
which contains the attributes studname, regno, electivesub and avgmark. Use getData() 
and displayData() for reading and printing the details.*/


import java.io.DataInputStream;
interface department{
    static String deptName="Computer";
    static String deptHead="Roji sir";
    public  abstract void showData();
}

class Hostel{
    static DataInputStream in=new DataInputStream(System.in);
    String hostelname,hostellocation;
    int noofrooms;

    @SuppressWarnings("deprecation")
    public void readData(){
        try{
            System.out.println("Enter the hostel name :");
            hostelname=in.readLine();
            System.out.println("Enter the hostel location : ");
            hostellocation=in.readLine();
            System.out.println("Enter the number of rooms in the hostel :");
            noofrooms=Integer.parseInt(in.readLine());
        }catch(Exception e){}   
    }
    public void printData(){
        System.out.println("Hostel Name :"+hostelname);
        System.out.println("Hostel Location :"+hostellocation);
        System.out.println("No: of Rooms : "+noofrooms);
    }
}

class Student extends Hostel implements department{

    String studname, electivesub;
    Float avgmark;
    int  regno;

    public void showData() {
        System.out.println("Department name :"+deptName);
        System.out.println("Department Head:"+deptHead); 
    }
    @SuppressWarnings("deprecation")
    public void getData(){
        try{
            System.out.println("Enter the Student name :");
            studname=in.readLine();
            System.out.println("Enter the Register numbser :");
            regno=Integer.parseInt(in.readLine());
            System.out.println("Enter the elective Subject  :");
            electivesub=in.readLine();
            System.out.println("Enter the Average mark (in 100):");
            avgmark=Float.parseFloat(in.readLine());
            
        }catch(Exception e){}
    }

    public void  displayData(){
        System.out.println("-------Student Details----------");
        System.out.println("Student Name :"+studname);
        System.out.println("Student Register Name :"+regno);
        System.out.println("Elective Subject :"+electivesub);
        System.out.println("Average Mark :"+avgmark);
        showData();
        printData();

    }   
}
public class studentsdetailsdephostel {
    public static void main(String ar[]) {
        Student obj=new Student();
        obj.getData();
        obj.readData();
        obj.displayData();
       
    }
}
