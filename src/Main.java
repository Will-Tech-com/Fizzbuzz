import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int num = scanner.nextByte();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (num % 3 == 0) {
                System.out.println("Fizz");
            }
            if (num % 5 == 0) {
                System.out.println("Buzz");
        }
    }
}
