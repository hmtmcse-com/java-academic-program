import java.util.Scanner;

public class ConvertDayToMonth {

    public static void main(String[] args) {
        // Scanner use from take input from user by CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Day/s : ");
        int day = scanner.nextInt();

        int month = day / 30;
        int remainingDay = day - (month * 30);

        System.out.println("Month/s : " + month);
        System.out.println("Day/s : " + remainingDay);
    }
}
