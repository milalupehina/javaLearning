/*public class main {
}*/

//conditional statement
/*
If the condition is true,
the program performs one computation;
otherwise, the condition is false and the program performs
another computation. The condition can be any boolean expression,
for instance: a > b, i - j == 1 and so on.

            //A single if statement
    if (condition) {
        // do something
    }
In this case, if the condition is true,
the action inside the code block is executed.
Otherwise, the program skips the action.

    int age = ...; // it has a value
    if (age < 3) {
        System.out.println("This person is too young");
    }

            //If-else statement
    if (condition) {
        // do something
    } else {
        // do something else
    }

In the above code, if the condition is "true",
the first code block is executed.
Otherwise, the second code block is executed.

    int num = ...; // num is assigned some value

    if (num % 2 == 0) {
        System.out.println("It's an even number");
    } else {
        System.out.println("It's an odd number");
    }

            //If-else-if statements
    if (condition0) {
        // do something
    } else if (condition1) {
        // do something else 1
    // ...
    } else if (conditionN) {
        // do something else N
    }

The most general form of the
if-else statement consists of multiple conditions and else-branches.

    long dollars = ...; // your budget

    if (dollars < 1000) {
        System.out.println("Buy a laptop");
    } else if (dollars < 2000) {
        System.out.println("Buy a personal computer");
    } else if (dollars < 100000) {
        System.out.println("Buy a server");
    } else {
        System.out.println("Buy a data center or a quantum computer");
    }

*/
/*
String msg = (a+b > c && a+c > b && b+c > a)? "YES":"NO";
*/
/*
  _ _ _ _ _ _ _ _
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
 |_|_|_|_|_|_|_|_|
*/
/*
import java.util.Scanner;

public class Main {
    static String checkAmy(int num) {
        return num < 1 ? "no army"
                : num < 5 ? "few"
                : num < 10 ? "several"
                : num < 20 ? "pack"
                : num < 50 ? "lots"
                : num < 100 ? "horde"
                : num < 250 ? "throng"
                : num < 500 ? "swarm"
                : num < 1000 ? "zounds"
                : "legion";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(checkAmy(scan.nextInt()));
    }
}*/

//Switch statements
/*
The switch statement provides a way to choose between multiple cases based on the value of a single variable. The variable in this statement can be an integer number, character, string, or enumeration.

switch (variable) {
    case value1:
        // do something here
        break;
    case value2:
        // do something here
        break;

    //... other cases

    case valueN:
        // do something here
        break;
    default:
        // do something by default
}
// next statement

The keywords switch and case are always required. The keywords break and default are optional.

Cases are evaluated sequentially. If a case is valid and it includes the break keyword, the switch construct is finished and execution passes to the next statement. If a case doesn't include the break keyword, the following case(s) will be evaluated too.

The default case is only evaluated if no case matches the variable value.

int val = ...; // the variable is assigned some value
switch (val) {
     case 0:
        System.out.println("zero");
        break;
     case 1:
        System.out.println("one");
        break;
     case 2:
        System.out.println("two");
        break;
     default:
        System.out.println("The value is less than zero or greater than two");
}
*/
/*
char o = scan.next().charAt(0);
*/

//The while loop
/*
In a while loop, the condition is tested first. The body is only executed if the condition is true, and then the process repeats.

while (condition) {
    // do something in the body
}

while (true) {
    // infinite loop
}

int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

public class WhileDemo {

    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter);
            letter++;
        }
    }
}
*/

//The do-while loop
/*
In a do-while loop, the body is executed first and only then is the condition statement tested. Therefore, the body will be always executed at least once.

do {
    // do something
} while (condition);


The program below keeps reading integer numbers from standard input and outputting them. If 0 is entered, the program outputs it and stops.
public class DoWhileDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        do {
            value = scanner.nextInt();
            System.out.println(value);
        } while (value > 0);
    }
}
*/
/*import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int count = 1;
        int k = 1;
        int global = 0;

        while (count <= m) {
            while (k <= count && global < m) {
                System.out.print(count + " ");
                k++;
                global++;
            }
            k = 1;
            count++;
        }
    }
}*/

