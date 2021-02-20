import java.util.Scanner;


public class Complex {

  private double re = 0;
  private double im = 0;
  private double r = 0;
  private double ang = 0;
  private int typo = 0;

  public void action(int num) {


    Scanner sc = new Scanner(System.in);
    //if (num == 0 || num == 1 || num == 2 || num == 3) {
      //}

    switch (num) {
      case 0: //add
      System.out.println("enter second number \ntype first:\n0 - algebraic\n1 - trigonometric");
      int t2 = sc.nextInt();

      Complex two = new Complex(0, 0, 0, 0, t2);

        if (this.typo == 0 && this.typo == two.typo) { //both algebraic
          Complex three = this.add(two);
  //        System.out.println();
  print(three);

        } else if (this.typo == 1 && this.typo == two.typo) { //both trigonometric
          this.toAlgebraic();
          two.toAlgebraic();
          Complex three = this.add(two);
//          System.out.println();
print(three);

        } else if (this.typo == 0 && this.typo != two.typo) { //only first algebraic
          two.toAlgebraic();
          Complex three = this.add(two);
//          System.out.println();
print(three);

        } else if (this.typo == 1 && this.typo != two.typo) { // only secind algebraic
          this.toAlgebraic();
          Complex three = this.add(two);
//          System.out.println();
print(three);
        }

        break;
      case 1: //substract
      System.out.println("enter second number \ntype first:\n0 - algebraic\n1 - trigonometric");
      int t21 = sc.nextInt();

      Complex two1 = new Complex(0, 0, 0, 0, t21);

        if (this.typo == 0 && this.typo == two1.typo) {
          Complex three = this.substract(two1);
//          System.out.println();
print(three);

        } else if (this.typo == 1 && this.typo == two1.typo) {
          this.toAlgebraic();
          two1.toAlgebraic();
          Complex three = this.substract(two1);
//          System.out.println();
print(three);
        } else if (this.typo == 0 && this.typo != two1.typo) {
          two1.toAlgebraic();
          Complex three = this.substract(two1);
//          System.out.println();
print(three);
        } else if (this.typo == 1 && this.typo != two1.typo) {
          this.toAlgebraic();
          Complex three = this.substract(two1);
//          System.out.println();
print(three);
        }
        break;
      case 2: //multiply
      System.out.println("enter second number \ntype first:\n0 - algebraic\n1 - trigonometric");
      int t22 = sc.nextInt();

      Complex two2 = new Complex(0, 0, 0, 0, t22);

        if (this.typo == 0 && this.typo == two2.typo) {
          Complex three = this.multiply(two2);
//          System.out.println();
        } else if (this.typo == 1 && this.typo == two2.typo) {
          this.toAlgebraic();
          two2.toAlgebraic();
          Complex three = this.multiply(two2);
//          System.out.println();
print(three);

        } else if (this.typo == 0 && this.typo != two2.typo) {
          two2.toAlgebraic();
          Complex three = this.multiply(two2);
//          System.out.println();
print(three);

        } else if (this.typo == 1 && this.typo != two2.typo) {
          this.toAlgebraic();
          Complex three = this.multiply(two2);
//          System.out.println();
print(three);
        }
        break;
      case 3: //divide
      System.out.println("enter second number \ntype first:\n0 - algebraic\n1 - trigonometric");
      int t23 = sc.nextInt();

      Complex two3 = new Complex(0, 0, 0, 0, t23);
if (two3.re*two3.re + two3.im*two3.im == 0) {
     System.out.println("no division by 0");
    break;

}
        if (this.typo == 0 && this.typo == two3.typo) {
        Complex three = this.multiply(two3);
//          System.out.println();
print(three);
      } else if (this.typo == 1 && this.typo == two3.typo) {
        this.toAlgebraic();
        two3.toAlgebraic();
        Complex three = this.multiply(two3);
//          System.out.println();

print(three);
      } else if (this.typo == 0 && this.typo != two3.typo) {
        two3.toAlgebraic();
        Complex three = this.multiply(two3);
//          System.out.println();
print(three);

      } else if (this.typo == 1 && this.typo != two3.typo) {
        this.toAlgebraic();
        Complex three = this.multiply(two3);
//          System.out.println();
print(three);

     }
        break;
      case 4: //type
        if (this.typo == 0) {
            this.toTrigonometric();
            print(this);
        } else if (this.typo == 1) {
            this.toAlgebraic();
            print(this);
        }
        //          System.out.println();

        break;

      case 5: //print
      print(this);
        break;

      default:
        System.out.println("wrong acton");
        break;

    }
  }

