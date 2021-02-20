import java.util.Scanner;

public class Matrix {

//added
//multiply
//transponed
import java.util.Scanner;
public class Matrix {
    private int row = 0;
    private int column = 0;
    private double[][] matrix;

    public void action (int num) {
        switch (num) {
      case 0: // add

      Matrix two = new Matrix(this.row, this.column);
      Matrix three = this.add(two);
      print(three);
          break;
      case 1: // multiply

      //1-r, 2 - c
      Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();


      Matrix two = new Matrix(n, m);
      Matrix three = this.multiply(two);
      print(three);


          break;
      case 2: // transpond
      Matrix two = new Matrix(this.column, this.row);
      two = this.transpond(two);
      print(two);

          break;
    case 3://determinant
    break;
      case 4: // print
      print(this);

          break;
      default:
      System.out.println("wrong action");

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
//determiner




//-----------Main file

/*

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();


    Matrix at = new Matrix(n, m);

      //double[][] matrix = new double[n][m];
      int act = sc.nextInt();

      at.action();

	}
}

*/