//For loop
/*
If the number of iteration or the range borders are known, it is recommended to use the for-loop. If they are unknown the while-loop may be a preferable solution.

//The base for-loop syntax
for (initialization; condition; increment/decrement) {
    // do something
}

The explanations:

the initialization statement is executed once when the loop begins, usually, here loop variables are initialized;
the condition determines the need for the next iteration; if it's false, the loop terminates;
the increment/decrement expression is invoked after each iteration of the loop; usually, here loop variables are changed.

The order of execution for any for-loop is always the same:

1)the initialization statement;
2)if the condition is false then terminate;
3)the body
4)the increment/decrement
5)go to the stage 2 (condition).

int n = 9;
for (int i = 0; i <= n; i++) {
    System.out.print(i + " ");
}

//Infinite for-loop
for (;;) {
    // do something
}

//Nested loops
for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
        System.out.print(i * j + "\t");
    }
    System.out.println();
}


*/

//Branching statement
/*
//The break statement
The break statement has two usages:

it terminates the current loop (any kind) of any types (for, while, do-while);
it terminates a case in the switch statement;

int i = 10;
while(true) {
    if (i == 0) {
        break;
    }
    i--;
}
This loop will be successfully stopped, even though the condition is always true.

The break statement terminates only the current loop. If this loop is inside another loop, the outer loop won't be stopped.

The following code prints a ladder of numbers.
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
        if (i == j) {
            break;
        }
    }
    System.out.println();
}

To stop the outer loop we'd like to declare boolean variable stopped and use it as a special flag.
boolean stopped = false;
for (int i = 0; (i < 10) && !stopped; i++) {
    for (int j = 0; j < 10; j++) {
        System.out.print(j + " ");
        if (i == j) {
            stopped = true;
            break;
        }
     }
    System.out.println();
}

Also, another way to stop the outer loop exist - labeled break operator. But it's not very good practice to use it. Google it, if you are interested.

//The continue statement
It causes a loop to skip the current iteration and go to the next one.

inside the for-loop, the continue cases control to immediately move to the increment/decrement statement;
inside the while or do-while loop, control immediately move to the condition.

int n = 10;
for (int i = 0; i < n; i++) {
    if (i % 2 != 0) {
        continue;
    }
    System.out.print(i + " ");
}

Often, we can rewrite our loop without using the continue statement.
int n = 10;
for (int i = 0; i < n; i++) {
    if (i % 2 == 0) {
        System.out.print(i + " ");
    }
}

*/

