
import java.util.Scanner;
public class Matrix {
    private int row = 0;
    private int column = 0;
    private double[][] matrix;

    public void action (int num) {
        switch (num) {
            case 0: // add

             Matrix two0 = new Matrix(this.row, this.column);
             Matrix three0 = this.add(two0);
            print(three0);
            break;

            case 1: // multiply

            //1-r, 2 - c
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();


            Matrix two1 = new Matrix(n, m);
            Matrix three1 = this.multiply(two1);
            print(three1);


            break;

            case 2: // transpond
            Matrix two2 = new Matrix(this.column, this.row);
            two2 = this.transpond(two2);
            print(two2);

            break;

            case 3: // print
            print(this);

            break;

            default:
            System.out.println("wrong action");
            break;

        }
    }





    public Matrix(int r, int c) {

		Scanner sc = new Scanner(System.in);

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    this.matrix[i][j] = sc.nextDouble();
                }
            }

    }

    public Matrix add (Matrix b) {
        Matrix c = new Matrix(this.row, this.column);
        for (int i = 0; i < this.row; ++i) {
            for(int j = 0; j < this.column; ++j) {
                c.matrix[i][j] = this.matrix[i][j] + b.matrix[i][j];
            }
        }
        return c;
    }

    public Matrix multiply (Matrix b) {

        Matrix m = new Matrix(this.matrix.length, b.matrix[0].length);
        for (int r = 0; r < m.matrix.length; r++) {
            for (int c = 0; c < m.matrix[0].length; c++) {
                int sum = 0;
                for (int i = 0; i < matrix[0].length; i++) {
                    sum += matrix[r][i] * m.matrix[i][c];
                }
                m.matrix[r][c] = sum;
            }
        }
        return m;
    }

    public Matrix transpond (Matrix b) {

        for (int i = 0; i < this.row; ++i) {
            for (int j = 0; j < this.column; ++j) {
                b.matrix[j][i] = this.matrix[i][j];
            }

        }
        return b;
    }

    public void print (Matrix a) {
        for (int i = 0; i < a.row; ++i) {
            for(int j = 0; j < a.column; ++j) {
                System.out.print(" "+a.matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

    }

}


//-----------Main file

/*

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {


	System.out.println("enter size: n*m :");

	Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();


    Matrix at = new Matrix(n, m);

      //double[][] matrix = new double[n][m];

      /*for (int i = 0; i < n; ++i) {
          for (int j = 0; j < m ; ++j ) {
              matrix[i][j] = sc.nextDouble;
          }
      }*\


	}
}

*/
