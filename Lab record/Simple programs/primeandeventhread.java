import java.io.DataInputStream;

class prime extends Thread {
    int n;
    
    public void getnumber(int num) {
        n = num;
    }
    public void run() {
        try {
            if (n <= 1) {
                System.out.println("Enter a number greater than 1");
            } else {
                for (int num = 2; num <= n; num++) {
                    boolean isPrime = true;
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println(num + " is a Prime number.");
                        Thread.sleep(1000);
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
class even extends Thread {
    int n;
    public void get(int num) {
        n = num;
    }
    public void run() {
        try {
            for (int i = 2; i <= n; i += 2) {
                System.out.println("Even number: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}
public class primeandeventhread {
    public static void main(String ar[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.println("Enter the limit:");
            int num = Integer.parseInt(in.readLine());
            prime prime = new prime();
            even even = new even();
            prime.getnumber(num);
            even.get(num);
            
            prime.start();
            even.start();
        } catch (Exception e) {
        }
    }
}
