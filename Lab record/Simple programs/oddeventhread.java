// 10.	Write a Java program to implement two threads, one for printing odd numbers 
// and another for even numbers simultaneously.

class OddThread extends Thread {
    int n = 10;
    public void run() {
        try {
            for (int i = 1; i <= n; i++) { 
                if(i % 2 ==1){
                    System.out.println("Odd number: " + i);
                    Thread.sleep(1000); 
                }
            }
        } catch (Exception e) {
        }
    }
}

class EvenThread extends Thread {
    int n = 10;

    public void run() {
        try {
            for (int i = 1; i <= n; i++) { 
                if(i % 2 ==0){
                    System.out.println("Even number: " + i);
                    Thread.sleep(1000); 
                }
            }
        } catch (Exception e) {
        }
    }
}

public class oddeventhread {
    public static void main(String ar[]) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();
        
        
    }
}
