import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        int greatest = Math.max(num1, Math.max(num2, num3));
        System.out.println("The greatest: " + greatest);
    }
}
