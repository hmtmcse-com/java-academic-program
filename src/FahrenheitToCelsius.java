import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit : ");
        float fahrenheit = scanner.nextFloat();

        // Formula : °C = (°F - 32) × 5/9
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in celsius : " + celsius);
    }
}
