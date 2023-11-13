import java.util.Scanner;

public class Add2Number {
    public static void main(String[] args) {
        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int first = scanner.nextInt();

        System.out.print("Enter the number 2: ");
        int second = scanner.nextInt();

        int sum = first + second;
        System.out.println("The ans is " + sum);
    }
}