//Array
/*
//Introduction to arrays
An array is an ordered collection of elements of the same type. It can store only a fixed number of elements. The length of an array is established when the array is created. Arrays allow you to group and processing similar data together.

Some features:

an array is a reference type;
all elements are stored in the memory sequentially ;
each element of an array is accessed by its numerical index, the first element has the index 0;
the last element is accessed by the index equal to array size - 1;
it's possible to create an array of any types;
the maximum size of an array is limited by the Integer.MAX_VALUE;

declare a variable of an array type (declaration);
create an instance of the array object (instantiation);
initialize the array by some values (initialization).

int[] array; // declaration
int array[]; // declaration

//Creating an array with the specified elements

int[] numbers = { 1, 2, 3, 4 }; // an array of 1, 2, 3, 4
But, this way to create an array has some disadvantages: we need to know values and number of elements at the moment of compilation.

int a = ..., b = ..., c = ...;
int[] numbers = { a, b, c };
In this case, we should have all elements at the moment of the array creation.

//Creating an array using the keyword "new"
The most general way to create an instance (object) of an array is to use the special keyword new and specify the necessary number of elements:
int n = ...; // n is a length of an array
int[] numbers = new int[n];

Now, the array has n elements. Each element is equal to 0 (the default value). Next, we should make explicit initialization of elements.

It's possible to separate declaration and instantiation in two lines:

int[] numbers;
numbers = new int[n];

float[] floatNumbers; // declaration
floatNumbers = new float[] { 1.02f, 0.03f, 4f } // instantiation and initialization

//Where to place []?
Another feature associated with the creating of arrays is the location of characters [].

char[] chars1 = new char[n]; // [] after the type
char chars2[] = new char[n]; // [] after the variable

Often, Java developers use the first way because it signals that an array is a special type.

int[] array = { 1, 2, 3, 4 }; // an array of numbers
int length = array.length; // number of elements of the array
System.out.println(length); // 4

array[index] = val;
val = array[index];

int numbers[] = new int[3]; // numbers: [0, 0, 0]
numbers[0] = 1; // numbers: [1, 0, 0]
numbers[1] = 2; // numbers: [1, 2, 0]
numbers[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]

Some explanations:

in the first line, the integer array named numbers with the size 3 is created. By default, all elements are equal to 0;
in the second line, the value "1" is assigned to the first element of the array by its index (do not forget, the first element has the index 0);
in the third line, the value "2" is assigned to the second element of the array by its index (numbers[1] - is the second element);
in the last line, the sum of first two elements is assigned to the third element by its index.

Note, if we try to access a non-existing element by an index then a runtime exception happens.

For instance, let's try to get fourth element (with index 3) of the considered array numbers.

int elem = numbers[3];
The program throws ArrayIndexOutOfBoundsException.

//The utility class Arrays

convert array to string using Arrays.toString(...) and then print it:

byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
System.out.println(Arrays.toString(famousNumbers)); // it prints [0, 1, 2, 4, 8, 16, 32, 64]

sorting a whole array or a part of it:

long[] bigNumbers = { 20000000000L, 40000000000L, 10000000000L, 30000000000L }; // it's unsorted
Arrays.sort(bigNumbers); // sorting whole array
// it prints [10000000000, 20000000000, 30000000000, 40000000000]
System.out.println(Arrays.toString(bigNumbers));

comparing arrays: two arrays are equal if they contain the same elements in the same order:

int[] numbers1 = { 1, 2, 5, 8 };
int[] numbers2 = { 1, 2, 5 };
int[] numbers3 = { 1, 2, 5, 8 };
System.out.println(Arrays.equals(numbers1, numbers2)); // it prints "false"
System.out.println(Arrays.equals(numbers1, numbers3)); // it prints "true"

filling a whole array or a part of it by some values:

int size = 10;
char[] characters = new char[size];
// It takes an array, start index, end index (exclusive) and the value for filling the array
Arrays.fill(characters, 0, size / 2, 'A');
Arrays.fill(characters, size / 2, size, 'B');
System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]

//Processing arrays using loops
A convenient way to process an array is to iterate over the array using a loop. The property length of an array can help us to avoid ArrayIndexOutOfBoundsException.

int n = 10; // the size of an array
int[] squares = new int[n]; // creating an array with the specified size
System.out.println(Arrays.toString(squares)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//iterating over the array
for (int i = 0; i < squares.length; i++) {
        squares[i] = i * i; // set the value by the element index
        }
System.out.println(Arrays.toString(squares)); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

The following program checks the given array is sorted ascending and prints "OK", otherwise it prints "BROKEN".


The following program checks the given array is sorted ascending and prints "OK", otherwise it prints "BROKEN".

int[] numbers = { 1, 2, 3, 4, 5, 10, 6 }; // the order is broken

boolean broken = false; // suppose the array is well-ordered

// iterating over the array
for (int i = 1; i < numbers.length; i++) {

        if (numbers[i] < numbers[i - 1]) { // if the order is broken
            broken = true; // write a result
            break;         // terminate the loop
        }
    }

System.out.println(broken ? "BROKEN" : "OK");

For the given array the program prints "BROKEN".

//Reading an array from the standard input
For example, the input consists of two lines. The first line contains the length of an array, the second line - all elements of the array.
5
101 102 504 302 881

import java.util.Scanner;
import java.util.Arrays;

public class ReadingArrayExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt(); // reading a length
        int[] array = new int[len];  // creating an array with the specified length
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }
        System.out.println(Arrays.toString(array)); // output the array
    }
}

[101, 102, 504, 302, 881]

//Iterating over arrays using the for-each loop

Since Java 5 there is a special kind of the for loop called for-each. It is a special kind of the for-loop that iterates arrays and collections (they will be learned in other topics) without using indexes.

char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };

int counter = 0;
for (char ch : characters) {
    if (ch == 'a') {
        counter++;
    }
}

System.out.println(counter); // it outputs "3"

As you can see, the absence of indexes makes the code more readable. It also allows you to avoid ArrayIndexOutOfBoundsException.
*/

