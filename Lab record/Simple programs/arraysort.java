//Sort n numbers in a array

import java.io.DataInputStream;
import java.util.Arrays;
public class arraysort {
    public static void main(String[] args) {
        DataInputStream in=new DataInputStream(System.in);
        int n;
        try {
            System.out.println("Enter the size of the array  :");
            n=Integer.parseInt(in.readLine());
            int number[]=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the value "+i+1);
                number[i]=Integer.parseInt(in.readLine());
            }
            System.out.println("Array Before sorting..");
            for(int num : number){
                System.out.println(num);
            }
            System.out.println("Array After sorting..");
            Arrays.sort(number);
            for(int sorted : number){
                System.out.println(sorted);
            }

        } catch (Exception e) {
        }
    
    }

        
        
}

