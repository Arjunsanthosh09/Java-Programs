// 17.Write a java application program to print odd and even numbers less than 100 using multithreading. 


class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) { 
                    System.out.println("Odd number: " + i);
                    Thread.sleep(500); 
                }
            }
        } catch (InterruptedException e) {
            System.out.println("OddThread interrupted: " + e.getMessage());
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) { 
                    System.out.println("Even number: " + i);
                    Thread.sleep(500); 
                }
            }
        } catch (InterruptedException e) {
            System.out.println("EvenThread interrupted: " + e.getMessage());
        }
    }
}

public class lessthread {
    public static void main(String ar[]) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start(); 
        evenThread.start(); 
    }
}