//String
/*
//The String type
String is a reference type consisting of characters. Remember, it's not a primitive type. It is one of the most widely used types in Java.

Here is an example of a string: "Hello, Java". This string is a sequence of 11 characters, including one space.

This type has some features:

immutable type: it's impossible to change a character in a string;
it has methods for getting individual characters and substrings;
characters can be accessed by indexes, the first character has the index 0, the last one - the length of the string - 1.

//Creating strings

// a simple string
String simpleString = "It is a simple string";
// it prints "It is a simple string"
System.out.println(simpleString);

// a string with escape sequences
String anotherString = "This is\nanother\nstring";
// it prints the result is several lines
System.out.println(anotherString);

String strangeText = "aaaaaaaaaaaassssssssssss gggggggggggggggggggg ddddddddddd qqqqqq ffff";

String emptyString = "";

String s = "s"; // a string consisting of one character

A string can be null. It means no any value assigned.
String nullString = null; // it is null

Another way to create a variable of type String is used the keyword new.
String str = new String("my-string"); // it creates an object and assigns it to the variable

//Get the length and characters of a string
length() returns the number of characters in the string;
charAt(index) returns a character by its index;

String s = "Hi, all";
int len = s.length(); // the len is 7
char theFirstChar = s.charAt(0);  // 'H' has the index 0
char theFifthChar = s.charAt(4); // 'a' has the index 4
char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6

//Useful methods of strings

returns true if the string is empty, otherwise - false;
isEmpty()
returns a new string in uppercase;
toUpperCase()
returns a new string in lowercase;
toLowerCase()
returns true if the string is start
with the given string prefix, otherwise - false;
startsWith(prefix)
returns true if the string contains
the given string or character;
contains(...)
returns a substring of the string in the range:
beginIndex, endIndex - 1;
substring(beginIndex, endIndex)
returns a new string obtained by
replacing all occurrences of old with
new that can be chars or strings.
replace(old, new)

String text = "The simple text string";
boolean empty = text.isEmpty(); // false

// "THE SIMPLE TEXT STRING"
String textInUpperCase = text.toUpperCase();

boolean startsWith = simple.startsWith("THE"); // true

//replace all whitespaces with empty strings
// "THESIMPLETEXTSTRING"
String noWhitespaces = text.replace(" ", "");


//Exceptions when processing strings
1. NullPointerException. If a string is null and you call a method of the string, it throws NullPointerException.
String s = null;
// it throws NullPointerException
int length = s.length();

2. StringIndexOutOfBoundsException. If you try to access a non-existing character by an index then this exception occurs.
String s = "ab";
// it throws StringIndexOutOfBoundsException
char c = s.charAt(2);

//Concatenating strings
// concatenation using the "+" operator
String fullName1 = firstName + " " + lastName;
// "John Smith"

// concatenation using the concat method
String fullName2 = firstName.concat(" ").concat(lastName);
// "John Smith"

Important: in the general case str1 + str2 is not the same
as str2 + str1 because the concatenation is not
a commutative operation.

//Appending values to a string
It's possible to add values of different types to a string. The value will be automatically converted to a string. See an example below.
String str = "str" + 10 + false;
// the result is "str10false"

1."str" + 10 => "str10"
2."str10" + false = "str10false"

String shortString = "str";
long number = 100;

String result1 = shortString + number + 50; // the result is "str10050"
String result2 = number + 50 + shortString; // The result2 is 150str

The order of operations is important.

//How to compare strings correctly?
The strings are a reference type you shouldn't compare them using "==" or "!=" operators. In these case, only addresses will be compared, but not actual values.

String first = "first";
String second = "second";

String anotherFirst = "first";
String secondInUpperCase = "SECOND";

// false, the strings have different values
System.out.println(first.equals(second));
// true, the strings have the same value
System.out.println(first.equals(anotherFirst));

// false, the strings have different cases
System.out.println(second.equals(secondInUpperCase));
// true, it ignores cases
System.out.println(second.equalsIgnoreCase(secondInUpperCase));

//Strings and arrays
Sometimes, a string looks similar to an array of characters.

It's possible to convert between strings and character arrays using special methods:

char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };
// "ABCDEF"
String stringFromChars = String.valueOf(chars);
// { 'A', 'B', 'C', 'D', 'E', 'F' }
char[] charsFromString = stringFromChars.toCharArray();
// "ABCDEF"
String theSameString = new String(stringFromChars);

String text = "a long text";
// [a, long, text]
String[] parts = text.split(" ");

//Iterating over a string
It's possible to iterate over characters of a string using a loop (while, do-while, for-loop).
String scientistName = "Isaac Newton";

for (int i = 0; i < scientistName.length(); i++) {
    System.out.print(scientistName.charAt(i) + " "); // print the current character
}
//I s a a c   N e w t o n

If you'd like to use the for-each loop, first you should convert a string to an array of characters and iterate it.


String str = "strings are not primitive types!";

int count = 0;
for (char ch : str.toCharArray()) {
    if (ch == ' ') {
        count++;
    }
}


System.out.println(count); // 4


*/
/*
kayak
len = 5
2(3)

abccba
len = 6
3

acggtgttat

(c1+g3)/10
*/
/*
aaaabbcaa
012345678
n = 9
a
c=0
 1
*/

