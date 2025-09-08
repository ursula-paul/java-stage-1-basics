public class Calculator {

    // Addition method
    public int add(int a, int b){
        return a+b;
    }

    // Subtraction method

    public int subtract (int a, int b){
        return a-b;
    }

    // Multiplication method

    public int multiply (int a, int b){
        return a * b;
    }

    // Division method

    public double divide (int a, int b){
        if (b == 0){
            System.out.println("Error! Division by zero is not allowed");
            return 0;

        }
        return (double) a/b;
    }
}