  public Complex (double re, double im, double r, double ang, int type) {
      Scanner sc = new Scanner(System.in);
    if(type == 0) {//algebraic
      System.out.println("enter real part");
      this.re = sc.nextDouble();
      System.out.println("enter imaginery part");
      this.im = sc.nextDouble();
      this.r = 0;
      this.ang = 0;
      this.typo = type;


    } else if (type == 1) { // trigonometric
      this.re = 0;
      this.im = 0;
      this.typo = type;

      System.out.println("enter radius");
      this.r = sc.nextDouble();
      System.out.println("enter angle");
      this.ang = sc.nextDouble();


    } else {
      System.out.println("wrong type");
    }
  }

  public Complex add (Complex b) {
    Complex c = new Complex(re + b.re, im + b.im, 0, 0, 0);
    return c;
  }

  public Complex substract (Complex b) {
    Complex c = new Complex(re - b.re, im - b.im, 0, 0, 0);
    return c;
  }

  public Complex multiply (Complex b) {
    /*
      a      b
    (a+bi)*(c+di) =
    = ac+bci+adi+bdii =
    = (ac+bdii) + (bc+ad)i =
    = (ac-bd)+(bc+ad)i
    */
    Complex c = new Complex(re*b.re-im*b.im, im*b.re+re*b.im, 0, 0, 0);
    return c;
  }

  public Complex divide (Complex b) {
    /*
    z= x+yi; z* = x-yi;

    a+bi   (a+bi)(c-di)     ac+bd       bc - ad
    ---- = ------------ = -------- + (---------)i
    c+di   (c+di)(c-di)   c^2+d^2      c^2+d^2
    */

    Complex c = new Complex((re*b.re + im*b.im) / (b.re*b.re+b.im*b.im), (im*b.re - re*b.im)/ (b.re*b.re+b.im*b.im), 0, 0, 0);
    return c;
  }

  public Complex toTrigonometric () {
  /*
  z = a+bi; r = |z| = sqrt(a^2+ b^2); phi = arg z

  cos phi = a/sqrt(a^2+b^2)
  sin       b

  cos phi = a/r
  sin       b

  a = r*cos phi
  b =   sin

  z = a+bi = r(cos phi + sin phi)
   */

   this.r = Math.sqrt(this.re*this.re + this.im*this.im);
   this.ang = Math.acos(this.re/this.r);
   this.re = 0;
   this.im = 0;
   this.typo = 1;
   return this;



  }

  public Complex toAlgebraic () {
    /*
    z = a+bi; r = |z| = sqrt(a^2+ b^2); phi = arg z

    cos phi = a/sqrt(a^2+b^2)
    sin       b

    cos phi = a/r
    sin       b

    a = r*cos phi
    b =   sin

    z = a+bi = r(cos phi + sin phi)
     */

    this.re = this.r * Math.cos(this.ang);
    this.im = this.r * Math.sin(this.ang);
    this.r = 0;
    this.ang = 0;
    this.typo = 0;
    return this;
  }

  public void print(Complex a) {
      if (a.typo == 0) {

          System.out.println("type: algebraic");
          System.out.println("real part: " + a.re);
          System.out.println("imaginary part: " + a.im);
          if (a.im < 0) {
              System.out.println("full record: " + a.re + " + (" + a.im + ")i");
          } else {
              System.out.println("full record: " + a.re + " + " + a.im + "i");
          }

      } else if (a.typo == 1) {
          System.out.println("type: trigonometric");
          System.out.println("radius - vector: " + a.r);
          System.out.println("angle: " + a.ang);
          System.out.println("full record: " + a.r + "( cos(" + a.ang + ") + sin(" + a.ang + "))");

      }
  }
}


//---------Main.java

/*
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the type of number: \n0 - algebraic\n1 - trigonometric");
    int t1 = sc.nextInt();

    Complex one = new Complex(0, 0, 0, 0, t1);

    System.out.println("what would you like to do with it?\n0 - add\n1 -substract\n2 - multiply\n3 - divide\n4 - change type\n5 - print it");
    int act = sc.nextInt();

    one.action(act);

  }

 }
*/
