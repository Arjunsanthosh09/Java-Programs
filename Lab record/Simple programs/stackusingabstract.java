
// 12. Demonstrate stack using interface

import java.io.DataInputStream;


interface Innerstackusingabstract {
    void push(int item);
    void pop();
    void display();
}

public class stackusingabstract implements Innerstackusingabstract {
    private int n; 
    private int top = -1; 
    private int[] ar; 

    public stackusingabstract(int size) {
        n = size;
        ar = new int[n];
    }

  
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) { 
                System.out.println(ar[i]);
            }
        }
    }

 
    public void push(int item) {
        if (top == n - 1) {
            System.out.println("Stack overflow. The stack is full.");
        } else {
            ar[++top] = item;
            System.out.println("Push operation successful. Added: " + item);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow. The stack is empty.");
        } else {
            System.out.println("Deleted element: " + ar[top--]);
        }
    }

    public static void main(String ar[]) {
        DataInputStream in = new DataInputStream(System.in);
        try {
            System.out.print("Enter the size of the stack: ");
            int size = Integer.parseInt(in.readLine());

            stackusingabstract obj = new stackusingabstract(size);
            int choice;

            do {
                System.out.println("\nOptions:");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(in.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int element = Integer.parseInt(in.readLine());
                        obj.push(element);
                        break;
                    case 2:
                        obj.pop();
                        break;
                    case 3:
                        obj.display();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);

        } catch (Exception e) {
           
        }
    }
}
