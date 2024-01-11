import java.util.Scanner;

public class EmployeeInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.next(); 

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = scanner.nextDouble();

        System.out.print("Enter Employee Address: ");
        String employeeAddress = scanner.next(); 

        System.out.print("Enter Employee Contact: ");
        String employeeContact = scanner.next();

        System.out.print("Enter Employee Gender (M/F): ");
        char employeeGender = scanner.next().charAt(0);

        scanner.close();

        System.out.println("\nEmployee Information:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Contact: " + employeeContact);
        System.out.println("Employee Gender: " + employeeGender);
    }
}
