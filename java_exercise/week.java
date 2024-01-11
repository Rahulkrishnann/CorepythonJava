import java.util.Scanner;

public class WeekdayNameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number (1-7): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 1 && number <= 7) {
            String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            String weekday = weekdays[number - 1];
            System.out.println(weekday);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
