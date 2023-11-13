import java.util.Scanner;

public class Divide2Number {

    public static void main(String[] args) {
        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        float first = scanner.nextFloat();

        System.out.print("Enter number 2 : ");
        float second = scanner.nextFloat();

        float division = first / second;
        System.out.println("The ans is: " + division);
    }
}
