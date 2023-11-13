import java.util.Scanner;

public class MakeAverage {
    public static void main(String[] args) {

        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Number 1: ");
        float first = scanner.nextFloat();

        System.out.print("Enter The Number 2: ");
        float second = scanner.nextFloat();

        System.out.print("Enter The Number 3: ");
        float third = scanner.nextFloat();

        float avg = (first + second + third) / 3;
        System.out.print("The ans is: " + avg);
    }
}
