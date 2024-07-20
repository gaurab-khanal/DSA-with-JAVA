# Methods/Functions in Java

 Functions are the set of code which can be reused as many times programmer want without re-writing the same code again. Basically, codes are written within a block and specfic name is assigned to that block which is known as function name. When ever the function name is called, the code inside that block is executed. This way redundancy of code can be done using function.

 - Without function: Program to find the sum of two numbers: 
        import java.util.Scanner;

        public class com.gaurab.com.gaurab.Main {
            public static void main(String[] args) {
                // Take input of two number and print the sum
                Scanner in = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int num1 = in.nextInt();
                System.out.print("Enter number: ");
                int num2 = in.nextInt();
                int sum = num1 + num2;
                System.out.println("The sum = " + sum);

                // if you want to find another sum you will need to re-write above code,

                System.out.print("Enter a number: ");
                int num1 = in.nextInt();
                System.out.print("Enter number: ");
                int num2 = in.nextInt();
                int sum = num1 + num2;
                System.out.println("The sum = " + sum);



            }
        }

    Same thing can be achieved without re-writing the same code again and again for the same purpose using function

- Using function: Program to find the sum of two numbers:

        public class Sum{
        public static void main(String[] args) {
            sum1(6,7);
            int sum = sum2(5,7);
            System.out.println("Sum= " + sum);

        }

        static void sum1(int a, int b){
        System.out.println("Sum = " + (a + b));
        }

        static int sum2(int a, int b){
            return a+b;
        }

    }

### Breaking down the syntax: 

    - sum1(6,7) -> calls the method sum1 and passes the argument 6,7
    - static(in method sum) -> look in OOP
    - void -> return type(null)
    - int -> return type(integer)
    - return -> returns integer as a function value also function will end with return keyword

- Returning String 

        public class StringExample{
        public static void main(String[] args) {
            String message = greet();
            System.out.println(message);
        }

        static String greet(){
            String greeting = "How are you?";
            return greeting;
        }
    }

