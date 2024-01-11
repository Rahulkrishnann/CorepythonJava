import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 5 numbers: ");

        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double num = scanner.nextDouble();
            sum += num;
        }

        scanner.close();

        double average = sum / 5;

        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The Average is: " + average);
    }
}