//Multi-dimensional array
/*
//An array of arrays
Some structures such as matrices and tables are conveniently modeled by two-dimensional arrays. Java provides a possibility to process two and more-dimensional arrays.
To create a multi-dimensional array we should use an array as an element of another array. In this case, we create an array of arrays.
To iterate over multi-dimensional arrays nested loops are often used.

2-dimensional arrays
// two-dim array - the array of arrays
int[][] twoDimArray = {
        {1, 2, 3, 1}, // first array of int
        {3, 4, 1, 2}, // second array of int
        {4, 4, 1, 0}  // third array of int
};
In this case, the length of twoDimArray is 3 (because it includes 3 arrays as elements). The length of each nested array is 4.

int number = twoDimArray[0][2]; // it is 3

In this case, the first index specified an element (nested array or row) of twoDimArray. The second index specified the element inside the nested array.

Important, all nested arrays can have a different length. See an example below:
int[][] twoDimArray = new int[3][];

twoDimArray[0] = new int[] { 1, 2, 3, 4 }; // the length is 4
twoDimArray[1] = new int[] { 5, 7, 3};     // the length is 3
twoDimArray[2] = new int[] { 8 };          // the length is 1

// let's output the array
for (int i = 0; i < twoDimArray.length; i++) {
    System.out.println(Arrays.toString(twoDimArray[i]));
}

[1, 2, 3, 4]
[5, 7, 3]
[8]

//3-dimensional arrays
You can create an array with more than 2 dimensional (3-dim, 4-dim, 5-dim and so on).
int[][][] cubic = new int[3][4][5];

Now, let's fill each 2D array of the 3D array cubic by the following rules: the first array must contain only "1", the second - "2" and so on.

// this code fills the 3-dimensional array
int current = 1;
for (int[][] dim2Array : cubic) {     // for each 2-dim array
    for (int[] vector : dim2Array) {  // for each 1-dim array (vector) of 2-dim array
        Arrays.fill(vector, current); // fill the vector
    }
   current++; // the next current
}

// this code prints all 2-dimensional arrays
for (int[][] dim2Array : cubic) {
    for (int[] vector : dim2Array) {
        System.out.println(Arrays.toString(vector));
    }
    System.out.println();
}

[1, 1, 1, 1, 1]
[1, 1, 1, 1, 1]
[1, 1, 1, 1, 1]
[1, 1, 1, 1, 1]

[2, 2, 2, 2, 2]
[2, 2, 2, 2, 2]
[2, 2, 2, 2, 2]
[2, 2, 2, 2, 2]

[3, 3, 3, 3, 3]
[3, 3, 3, 3, 3]
[3, 3, 3, 3, 3]
[3, 3, 3, 3, 3]

*/
/*
[0][0] [0][1] [0][2] [0][3]
[1][0] [1][1] [1][2] [1][3]
[2][0] [2][1] [2][2] [2][3]

[2][0] [1][0] [0][0]
[2][1] [1][1] [0][1]
[2][2] [1][2] [0][2]
[2][3] [1][3] [0][3]



        3 4
        11 12 13 14
        21 22 23 24
        31 32 33 34

        31 21 11
        32 22 12
        33 23 13
        34 24 14


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //put your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for(int i = 0;i < m;i++){
            for(int j = n - 1;j >= 0;j--){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[][] arr = new int[n][n];

        int phase = 0,
                num = 1,
                i = 0,
                j = -1;

        int run = n;

        while (num <= n * n) {
            for (int x = 0; x < run; x++) {
                if (phase % 4 == 0) {
                    j++;
                } else if (phase % 4 == 1) {
                    i++;
                } else if (phase % 4 == 2) {
                    j--;
                } else if (phase % 4 == 3) {
                    i--;
                }

                arr[i][j] = num++;
            }

            phase++;

            if (phase % 2 == 1) {
                run--;
            }
        }

        for (int[] row : arr) {
            for (int v : row) {
                System.out.print(v + " ");
            }

            System.out.println();
        }
    }
}
 */
