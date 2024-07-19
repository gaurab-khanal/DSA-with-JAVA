# Conditionals

- If condition

    #### Syntax:
        if(boolean expression){
            //statements // If true this will execute
        }
    
    ### Example: 
    - Program to check if number is negative.
        ```
        package com.gaurab;

        import java.util.Scanner;
    
        public class com.gaurab.Main {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num<0 && num!=0){
                System.out.println(num+" is a negative number.");
                }
            }
        }
        ```

- If-Else condition

    #### Syntax
        if (boolean expression) {
                //body(If true this will execute)
            }else {
                // Statements (If false this will execute)
            }
            
    ### Example:
    - Program to check if a person is eligible for vote for not.
        
        ```
        package com.gaurab;

            import java.util.Scanner;

            public class com.gaurab.Main {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if (age>=18){
                System.out.println("You are elgible for voting.");
            }else{
                System.out.println("You are not eligible for voting.");
            }
        }

    }
        ```
- If-ElseIf-Else
    #### Syntax:
        if (boolean expression) {
          //body(If true this will execute)
      }else if (boolean expression){
          // Statements (If true this will execute)
      }else{
      `  // If false this will execute.
      }
     
     ### Example:
     - Program to Check if Given number is +ve, -ve or 0.
        
        ```
            package com.gaurab;

            import java.util.Scanner;
            
            public class com.gaurab.Main {
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter a number: ");
                    int num1 = input.nextInt();
                    if(num1>0){
                        System.out.println(num1 + " is a positive number.");
                    } else if (num1<0) {
                        System.out.println(num1+" is a negative number.");
                    }else{
                        System.out.println(num1 + " is zero.");
                    }
                }
            }
        ```
- Switch
    ### Syntax: 
        switch (key) {
            case one:
                
                break;
            case two:
                
                break;
        
            default:
                break;
        }
    
    #### Note: 
    - Duplicate case values are not allowed
    - break is used to terminate the sequence
    - if break is not used, it will continue to next case
    - default will execute when none of the above does
    - if default is not at the end, put break after it.
    - cases have to be the same type as expressions, must be a constant or literal.
    
    ### Example: 
- Normal method for switch
        
     
    
            import java.util.Scanner;
            public class Switch {
                public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
                    int dayNo = in.nextInt(); 
            
                    switch (dayNo) {
                        case 1:
                            System.out.println("Sunday");
                            break;
                        case 2:
                            System.out.println("Monday");
                            break;
                        case 3:
                            System.out.println("Tuesday");
                            break;
                        case 4:
                            System.out.println("Wednesday");
                            break;
                        case 5:
                            System.out.println("Thursday");
                            break;
                        case 6:
                            System.out.println("Friday");
                            break;
                        case 7:
                            System.out.println("Saturday");
                            break;
                        default:
                            break;
                    }
            
                }
            }
    
    
- Enhanced Method for switch(only available for java>14):
        import java.util.Scanner;
        public class Switch {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int dayNo = in.nextInt();
                
                switch (dayNo){
                    case 1 -> System.out.println("Sunday");
                    case 2 -> System.out.println("Monday");
                    case 3 -> System.out.println("Tuesday");
                    case 4 -> System.out.println("Wednesday");
                    case 5 -> System.out.println("Thursday");
                    case 6 -> System.out.println("Friday");
                    case 7 -> System.out.println("Saturday");
                    default -> System.out.println("Please enter valid number");
                }
        
            }
        }
        

# Loops      
 Repetation of statements until certain certria meets is called loops.

- For loop:
    #### Syntax: 
        for(initilization; condition; increment/decrement){
        //body
        }
    ### Example: 
    Print number from 1 to 10.
        package com.gaurab;
        public class Loops {
            public static void main(String[] args) {
        
                for (int i= 1; i<=10; i++){
                    System.out.println(i);
                }
        
            }
        }
        

- While Loop
    #### Syntax:
        
                while(condition){
                    System.out.println(num);
                    Increment/Decrement
                }
    ### Example: 
    Print number from 1 to 10.
        package com.gaurab;
        public class Loops {
            public static void main(String[] args) {
                int num = 1;
                while(num<=10){
                    System.out.println(num);
                    num++;
                }
            }
        }
- Do-while loop
    #### Syntax
        do{
            // body
        }while(condition);
        
    ### Example:
     Print number from 1 to 10.
        package com.gaurab;
        public class Loops {
            public static void main(String[] args) {
                int i = 1;
                do{
                    System.out.println(i);
                    i++;
                }while(i<=10);
            }
        }
    ##### Note: While loop vs Do while loop-> do while loop execute at least one but while loop execute if condition is true.
    

    