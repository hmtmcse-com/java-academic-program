import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Radius: ");
        float radius = scanner.nextFloat();

        // Formula: A = πr2
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is : " + area);
    }

}