/*
This is a simple solution that does not involve computing max or min values, but rather checks whether the cell was visited before (the value is != 0) or the position would be out of bounds (only occurring on the first lap, when you cover the margins).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[][] mat = new int[n][n];
        int total = n * n;
        int processed = 0;
        int direction = 0;
        int[] dirI = {0, 1, 0, -1};
        int[] dirJ = {1, 0, -1, 0};
        int i = 0;
        int j = 0;
        while (processed < total) {
            mat[i][j] = processed + 1;
            ++processed;
            if (i + dirI[direction] < 0 || j + dirJ[direction] < 0 || i + dirI[direction] >= n || j + dirJ[direction] >= n || mat[i + dirI[direction]][j + dirJ[direction]] != 0) {
                direction = (direction + 1) % 4;
            }
            i += dirI[direction];
            j += dirJ[direction];
        }
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 */
/*
У этой задачи очень мало коротких решений, поэтому выкладываю свое.

Реализация по массиву направлений. Поэтому решение универсальное и легко переделывается под любой алгоритм. По часовой, против часовой, змейкой.

ЗЫ. Одна строка лишняя. Осталась от промежуточного написания. (int d_y = 0, d_x = 1;)

import java.util.*;
public class Main {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ar = new int[n][n];
        int[] dy = {0,1,0,-1};
        int[] dx = {1,0,-1,0};
        int y = 0, x = 0, count = 1, dir = 0;
        int d_y = 0, d_x = 1;
        while (count <= n * n) {
            ar[y][x] = count++;
            if (y + dy[dir] == n || y + dy[dir] < 0 || x + dx[dir] == n || x + dx[dir] < 0 || ar[y + dy[dir]][x + dx[dir]] != 0) dir = (dir + 1) % 4;
            y += dy[dir];
            x += dx[dir];
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(ar[i][k] + " ");
            }
            System.out.println();
        }
  }
}

 */
/*
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //put your code here
        Scanner sc = new Scanner(System.in);


        String nd = "end";
        String gen = sc.nextLine();
        String cur = "";
        int c = 0;


        while(!sc.hasNext("end")) {
            gen += " ";
            gen += sc.nextLine();
            c++;
        }
        c++;


        char[] arr1 = gen.toCharArray();
        int[] arr2 = new int[arr1.length];

        //char x = '9';
        //int y = x - '0'; // gives 9

        //int m = 0;
        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] == '-') {
                arr2[i] = -(arr1[i + 1] - '0');
                //arr2[i] = arr1[i] - '0';
            } else if (arr1[i] != ' ') {

            } else {
                arr2[i] = 1111;
            }
        }

        int[][] arr3 = new int[c][c];
        int k = 0;
        for (int i = 0; i < c; ++i) {
            for (int j = 0; j < c; ++j) {
                if (arr2[k] != 1111) {
                    arr3[i][j] = arr2[k];
                }
                k += 2;
            }
        }


        System.out.println(gen);
        //System.out.println(arr);

        //for (int i = 0; i < arr1.length; ++i) {
            //System.out.print(arr1[i] + " ");
        //}


        //for (int i = 0; i < c; ++i) {
            //for (int j = 0; j < c; ++j) {
                //System.out.print(arr3[i][j] + " ");
            //}
            //System.out.println();
        //}
    }
}
 */
