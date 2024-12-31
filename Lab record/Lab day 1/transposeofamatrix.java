/*Write a Java program to create a class called Matrix that contains a two-dimensional 
integer array matrix as a data member. Implement the following functionalities:

Read the Matrix: Accept elements of the matrix from the user.
Display the Matrix: Print the matrix in its original form.
Transpose the Matrix: Compute and display the transpose of the matrix.*/

import java.io.DataInputStream;
public class transposeofamatrix {
    static DataInputStream in=new DataInputStream(System.in);
    int row,col;
    int m[][];
    public transposeofamatrix(int r,int c){
        row=r;
        col=c;
        m= new int [row][col];
    }
    @SuppressWarnings("deprecation")
    public void read(){
        try {
            System.out.println("Enter the elements in to the matrix:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    m[i][j]=Integer.parseInt(in.readLine());
                }
            }
        } catch (Exception e) {
        }
    }
    public void display(){
        System.out.println("elements in  the matrix:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(m[i][j]+"  ");
                }
                System.out.println();
            }
    }
    public void transpose(){
        System.out.println("Transpose of the matrix:");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(m[j][i]+"  ");
                }
                System.out.println();
            }
    }

   @SuppressWarnings("deprecation")
public static void main(String ar[]) {
        
        try {
            System.out.println("enter the size of the row :");
            int r=Integer.parseInt(in.readLine());
            System.out.println("enter the number of columns:");
            int c=Integer.parseInt(in.readLine());
            transposeofamatrix obj=new transposeofamatrix(r, c);

            obj.read();
            obj.display();
            obj.transpose();
        } catch (Exception e) {
        }
   } 
}
