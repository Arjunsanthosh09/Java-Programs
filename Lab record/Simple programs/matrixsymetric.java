//write a java program to find the a matrix is symmetric or not


import java.io.DataInputStream;

public class matrixsymetric {
    @SuppressWarnings("deprecation")
    public static void main(String ar[]) {
        DataInputStream in=new DataInputStream(System.in);
        int row,col,flag=0;
        try {
            System.out.println("enter the number of rows :");
            row=Integer.parseInt(in.readLine());
            System.out.println("enter the number of column :");
            col=Integer.parseInt(in.readLine());
            int arr[][]=new int[row][col];
            if (row!=col) {
                System.out.println("The array is not  symmetric, Its not a square matrix.");
                return;
            }
            else{
                System.out.println("enter the elements in to the array :");
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        arr[i][j]=Integer.parseInt(in.readLine());
                    }
                }
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        if (arr[i][j]!=arr[j][i]) {
                            flag=0;
                        }
                        else{
                            flag=1;
                        }
                    }
                }
               
                if (flag==0) {
                    System.out.println("The givem metrix is not  symmetric...");
                }else{
                    System.out.println("The givem metrix is  symmetric...");
                }
            }
        
        } catch (Exception e) {
        }
    }
}
