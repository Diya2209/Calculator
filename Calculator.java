import java.util.Scanner;

public class Calculator {
    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ch;

        do {
            System.out.println("Enter - 1.Addition");
            System.out.println("Enter - 2.Subtract");
            System.out.println("Enter - 3.Multiply");
            System.out.println("Enter - 4.Divide");
            System.out.println("Enter your choice:");
            int n = s.nextInt();

            System.out.println("Enter first number:");
            int num1 = s.nextInt();
            System.out.println("Enter second number:");
            int num2 = s.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Addition = " + Add(num1, num2));
                    break;
                case 2:
                    System.out.println("Subtraction = " + Sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Multiplication = " + Mult(num1, num2));
                    break;
                case 4:
                    System.out.println("Division = " + Div(num1, num2));
                    break;
                default:
                    System.out.println("Enter valid input");
                    break;
            }

            System.out.println("Do you want to continue (Y/N)?");
            ch = s.next(); 

        } while (ch.equalsIgnoreCase("Y")); 
        s.close();

        System.out.println("HHello");

    }
}
