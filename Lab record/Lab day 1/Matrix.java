/*Create a class called Matrix which contains a 2d integer array, m & n (order of matrix) 
as data members. Include the following member functions  
a. To read the matrix, 
b. To display the matrix, 
c. Overload  a method product () to find the product of two matrices and multiply 
each element of a matrix with a constant value*/


import java.io.DataInputStream;
public class Matrix {

   int rows;
    int cols;
    int[][] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void readMatrix() {
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    matrix[i][j] = Integer.parseInt(in.readLine());
                } catch (Exception e) {
                }
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            System.out.println("Matrices cannot be multiplied. Incompatible dimensions.");
            return null;
        }

        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                result.matrix[i][j] = 0;
                for (int k = 0; k < this.cols; k++) {
                    result.matrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return result;
    }

    public Matrix scalarMultiply(int scalar) {
        Matrix result = new Matrix(this.rows, this.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.matrix[i][j] = this.matrix[i][j] * scalar;
            }
        }
        return result;
    }

    public static void main(String[] args)  {
        DataInputStream in = new DataInputStream(System.in);
        try{
            System.out.print("Enter the order of matrix 1 (rows cols): ");
        
        int rows1 = Integer.parseInt(in.readLine());
        int cols1 = Integer.parseInt(in.readLine());
        Matrix matrix1 = new Matrix(rows1, cols1);
        matrix1.readMatrix();

        System.out.print("Enter the order of matrix 2 (rows cols): ");
        int rows2 = Integer.parseInt(in.readLine());
        int cols2 = Integer.parseInt(in.readLine());
        Matrix matrix2 = new Matrix(rows2, cols2);
        matrix2.readMatrix();

        System.out.println("\nMatrix 1:");
        matrix1.displayMatrix();

        System.out.println("\nMatrix 2:");
        matrix2.displayMatrix();

        if (cols1 == rows2) {
            Matrix productMatrix = matrix1.multiply(matrix2);
            if (productMatrix != null) {
                System.out.println("\nProduct of Matrix 1 and Matrix 2:");
                productMatrix.displayMatrix();
            }
        }

        System.out.print("Enter the scalar value: ");
        int scalar = Integer.parseInt(in.readLine());
        Matrix scalarProductMatrix = matrix1.scalarMultiply(scalar);
        System.out.println("\nScalar product of Matrix 1 with " + scalar + ":");
        scalarProductMatrix.displayMatrix();
        }catch(Exception e){}
        
    }
}
