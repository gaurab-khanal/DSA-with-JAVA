# Solving Problems:
- #### Find the largest of the three numbers.
#### Method 1: 

        public class Largest {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                int a = input.nextInt();
                int b = input.nextInt();
                int c = input.nextInt();

                // Method 1:
                int max = a;
                if (b>max){
                    max = b;
                }
                if (c> max){
                    max = c;
                }
                System.out.println(max);

            }
        }
#### Method 2: 
        public class Largest {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
        
            int max = Math.max(c, Math.max(a,b));
            System.out.println(max);

            }
        }
- #### Check if input string starts with Upper Case letter or Lower Case letter.
        import java.util.Scanner;

        public class CaseCheck {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                char ch = input.next().trim().charAt(0);
        
                if (ch>='a' && ch<='z'){
                    System.out.println("Lower Case");
                }else{
                    System.out.println("Upper Case");
                }
            }
        }
- #### Fibonacci numbers
        import java.util.Scanner;

        public class Fibonacci {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int a = 0;
                int b = 1;
                int count = 2;
                System.out.print(a);
                while (count <= n){
                    int temp = b;
                    b = b + a;
                    System.out.print(" "+ b);
                    a = temp;
                    count++;
                }
            }
        }
- #### Counting Occurrence
 
 Input two numbers and find how many times 2nd number is present in 1st number.
 
        import java.util.Scanner;

        public class CountingOccurrences {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int fn = in.nextInt();
                int sn = in.nextInt();
                int count=0;
        
                while (fn>0){
                    int rem = fn%10;
                    if (rem == sn){
                        count++;
                    }
                    fn = fn/10;
                }
                System.out.println(count);
        
            }
        }
- #### Reverse a entered number
        import java.util.Scanner;

        public class Reverse {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                int rev=0;
                while (num>0){
                    int rem = num % 10;
                    rev = rev * 10 + rem;
                    num /=10;
                }
                System.out.println("Reverse = "+ rev);
            }
        }
- #### Calculator Program
        
        import java.util.Scanner;

        public class Calculator {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                // Take input from user till user does not press X or x.
                int ans = 0;
                while (true){
                    // take the operator as input.
                    System.out.print("Enter the operator: ");
                    char op = in.next().trim().charAt(0);
                    if (op =='+' || op=='-' || op == '/' || op == '*' || op == '%'){
                        // input tw numbers
                        System.out.print("Enter two numbers: ");
                        int num1 = in.nextInt();
                        int num2 = in.nextInt();
                        if (op == '+'){
                            ans = num1 + num2;
                            System.out.println("Sum = "+ ans);
                        } else if (op == '-') {
                            ans = num1 - num2;
                            System.out.println("Difference = "+ ans);
                        }else if (op == '*') {
                            ans = num1 * num2;
                            System.out.println("Product = "+ ans);
                        }else if (op == '/') {
                            if (num2!=0) {
                                ans = num1 / num2;
                                System.out.println("Division = "+ ans);
                            }else {
                                System.out.println("Error");
                            }
                        }else if (op == '%') {
                            ans = num1 % num2;
                            System.out.println("Remainder = "+ ans);
                        }else {
                            System.out.println("Error!");
                        }

            } else if(op=='x' || op=='X'){
                break;
            }else {
                System.out.println("Invalid Operator!");
            }
            
        }