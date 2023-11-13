import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature in Celsius : ");
        float celsius = scanner.nextFloat();

        // Formula: °F = °C × (9/5) + 32
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit : " + fahrenheit);
    }
}
