// 15.Write a program to sort strings in alphabetical order.

import java.io.DataInputStream;
import java.util.Arrays;

public class alphabeticalsort {
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        int n;
        try {
            System.out.println("Enter the number of String to enter :");
            n=Integer.parseInt(in.readLine());
            String store[]=new String[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the string "+i);
                store[i]=in.readLine();
            }
            System.out.println("Strings before sorting....");
            for (String s : store) {
                System.out.println(s);
            }
            Arrays.sort(store);
            System.out.println("Strings after sorting:");
            for (String s : store) {
                System.out.println(s);
            }   

            
        } catch (Exception e) {
        }
        

    }
    
}
