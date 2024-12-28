public class ArmstrongNumbers {
    public static void main(String ar[]) {
        for (int num = 100; num < 1000; num++) {
            int sum = 0;
            int temp = num;
            int digitCount = 3;           
            while (temp != 0) {
                int digit = temp % 10;  
                sum += Math.pow(digit, digitCount);  
                temp /= 10;  
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}