/*
// hope this will help you
// iM mean i-1  iP mean i+1  jM mean j-1 jP mean j+1
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String tBox = "";
    while (!scan.hasNext("end")) {
      tBox += scan.nextLine() + ",";
    }
    String[] rows = tBox.split(",");
    int sizeRow = rows.length;
    int sizeColumn = rows[0].split(" ").length;
    int[][] matrix = new int[sizeRow][sizeColumn];
    int[][] tMatrix = new int[sizeRow][sizeColumn];

    int iM, iP, jM, jP;

    for (int i = 0; i < sizeRow; i++) {
      String[] s = rows[i].split(" ");
      for (int j = 0; j < sizeColumn; j++) {
        matrix[i][j] = Integer.parseInt(s[j]);
      }
    }
    for (int i = 0; i < sizeRow; i++) {
      for (int j = 0; j < sizeColumn; j++) {
        iM = (i == 0) ? sizeRow - 1 : i - 1;
        jM = (j == 0) ? sizeColumn - 1 : j - 1;
        iP = (i == sizeRow - 1) ? 0 : i + 1;
        jP = (j == sizeColumn - 1) ? 0 : j + 1;

        tMatrix[i][j] = (matrix[iM][j] + matrix[iP][j] + matrix[i][jM] + matrix[i][jP]);
        System.out.print(tMatrix[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "";
        while(!scanner.hasNext("end")){
            a += scanner.nextLine() + ",";
        }
        String[] rows = a.split(",");
        int sizeRow = rows.length;
        int sizeColumn = rows[0].split(" ").length;
        int[][] arr = new int[sizeRow][sizeColumn];
        for (int i = 0; i < sizeRow; i++) {
            String[] temp = rows[i].split(" ");
            for (int j = 0; j < sizeColumn; j++) {
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                System.out.print(arr[i][Math.floorMod((j + 1), sizeColumn)] + arr[i][Math.floorMod((j - 1), sizeColumn)] + arr[Math.floorMod((i + 1), sizeRow)][j] + arr[Math.floorMod((i - 1), sizeRow)][j] + " ");
            }
            System.out.println();
        }
    }
}
 */

