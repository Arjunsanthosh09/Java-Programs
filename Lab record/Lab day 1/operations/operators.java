package operations;

public class operators {
    public void add(int n1,int n2){
        System.out.println("Addition of"+n1+"+"+n2+"  : "+(n1+n2));
    }
    public void sub(int n1,int n2){
        int res=n1-n2;
        System.out.println("Substraction of"+n1+"-"+n2+" : "+res);
    }
    public void div(int n1,int n2){
        System.out.println("Division of"+n1+"/"+n2+" : "+n1/n2);
    }
    public void mult(int n1,int n2){
        System.out.println("Multiplication of"+n1+"*"+n2+" : "+n1*n2);
    }
    public void reminder(int n1,int n2){
        System.out.println("Reminder  of"+n1+"%"+n2+" : "+n1%n2);
    }
}
