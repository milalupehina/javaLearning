
import java.util.Scanner;
public class Matrix {
    private int row = 0;
    private int column = 0;
    private double[][] matrix;

    public void action (int num) {
        switch (num) {
            case 0: // add
            System.out.println("n2 & m2: ");

             Matrix two0 = new Matrix(this.row, this.column);
             Matrix three0 = this.add(two0);
            print(three0);
            break;

            case 1: // multiply

            System.out.println("n2 & m2: ");
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

        System.out.println("size is: ");

		Scanner sc = new Scanner(System.in);
        this.row = r;
        this.column = c;
        this.matrix = new double[r][c];

        System.out.println( r + "*" + c + "\nfill it: ");
        /*
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                matr[i][j] = sc.nextDouble();
            }

        }*/

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
        System.out.println("printed: ");
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
    System.out.println("what would you like to do with it?\n0 - add\n1 - multiply\n2 - transpond\n3 - print it");
    int act = sc.nextInt();

    at.action(act);


      //double[][] matrix = new double[n][m];

      /*for (int i = 0; i < n; ++i) {
          for (int j = 0; j < m ; ++j ) {
              matrix[i][j] = sc.nextDouble;
          }
      }
      *\ 

	}
}

*/
