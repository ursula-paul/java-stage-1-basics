import java.util.Scanner;
import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is even number. ");

        }else{
            System.out.println(number + " is odd number. ");
        }

        scanner.close();

    }
}
