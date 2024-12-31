// Write a Java program that implements educational hierarchy using inheritance.

import java.io.DataInputStream;
class office{
    DataInputStream in=new DataInputStream(System.in);
    int empno;
    String empname;
    float salary;
    @SuppressWarnings("deprecation")
    public void getvalue(){
        try {
    
            System.out.println("enter the employee no. :");
            empno=Integer.parseInt(in.readLine());
            System.out.println("Enter the emplpoyee name :");
            empname=in.readLine();
            System.out.println("Enter the  salary :");
            salary=Float.parseFloat(in.readLine());
        } catch (Exception e) {
        }
        
    }
    public void display(){
        System.out.println("Employee number:"+empname);
        System.out.println("Employee name :"+empname);
        System.out.println("Salary :"+salary);
    }
}
class Teaching  extends office{
   String  Designation; 
    @SuppressWarnings("deprecation")
    public void setvalue(){
        try {
            getvalue();
            System.out.println("Enter the Teaching staff designation:");
            Designation=in.readLine();
        } catch (Exception e) {
        }
       
    } 
    public void display(){
        super.display();
        System.out.println("Teaching staff designation :"+Designation);
    }
}


class NonTeaching extends office{
    String Designation; 
    @SuppressWarnings("deprecation")
    public void setvalue(){
        try {
            getvalue();
            System.out.println("enter the nonTeaching staff designation :");
            Designation=in.readLine();
        } catch (Exception e) {
          
        }
        
    }
    public void displayData(){
        System.out.println("Designation of the non teaching staff :"+Designation);
    }

}

public class educational {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        DataInputStream in=new DataInputStream(System.in);
        int n;
        Teaching teach=new Teaching();
        NonTeaching nonteach=new NonTeaching();
        System.out.println("option \n1.teaching staff \n 2. Non teaching staff");
        try {
            n=Integer.parseInt(in.readLine());
            if (n==1) {
                teach.setvalue(); 
                teach.display();
            }else if (n==2) {
                nonteach.setvalue();
                nonteach.displayData(); 
            }else{
                System.out.println("Invalid choice..");
            }
        } catch (Exception e) {
            
        }
       
    }
    
}