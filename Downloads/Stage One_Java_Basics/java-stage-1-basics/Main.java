import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);


        // Create  a calculator object
        Calculator calc = new Calculator();

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:  ");
        int num2 = scanner.nextInt();

        System.out.println("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        // Use methods from calculator

        switch (operator){
            case '+':
                result = calc.add(num1,num2);
                break;
            case '-' :
                result = calc.subtract(num1, num2);

            case '*':
                result = calc.multiply(num1,num2);

            case '/':
                result = calc.divide(num1, num2);
                break;
            default:
                System.out.println("invalid operator!");return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}




