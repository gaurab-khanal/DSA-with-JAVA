# Day 1
  ## Breaking down the syntax
``` 
    import java.util.Scanner;

    public class com.gaurab.com.gaurab.com.gaurab.Main{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
    }
}
```
- public --> It means this class 'com.gaurab.com.gaurab.com.gaurab.Main' can be accessed from anywhere.
- class  --> Name group of properties or functions.
- com.gaurab.com.gaurab.com.gaurab.Main   --> Name of file.                 Note: public class name must be same as the file name which is 'com.gaurab.com.gaurab.com.gaurab.Main' in this case.
- public --> makes 'main' function public(accissible by 
all file).
- static --> runs 'main' function without creating the                 the object of class 'com.gaurab.com.gaurab.com.gaurab.Main'.
- void   --> return type of function. It doesnot return any value.
- main   --> It is reserved word. The function name                 must be main. If not program will not run. When you run the java file it will look for the 'main' function in it. If not available program will not run. 'main' is the starting point of the program.
- String[] (args) --> command line argument. Array,collection of string.
- (String[] args) --> It stores argument you give in terminal as an array.
- System.out.println() --> prints output and create new                             line. To prevent new line, remove 'ln' from 'println'.
- out --> provides place for the output. Here it is command line. You can change this to file as well.
- Scanner --> Simple text scanner which can parse prmitive types and strings using regular expressions.
- input --> new object (new Scanner(System.in))
- new Scanner() --> creates new object input. Pass the                        such argument from where you want to take input in this case it is: 
    
    System.in --> Takes input from keyboard.
    // Taking input 
    
    // input.nextInt() --> Takes integer as an input.
    
    // input.next() --> Takes 0th element of line as an input.
    // input.nextLine() --> Takes line(string) as an input.

## Primitives Data Type
 It is such data type which you cannot break even further.
  Example: "Name" it is string(non-primitive data type). You can break it into character(N) which cannot be broken down further. So char is primitive data type.

- int rollNo = 64;// 4bytes
- char letter = 'a';// 2bytes
- float marks = 78.97f;//4bytes
// 'f' is added at last cause all the decimal values are by default double so to store that using float 'f' is added.
- double largeDecimalsNumbers = 82538727.7743;// 8bytes
- long largeInteger = 962397469828423294L;// 8bytes
// 'L' is added at last cause all the int values are by default int so to store that using float 'L' is added.
- boolean check = true;// 1bit

### Taking Input
```
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll no: ");
        // Integer
        int rollNo = input.nextInt();
        System.out.println("Your roll no is: "+ rollNo);

        // String
        System.out.print("Enter your name: ");
        String name = input.nextLine(); // takes whole sentences
        // input.next() --> Takes only 1st word.
        System.out.println("Your name is "+ name);

        // Float
        float marks = input.nextFloat();
        System.out.println(marks);
        
    }
}
```
## Literals and identifier
  int number = 66.

      66 --> literal
      number(reference variable) --> Identifier(name of varible, class, packages)
  int a = 2363_38386_283 // removes underscore and stores in a.

## Sum of Two numbers
```
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = "+sum);
    }
}
```

## Type Casting
```
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat(); // Taking float
        System.out.println(num); // If you pass 65(int) it converts that into float automatically.

    }
}
```
  Type conversion takes place when one type of data is assigned to another type of variable under following conditions:
  
  - Two types must be compatible.
  - Destination type should be greater than the source type.
    Here, float(Destination)> num(int). float is greater cause it is made with int and decimal. (45.3763).
    45-> Int
    .3763 -> decimal.

```
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // Taking Int
        System.out.println(num); // If you pass 65.46(float) it doesnot convert that into integer. It gives error.
    }
}
```
  - In above code, it is asking integer but if you provide float it doesn't converts that into int like as previous code.
#### To solve this we have: 
### TypeCasting incompatible types.(narrowing conversion)

```
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        int num = (int)(33.464f);
        System.out.println(num); // 33
    }
}
```
## Automatic type promotion in expressions

```
    public class TypeCasting {
        public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c; // 20
        // here a*b = 2000 but byte can only hold upto 256. In this case java performs automatic type promotion. It is promoting each byte to int while performing this expression.
        System.out.println(d);

        byte e = 60;
        e = e * 2; // This gives error as e* 2 is converted to int for the expressions. So e can't hold int. It gives error.

        
        int number = 'a';
        System.out.println(number); //97 (ASCII value of a)
    }
}
```
### Rules for Type promotion 

- All the byte, short, char values are promoted to int.
- If any operands are long/double/float whole expression is promoted to long/double/float.

```
System.out.println(3*64.47); // 193.41 whole expression is converted to float.
```
#### Type promotion conclusion

```
public class TypeCasting {
        public static void main(String[] args) {

        byte b = 42;
        char c = 'a';
        short s = 1044;
        int i = 5000;
        float f = 56.37f;
        double d = 0.8383;
        double result = (f * b) + (i/ c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        // float + int - double = double // multiple types are converted to double which is bigger among all.
        System.out.println(result);
    }
}
```

## Java follows Unicode.
 It means it can execute any language.
 ```
 System.out.print('नमस्कार');
 ```

