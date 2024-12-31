/*Write a Java program that implements a multi-thread application that has three threads. 
The first thread generates a multiplication table of 3. The second thread generates the 
multiplication table of 7. The third thread gives the multiplication table of 9. Display 
the output interchangeably with proper delay.  */


class three extends Thread{
    public void run(){
        int n=3;
        for(int i=1;i<=10;i++){
            System.out.println("Multiplication of "+n+"*"+i+"= "+n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class seven extends Thread{
    public void run(){
        int n=7;
        for(int i=1;i<=10;i++){
            System.out.println("Multiplication of "+n+"*"+i+"= "+n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class nine extends Thread{
    public void run(){
        int n=9;
        for(int i=1;i<=10;i++){
            System.out.println("Multiplication of "+n+"*"+i+"= "+n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multiplicationtablethread {
    public static void main(String[] args) {
        three three=new three();
        seven seven=new seven();
        nine nine=new nine();

        three.start();
        seven.start();
        nine.start();
    }
}
