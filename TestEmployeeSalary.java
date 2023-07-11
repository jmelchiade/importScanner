import java.util.Scanner;

public class TestEmployeeSalary {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Code\n1 - manager\n2 - hourly worker\n3 - commission worker: ");
        int code = scanner.nextInt();

        System.out.print("Enter gross salary or number of hours worked: ");
        double amount = scanner.nextDouble();

        System.out.print("Years of service: ");
        int hours = scanner.nextInt();

        scanner.close();

        EmployeeSalary e = new EmployeeSalary(code, hours, amount);
        e.calculateSalary();
        System.out.println(e);
    }
}
