//finding the smallest and largest element from an array 

import java.io.DataInputStream;
public class smallandlargestinarray {
    @SuppressWarnings("deprecation")
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        int n,big,small;
        try{
            System.out.println("enter the size of the array :");
            n=Integer.parseInt(in.readLine());
            int number[]=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the number "+i+1);
                number[i]=Integer.parseInt(in.readLine()); 
                
            }
            small= number[0];
            big=number[0];
            for(int i=0;i<n;i++){
               

               if (number[i]>big) {
                    big=number[i];
               }
               if (number[i]<small) {
                    small=number[i];
               }

            }
            System.out.println("smallest number is "+small);
            System.out.println("Biggest number is "+big);
        }catch(Exception e){}

    }
}
