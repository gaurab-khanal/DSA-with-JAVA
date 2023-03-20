# Solving Problems:
- Find the largest of the three numbers.
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