//Boxing
/*
//Commonly used reference types
String - a value that may represent a name, message, code and so on, for example: "hello", "John", "55"
Date, LocalDate, LocalDateTime - classes for processing date and time
BigInteger, BigDecimal - classes for processing very big numbers
Byte, Short, Integer, Long, Character, Boolean, Float, Double - wrapper classes for primitive types
and so on.

Java also has arrays. They groups values of the same type together: int[], double[], String[]. An array is a reference type, even an array of primitives.

The number of reference types is much larger than the primitive types. And it is continuously growing. In Java, all types created by programmers (users of the Java language) and provided by third-party libraries are reference types.

//Important features of reference types
objects of many reference types can be created using the keyword new;
a variable of a reference type can be assigned a special value null;
it's possible to assign the same reference to several variables with suitable types;
when you compare two variables of reference types using == or !=, the program compares references, not actual values;
calling methods of an object.

//The keyword "new"
The keyword new creates an object of a reference type.
String str = new String("hello"); // creating an object and assigning it to the variable

String str; // declaration of the variable
str = new String("hello"); // initialization

//The "null" value
The default value for a variable of a reference type is null. It's a keyword and a special value that represents null-address (actual value is not stored anywhere).
String str = null;

The null value can be assigned to any reference type, but it's impossible to assign null to primitive variables.
int n = null; // compile-time error

String str; // it's null
Be careful, it may cause NullPointerException in further.

//Reference reassigning
If you have a reference variable and will assign it to another reference variable then both variables will have an address of the same actual value. Also, they can modify this value together if the type is mutable.

1) Let's create an array of three integer numbers:

int[] array = new int[3];
Arrays.fill(array, 10); // it fills array with 10
System.out.println("The array: " + Arrays.toString(array)); // it prints [10, 10, 10]

2) Assign the address of array elements to another variable, then change one element in another array.

int[] another = array; // assign the address to another array
another[1] = 5;        // set the element with index 1 the value 5

3) As you can see, data changing is visible in both array variables:

System.out.println("Another: " + Arrays.toString(another)); // it prints [10, 5, 10]
System.out.println("The array: " + Arrays.toString(array)); // it prints [10, 5, 10]

//Comparing references and values

During the work with reference types, the operations "==" and "!=" compares variables by the addresses, not actual values. This behavior is completely different from comparing primitive types.

If we'd like to compare two variables by actual value, use the method equals that takes another variable. Any variable of a reference type has the method.

For example, let's consider a class BigInteger. The objects of this class is a very long numbers, consisting of an arbitrary number of digits.

Let's create several such numbers and compare them using "==" and the method equals. See the example below.

BigInteger big1 = new BigInteger("10000000000000000000"); // the first big number
BigInteger big2 = new BigInteger("10000000000000000000"); // the second big number
BigInteger big3 = new BigInteger("22222222222222222222"); // the third big number

System.out.println(big1 == big2);      // false, because they have different addresses
System.out.println(big1.equals(big2)); // true, because they have the same value

System.out.println(big1 != big3);      // true, because they have different addresses
System.out.println(big1.equals(big3)); // false, because they have different values

Remember forever distinctions when comparing variables of reference types by "==" and equals.

//Wrapper classes
Each primitive data type has a class dedicated to it. These classes are known as wrappers. They are reference types and wrap values of primitive types.

Primitive | Wrapper class | Constructor Argument
boolean   | Boolean       | boolean or String
byte      | Byte          | byte or String
char      | Character     | char
int       | Integer       | int or String
float     | Float         | float, double or String
double    | Double        | double or String
long      | Long          | long or String
short     | Short         | short or String


//Boxing and unboxing
Boxing is the conversion between the primitive types and their corresponding object wrapper classes.

Unboxing is the reverse process.

int primitive = 100;

Integer reference = Integer.valueOf(primitive); // boxing

int anotherPrimitive = reference.intValue();    // unboxing

Autoboxing and auto-unboxing are the automatic conversions performed by java compiler.
double primitiveDouble = 10.8;

Double wrapperDouble = primitiveDouble; // autoboxing

double anotherPrimitiveDouble = wrapperDouble;  // auto-unboxing

Also, it's possible to create an array of Long enumerating primitive values:
Long[] array = { 1L, 2L, 3L, 4L };

There is one possible problem when unpacking. If the wrapper object is null, the unpacking throws the NullPointerException.

Long longVal = null;
long primitiveLong = longVal; // it throws NullPointerException (NPE)


//Constructing wrappers based on other types
The wrapper classes have constructors for creating objects from other types. For instance, an object of a wrapper class can be created from a string (except the Character).
Integer number = new Integer("10012");   // an Integer from the string "10012"
Float f = new Float("0.01");             // a Float from the sting "0.01"
Long longNumber = new Long("100000000"); // a Long from the string "100000000"
Boolean boolVal = new Boolean("true");   // a Boolean from the string "true"

Also, you can create wrapper objects using special methods:

Long longVal = Long.parseLong("1000");      // a Long from the string "1000"
Long anotherLongVal = Long.valueOf("2000"); // another Long from the string "2000"

If the input string has an invalid argument (for instance, "1d0o3"), both of these methods throw the NumberFormatException.

//Primitive types vs wrapper classes
processing values of primitive types are faster than wrapper objects;
wrappers can be used in the situation if you need "null" as a no-value indicator;
primitive types cannot be used in collections, but wrappers can.

//Comparing wrappers
The operator == checks whether two objects are actually equal, i.e. whether they actually refer to the same object in memory. The method equals checks whether two objects are meaningfully equal, for example, it checks whether two wrappers or strings are having the same value.

The == actually checks whether two variables are having exactly same value. Note that a primitive variable contains what you see, but a reference variable contains the address to the object that it holds. When == is used to comparing a primitive to a wrapper, the wrapper will be unwrapped and the comparison will be primitive to primitive, and hence it will be true always as it is a primitive comparison and not object comparison.

//Reuse of wrapper class objects
In order to save memory, two instances of the following wrapper objects (created through boxing), will always be equal (==) when their primitive values are the same:

Boolean
Byte
Character from \u0000 to \u007f (7f is 127 in decimal)
Short and Integer from -128 to 127

For example, System.out.println(i1 == i2); will print true when i1 and i2 are having same value between -128 to 127 and will print false if i1 and i2 are outside -128 to 127 range even though both are same. The cause is a range of values is stored in the special pool to reuse them in different objects.



*/

